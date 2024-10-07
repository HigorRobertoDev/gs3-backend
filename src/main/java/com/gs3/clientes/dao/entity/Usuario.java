package com.gs3.clientes.dao.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario extends EntityGlobal{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_usuario", nullable = false)
    private Long id;

    @Column
    private String usuario;

    @Column
    private String senha;

    @ManyToOne
    @JoinColumn(name = "id_perfil")
    private Perfil perfil;

}
