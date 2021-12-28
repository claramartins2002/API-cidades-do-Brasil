package com.estudos.Apicidades.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data @Table(name = "Estado") @Entity
public class Estados {
    public Estados(Long codigo_estado, String sigla, String nome) {
        this.codigo_estado = codigo_estado;
        this.sigla = sigla;
        this.nome = nome;
    }

    public Estados() {
    }

    @Id
    private Long codigo_estado;
    private String sigla;
    private String nome;
}
