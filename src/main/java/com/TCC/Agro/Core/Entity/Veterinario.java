package com.TCC.Agro.Core.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "Veterinario")
@Entity(name = "Veterinario")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor

public class Veterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome")
    private String Nome;

    @Column(name = "CRMV")
    private String CRMV;

}
