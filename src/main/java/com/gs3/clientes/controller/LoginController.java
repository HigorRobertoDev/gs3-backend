package com.gs3.clientes.controller;

import com.gs3.clientes.dao.entity.Usuario;
import com.gs3.clientes.enums.TipoTransacaoEnum;
import com.gs3.clientes.service.impl.HistoricoService;
import com.gs3.clientes.service.impl.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.AuthenticationException;

@RestController
@RequestMapping("/autenticar-login")
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private HistoricoService historicoService;

    @GetMapping
    @CrossOrigin
    public ResponseEntity<Usuario> login(@RequestParam String user, @RequestParam String pass) throws AuthenticationException {
        Usuario byUserPass = usuarioService.getByUserPass(user, pass);
        historicoService.gravaHistorico(user, TipoTransacaoEnum.LOGIN);
        return new ResponseEntity<>(byUserPass, HttpStatus.OK);
    }
}
