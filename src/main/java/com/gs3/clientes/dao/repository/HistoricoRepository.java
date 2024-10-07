package com.gs3.clientes.dao.repository;

import com.gs3.clientes.dao.entity.HistoricoTransacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoRepository extends JpaRepository<HistoricoTransacao, Long> {

}
