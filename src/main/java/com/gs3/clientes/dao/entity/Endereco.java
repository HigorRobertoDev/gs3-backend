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
public class Endereco extends EntityGlobal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_endereco", nullable = false)
    private Long id;

    @Column()
    private String cep;

    @Column()
    private String cidade;

    @Column()
    private String bairro;

    @Column()
    private String logradouro;

    @Column()
    private String complemento;

    @Column()
    private String uf;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(id, endereco.id) && Objects.equals(cep, endereco.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cep);
    }
}
