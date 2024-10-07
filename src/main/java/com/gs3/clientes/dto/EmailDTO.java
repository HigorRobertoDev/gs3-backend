package com.gs3.clientes.dto;


import lombok.*;

import javax.validation.constraints.Email;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailDTO extends DTO{
    private Long id;
    @Email(message = "Formato de e-mail inválido. Exemplo: xxxx@xxxx.com")
    private String email;
    private ClienteDTO clienteDTO;
}
