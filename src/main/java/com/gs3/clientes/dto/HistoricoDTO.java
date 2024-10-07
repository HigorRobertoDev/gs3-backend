package com.gs3.clientes.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HistoricoDTO {
    private LocalDateTime date;
    private String usuario;
}
