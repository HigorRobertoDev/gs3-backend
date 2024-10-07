package com.gs3.clientes.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.NUMBER)
public enum TipoTelefoneEnum {
    RESIDENCIAL(1, 8, "Residencial"),
    COMERCIAL(2, 8, "Comercial"),
    CELULAR(3, 9, "Celular");

    private Integer id;

    @NotNull(message = "Tipo telefone obrigatorio")
    private Integer quantidadeDigitos;
    private String desc;

    private static Map<Integer, TipoTelefoneEnum> indicePorID = new HashMap<>(
            TipoTelefoneEnum.values().length);

    public static TipoTelefoneEnum valueOfById(Integer id) {
        if (id != null) {
            if (indicePorID.containsKey(id)) {
                return indicePorID.get(id);
            }
            for (TipoTelefoneEnum status : values()) {
                if (id.equals(status.getId())) {
                    indicePorID.put(id, status);
                    return status;
                }
            }
        }
        return null;
    }
}
