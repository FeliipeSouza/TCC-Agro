package com.TCC.Agro.Core.Entity;

import com.TCC.Agro.Core.util.Tipo_Inseminacao;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
@Table(name = "inseminacao")
@Entity(name = "Inseminacao")
@NoArgsConstructor
@EqualsAndHashCode(of = "ID_Inseminacao")
@Getter
public class Inseminacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Inseminacao;

    @ManyToOne
    private Animal animal;

    private Date Data_inseminacao;

    @Enumerated(EnumType.STRING)
    private Tipo_Inseminacao tipoInseminacao;

    private String Nome_Touro;

    public Inseminacao(Long ID_Inseminacao, Animal animal,
                       Date data_inseminacao,
                       Tipo_Inseminacao tipoInseminacao, String nome_Touro) {
        this.ID_Inseminacao = ID_Inseminacao;
        this.animal = animal;
        Data_inseminacao = data_inseminacao;
        this.tipoInseminacao = tipoInseminacao;
        Nome_Touro = nome_Touro;
    }

}
