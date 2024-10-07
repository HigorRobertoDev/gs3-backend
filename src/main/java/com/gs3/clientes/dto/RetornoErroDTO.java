package com.gs3.clientes.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@AllArgsConstructor
public class RetornoErroDTO {

    private int codigo;
    private String erro;
    private List<String> erroList;

    public RetornoErroDTO(int codigo, String erro){
        this.codigo = codigo;
        this.erro = erro;
    }

    public RetornoErroDTO(int codigo, List<String> erroList) {
        this.codigo = codigo;
        this.erroList = erroList;
    }
}
