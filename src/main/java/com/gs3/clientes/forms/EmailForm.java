package com.gs3.clientes.forms;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmailForm extends FormGlobal {
    private Long id;
    private String email;
}
