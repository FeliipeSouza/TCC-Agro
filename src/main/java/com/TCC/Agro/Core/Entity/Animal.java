package com.TCC.Agro.Core.Entity;

import com.TCC.Agro.Core.util.EstadoAnimal;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "animal")
@Entity(name = "Animal")
@Getter
@EqualsAndHashCode(of = "IdAnimal")
@NoArgsConstructor
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdAnimal;
    @Column(name = "Idfazenda")
    private Long Idfazenda;
    @Column(name = "IdUsuario")
    private String NomeFantasia;

    private String NomeNumeracao;

    private String Raca;

    private String Observacao;

//    private Parto parto;

    private Date dataPrevistaParto;

    private Boolean ativo;

    @Enumerated(EnumType.STRING)
    private EstadoAnimal estado;

}