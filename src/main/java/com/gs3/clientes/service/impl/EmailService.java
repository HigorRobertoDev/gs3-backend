package com.gs3.clientes.service.impl;

import com.gs3.clientes.dao.entity.EmailCliente;
import com.gs3.clientes.dao.repository.EmailRepository;
import com.gs3.clientes.dto.ClienteDTO;
import com.gs3.clientes.dto.EmailDTO;
import com.gs3.clientes.mapper.EmailMapper;
import com.gs3.clientes.service.ServiceGlobal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.NotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmailService implements ServiceGlobal<EmailDTO> {

    @Autowired
    private EmailRepository emailRepository;

    @Override
    public List<EmailDTO> findAll() {
        return null;
    }

    @Override
    public EmailDTO getOne(String id)  {
        return null;
    }

    @Override
    public EmailDTO update(String id, EmailDTO dto) throws NotFoundException {
        return null;
    }

    @Override
    public EmailDTO create(EmailDTO dto) {
        EmailCliente email = emailRepository.save(new EmailMapper().dtoToEntity(dto));
        return new EmailMapper().entityToDTO(email);
    }

    public List<EmailDTO> cadastraEmail(List<EmailDTO> listEmail, ClienteDTO clienteDTO) {
        return listEmail.stream().map(emailDTO -> {
            emailDTO.setClienteDTO(clienteDTO);
            return create(emailDTO);
        }).collect(Collectors.toList());
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<EmailDTO> addAll(List<EmailDTO> listDTO) {
        return null;
    }

}
