package com.gs3.clientes.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HistoricoTransacao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_transacao", nullable = false)
    private Long id_transacao;

    @Column()
    private LocalDateTime data;

    @Column()
    private String usuario;

    @Column
    private String tipoTransacao;

}
