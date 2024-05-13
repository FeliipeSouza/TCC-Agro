package com.TCC.Agro.Core.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "Proprietario")
@Entity(name = "Proprietario")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor

public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome")
    private String Nome;

    @Column(name = "CPF")
    private String CPF;

}