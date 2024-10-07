package com.gs3.clientes.service.impl;

import com.gs3.clientes.dao.repository.TelefoneRepository;
import com.gs3.clientes.dto.TelefoneDTO;
import com.gs3.clientes.service.ServiceGlobal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.NotFoundException;
import java.util.List;

@Service
public class TelefoneService implements ServiceGlobal<TelefoneDTO> {

    @Autowired
    private TelefoneRepository telefoneRepository;

    @Override
    public List<TelefoneDTO> findAll() {
        return null;
    }

    @Override
    public TelefoneDTO getOne(String id)  {
        return null;
    }

    @Override
    public TelefoneDTO update(String id, TelefoneDTO dto) throws NotFoundException {
        return null;
    }

    @Override
    public TelefoneDTO create(TelefoneDTO dto) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<TelefoneDTO> addAll(List<TelefoneDTO> listDTO) {
        return null;
    }


}
