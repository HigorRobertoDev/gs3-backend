package com.gs3.clientes.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
public enum TipoTransacaoEnum {
    LOGIN(1, "Login"),
    GET(2, "Get cliente"),
    GET_BY_ID(3, "Get by id cliente"),
    POST(4, "Post cliente"),
    PUT(5, "Put cliente"),
    DELETE(6, "Delete cliente");



    private Integer id;
    private String desc;

}
