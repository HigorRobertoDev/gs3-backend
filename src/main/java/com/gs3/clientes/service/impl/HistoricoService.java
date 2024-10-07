package com.gs3.clientes.service.impl;

import com.gs3.clientes.dao.entity.HistoricoTransacao;
import com.gs3.clientes.dao.repository.HistoricoRepository;
import com.gs3.clientes.enums.TipoTransacaoEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class HistoricoService {

    @Autowired
    private HistoricoRepository historicoRepository;

    public void gravaHistorico(String login, TipoTransacaoEnum tipo) {
        HistoricoTransacao historico = new HistoricoTransacao();
        historico.setData(LocalDateTime.now());
        historico.setUsuario(login);
        historico.setTipoTransacao(tipo.getDesc());
        historicoRepository.save(historico);
    }
}
