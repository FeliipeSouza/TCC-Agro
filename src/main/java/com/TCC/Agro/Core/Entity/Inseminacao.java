package com.TCC.Agro.Core.Entity;

import com.TCC.Agro.Core.util.TipoInseminacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.Date;

@Table(name = "Inseminacao")
@Entity(name = "Inseminacao")
@EqualsAndHashCode(of = "IdInseminacao")
@NoArgsConstructor
@AllArgsConstructor

public class Inseminacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdInseminacao;

    @Column(name = "IdAnimal")
    private Animal animal;

    @Column(name = "Inseminada")
    private Boolean Inseminada = false;

    @Column(name = "DataInseminacao")
    private Date DataInseminacao;

    @Column(name = "TipoInseminacao")
    @Enumerated(EnumType.STRING)
    private TipoInseminacao tipoInseminacao;

    @Column(name = "NomeTouro")
    private String NomeTouro;

}
