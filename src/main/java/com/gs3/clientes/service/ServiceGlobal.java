package com.gs3.clientes.service;

import com.gs3.clientes.dto.DTO;

import java.util.List;

public interface ServiceGlobal<T extends DTO> {
    List<T> findAll();
    T getOne(String id);
    T update(String id, T dto);
    T create(T dto);
    void delete(String id);
    List<T> addAll(List<T> listDTO);
}
