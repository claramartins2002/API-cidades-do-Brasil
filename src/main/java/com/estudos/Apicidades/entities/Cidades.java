package com.estudos.Apicidades.entities;

import lombok.Data;

import javax.persistence.*;

@Data @Entity @Table(name = "cidade")
public class Cidades {
    @Id
    private Long codigo_cidade;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "codigo_estado")
    private Estados codigo_estado;
}
