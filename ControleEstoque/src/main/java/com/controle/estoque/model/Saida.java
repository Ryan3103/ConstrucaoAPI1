package com.controle.estoque.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Saida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Produto produto;

    private Integer quantidadeSaida;
}
