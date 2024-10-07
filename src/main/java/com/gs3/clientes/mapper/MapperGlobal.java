package com.gs3.clientes.mapper;

import com.gs3.clientes.dao.entity.EntityGlobal;
import com.gs3.clientes.dto.DTO;
import com.gs3.clientes.forms.FormGlobal;

public interface MapperGlobal<T extends EntityGlobal, R extends DTO, S extends FormGlobal> {
    T dtoToEntity(R dto);
    R entityToDTO(T entity);
    S dtoToForm(R dto);

}
