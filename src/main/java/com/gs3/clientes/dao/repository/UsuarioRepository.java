package com.gs3.clientes.dao.repository;

import com.gs3.clientes.dao.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findUsuarioByUsuarioAndSenha(String usuario, String senha);
}
