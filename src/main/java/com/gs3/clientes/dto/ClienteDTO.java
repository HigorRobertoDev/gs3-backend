package com.gs3.clientes.dto;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteDTO extends DTO{

    @NotNull(message = "Login obrigatório")
    private String login;

    private Long id;

    @Size(min = 3, max = 100, message = "Campo nome deve ter no mínimo 3 e no máximo 100 caracteres")
    private String nome;

    @Size(min = 11, max=11, message = "Campo CPF deve ter o tamanho igual a 11")
    @CPF
    private String cpf;

    @Valid
    @NotNull(message = "Endereço obrigatório")
    private EnderecoDTO endereco;

    @Valid
    @NotEmpty(message = "Deve conter pelo menos um e-mail")
    private List<EmailDTO> emails;

    @Valid
    @NotEmpty(message = "Deve conter pelo menos um telefone")
    private List<TelefoneDTO> telefones;
}
