package com.gs3.clientes.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoDTO extends DTO {

    private Long id;

    @Size(max = 8, min = 8, message = "O campo CEP deve ter 8 digitos")
    private String cep;

    @NotNull(message = "O logradouro cidade não pode ser nulo")
    @NotBlank(message = "O logradouro cidade não pode estar em branco")
    private String logradouro;

    @NotNull(message = "O campo bairro não pode ser nulo")
    @NotBlank(message = "O campo bairro não pode estar em branco")
    private String bairro;

    @NotNull(message = "O campo cidade não pode ser nulo")
    @NotBlank(message = "O campo cidade não pode estar em branco")
    private String cidade;

    @Size(min = 2, max = 2, message = "O campo UF deve conter apenas 2 caracteres")
    private String uf;

    private String complemento;
}
