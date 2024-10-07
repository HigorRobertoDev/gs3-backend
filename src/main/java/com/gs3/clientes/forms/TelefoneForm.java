package com.gs3.clientes.forms;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelefoneForm extends FormGlobal{
    private Long id;
    private String ddd;
    private String numero;
    private Integer tipoTelefoneId;
}
