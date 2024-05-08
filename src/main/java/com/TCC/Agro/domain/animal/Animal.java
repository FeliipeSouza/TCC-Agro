package com.TCC.Agro.domain.animal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "animal")
@Entity(name = "Animal")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "IdAnimal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdAnimal;

    private Long IdProprietario;

    private String NomeFantasia;
    private String NomeNumeracao;
    private String Raca;
    private String Observacao;
    private Integer Parto;

    private Boolean ativo;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    public Animal(DadosCadastroAnimal dados) {
        this.ativo = true;
        this.IdAnimal = dados.IdProprietario();
        this.NomeFantasia = dados.NomeFantasia();
        this.NomeNumeracao = dados.NomeNumeracao();
        this.Raca = dados.Raca();
        this.Observacao = dados.Observacao();
        this.Parto = dados.Parto();
        this.estado = dados.estado();
    }

}