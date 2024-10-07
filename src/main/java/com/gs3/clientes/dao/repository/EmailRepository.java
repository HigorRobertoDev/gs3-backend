package com.gs3.clientes.dao.repository;

import com.gs3.clientes.dao.entity.EmailCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailCliente, Long> {

}
