package com.gs3.clientes.dao.repository;

import com.gs3.clientes.dao.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
