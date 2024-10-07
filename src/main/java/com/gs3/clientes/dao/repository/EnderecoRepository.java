package com.gs3.clientes.dao.repository;

import com.gs3.clientes.dao.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    Endereco getByCep(String cep);
}
