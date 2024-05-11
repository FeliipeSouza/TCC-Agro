package com.TCC.Agro.Core.Entity;

import com.TCC.Agro.Core.util.EstadoAnimal;
import com.TCC.Agro.Core.util.Raca;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.Date;

@Table(name = "Animal")
@Entity(name = "Animal")
@EqualsAndHashCode(of = "IdAnimal")
@NoArgsConstructor
@AllArgsConstructor

public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdAnimal;

    @Column(name = "Idfazenda")
    private Fazenda fazenda;

    @Column(name = "NomeFantasia")
    private String NomeFantasia;

    @Column(name = "NomeNumeracao")
    private String NomeNumeracao;

    @Column(name = "DataNascimento")
    private Date DataNascimento;

    @Column(name = "QuantidadeLactacao")
    private Integer QuantidadeLactacao;

    @Column(name = "idGestacao")
    private Gestacao gestacao;

    @Column(name = "Raca")
    @Enumerated(EnumType.STRING)
    private Raca raca;

    @Column(name = "Status")
    @Enumerated(EnumType.STRING)
    private EstadoAnimal estadoAnimal;

    @Column(name = "Observacao")
    private String Observacao;

    @Column(name = "Veterinario")
    private Veterinario veterinario;
}