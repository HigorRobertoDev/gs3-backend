package com.gs3.clientes.mapper;

import com.gs3.clientes.dao.entity.Telefone;
import com.gs3.clientes.dto.TelefoneDTO;
import com.gs3.clientes.enums.TipoTelefoneEnum;
import com.gs3.clientes.forms.TelefoneForm;

public class TelefoneMapper implements MapperGlobal<Telefone, TelefoneDTO, TelefoneForm> {

    @Override
    public Telefone dtoToEntity(TelefoneDTO dto) {
        return Telefone.builder()
                .ddd(dto.getDdd())
                .numero(dto.getNumero())
                .tipoTelefone(dto.getTipoTelefoneId())
                .build();
    }

    @Override
    public TelefoneDTO entityToDTO(Telefone entity) {
        return TelefoneDTO.builder()
                .id(entity.getId())
                .ddd(entity.getDdd())
                .numero(entity.getNumero())
                .tipoTelefone(TipoTelefoneEnum.valueOfById(entity.getTipoTelefone()))
                .build();
    }

    @Override
    public TelefoneForm dtoToForm(TelefoneDTO dto) {
        return TelefoneForm.builder()
                .id(dto.getId())
                .ddd(dto.getDdd())
                .numero(dto.getNumero())
                .tipoTelefoneId(dto.getTipoTelefone().getId())
                .build();
    }

}
