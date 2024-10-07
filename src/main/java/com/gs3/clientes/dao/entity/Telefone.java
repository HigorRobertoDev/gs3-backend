package com.gs3.clientes.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Telefone extends EntityGlobal{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_telefone", nullable = false)
    private Long id;

    @Column()
    private String ddd;

    @Column()
    private String numero;

    @ManyToOne()
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column
    private Integer tipoTelefone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return Objects.equals(id, telefone.id) && Objects.equals(ddd, telefone.ddd) && Objects.equals(numero, telefone.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ddd, numero);
    }


}
