package com.example.prova.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "camiseta")
@Getter
@Setter
public class CamisetaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(nullable = false, length = 10)
    private String modelo;
    @Column(nullable = false, length = 10)
    private String cor;
    @Column(nullable = false, length = 50)
    private String descricao;
    @Column(nullable = false, length = 4)
    private int custo;
    @Column(nullable = false, length = 10)
    private String categoria;
    @Column(nullable = false)
    private Boolean disponibilidade;
}
