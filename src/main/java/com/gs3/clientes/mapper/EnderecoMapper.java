package com.gs3.clientes.mapper;

import com.gs3.clientes.dao.entity.Endereco;
import com.gs3.clientes.dto.EnderecoDTO;
import com.gs3.clientes.forms.EnderecoForm;

public class EnderecoMapper implements MapperGlobal<Endereco, EnderecoDTO, EnderecoForm> {

    @Override
    public Endereco dtoToEntity(EnderecoDTO dto) {
        return Endereco.builder()
                .bairro(dto.getBairro())
                .cep(dto.getCep())
                .cidade(dto.getCidade())
                .complemento(dto.getComplemento())
                .logradouro(dto.getLogradouro())
                .uf(dto.getUf())
                .build();
    }

    @Override
    public EnderecoDTO entityToDTO(Endereco entity) {
        return EnderecoDTO.builder()
                .id(entity.getId())
                .bairro(entity.getBairro())
                .cep(entity.getCep())
                .cidade(entity.getCidade())
                .complemento(entity.getComplemento())
                .logradouro(entity.getLogradouro())
                .uf(entity.getUf())
                .build();
    }

    @Override
    public EnderecoForm dtoToForm(EnderecoDTO dto) {
        return EnderecoForm.builder()
                .id(dto.getId())
                .bairro(dto.getBairro())
                .cep(dto.getCep())
                .cidade(dto.getCidade())
                .complemento(dto.getComplemento())
                .logradouro(dto.getLogradouro())
                .uf(dto.getUf())
                .build();
    }


}
