package com.gs3.clientes.dao.repository;

import com.gs3.clientes.dao.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
