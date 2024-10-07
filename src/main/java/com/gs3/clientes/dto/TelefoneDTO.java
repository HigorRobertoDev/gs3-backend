package com.gs3.clientes.dto;

import com.gs3.clientes.enums.TipoTelefoneEnum;
import com.gs3.clientes.validation.ValidadorTelefone;
import lombok.*;

import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ValidadorTelefone
public class TelefoneDTO extends DTO{

    private Long id;
    private Integer tipoTelefoneId;
    private TipoTelefoneEnum tipoTelefone;

    @Size(min = 2, max = 2, message = "Campo ddd deve conter apenas 2 digitos. Exemplo: 99")
    private String ddd;
    private String numero;
    private ClienteDTO clienteDTO;
}
