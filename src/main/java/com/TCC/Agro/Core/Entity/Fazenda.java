package com.TCC.Agro.Core.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "Fazenda")
@Entity(name = "Fazenda")
@EqualsAndHashCode(of = "IdFazenda")
@NoArgsConstructor
@AllArgsConstructor

public class Fazenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdFazenda;

    @Column(name = "NomeFazenda")
    private String NomeFazenda;

    @Column(name = "IdAnimal")
    private Animal animal;

    @Column(name = "IdProprietario")
    private Proprietario proprietario;

    @Column(name = "IdVeterinario")
    private Veterinario veterinario;

}
