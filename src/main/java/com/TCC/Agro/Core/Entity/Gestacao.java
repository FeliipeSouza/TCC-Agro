package com.TCC.Agro.Core.Entity;

import com.TCC.Agro.Core.util.StatusGravidez;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "Gestacao")
@Entity(name = "Gestacao")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor

public class Gestacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "idInseminacao")
    private Inseminacao inseminacao;

    @Column(name = "DataPrevistaParto")
    private Date DataPrevistaParto;

    @Column(name = "DataParto")
    private Date DataParto;

    @Enumerated(EnumType.STRING)
    @Column(name = "StatusGravidez")
    private StatusGravidez statusGravidez;

    @Column(name = "TempoLeiteiro")
    private Integer TempoLeiteiro;

    @Column(name = "Observacoes")
    private String Observacoes;

}
