package com.gs3.clientes.controller;

import com.gs3.clientes.dto.ClienteDTO;
import com.gs3.clientes.enums.TipoTransacaoEnum;
import com.gs3.clientes.forms.ClienteForm;
import com.gs3.clientes.mapper.ClienteMapper;
import com.gs3.clientes.service.impl.ClienteService;
import com.gs3.clientes.service.impl.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.ws.rs.BeanParam;
import javax.ws.rs.NotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private HistoricoService historicoService;

    @GetMapping()
    public ResponseEntity<List<ClienteForm>> list(@BeanParam @NotNull(message = "Login Obrigatório") String login) {
        List<ClienteForm> form = clienteService.findAll().stream().map(cliente ->
                new ClienteMapper().dtoToForm(cliente)
        ).collect(Collectors.toList());
        historicoService.gravaHistorico(login, TipoTransacaoEnum.GET);

        return new ResponseEntity<>(form, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<ClienteForm> getOne(@PathVariable String id, @BeanParam @NotNull(message = "Login Obrigatório") String login) {
        ClienteForm clienteForm = new ClienteMapper().dtoToForm(clienteService.getOne(id));
        historicoService.gravaHistorico(login, TipoTransacaoEnum.GET_BY_ID);
        return new ResponseEntity<>(clienteForm, HttpStatus.OK);
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<ClienteForm> create(@Valid @RequestBody ClienteDTO clienteDTO) {
        ClienteDTO retornoCliente = clienteService.create(clienteDTO);
        historicoService.gravaHistorico(clienteDTO.getLogin(), TipoTransacaoEnum.POST);
        return new ResponseEntity<>(new ClienteMapper().dtoToForm(retornoCliente), HttpStatus.CREATED);
    }

    @PutMapping("/alterar/{id}")
    @Transactional
    public ResponseEntity<ClienteForm> update(@PathVariable String id, @Valid @RequestBody ClienteDTO clienteDTO) throws NotFoundException {
        ClienteDTO retornoCliente = clienteService.update(id, clienteDTO);
        historicoService.gravaHistorico(clienteDTO.getLogin(), TipoTransacaoEnum.PUT);
        return new ResponseEntity<>(new ClienteMapper().dtoToForm(retornoCliente), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/deletar/{id}")
    @Transactional
    public ResponseEntity<ClienteForm> delete(@PathVariable String id, @NotNull @NotBlank @RequestBody String login) throws NotFoundException {
        clienteService.delete(id);
        historicoService.gravaHistorico(login, TipoTransacaoEnum.DELETE);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }
}
