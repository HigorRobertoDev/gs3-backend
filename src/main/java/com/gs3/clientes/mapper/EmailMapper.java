package com.gs3.clientes.mapper;

import com.gs3.clientes.dao.entity.EmailCliente;
import com.gs3.clientes.dto.EmailDTO;
import com.gs3.clientes.forms.EmailForm;

public class EmailMapper implements MapperGlobal<EmailCliente, EmailDTO, EmailForm> {

    @Override
    public EmailCliente dtoToEntity(EmailDTO dto) {
        return EmailCliente.builder()
                .email(dto.getEmail())
                .build();
    }

    @Override
    public EmailDTO entityToDTO(EmailCliente entity) {
        return EmailDTO.builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .build();
    }

    @Override
    public EmailForm dtoToForm(EmailDTO dto) {
        return EmailForm.builder()
                .id(dto.getId())
                .email(dto.getEmail())
                .build();
    }




}
