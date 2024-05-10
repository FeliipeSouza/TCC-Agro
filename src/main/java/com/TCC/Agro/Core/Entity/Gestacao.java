package com.TCC.Agro.Core.Entity;

import com.TCC.Agro.Core.util.Status_Gravidez;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
@Table(name = "gestacao")
@Entity(name = "Gestacao")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "ID_Gestacao")
public class Gestacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Gestacao;
    @ManyToOne
    private Inseminacao inseminacao;
    private Date Data_Prevista_Parto;
    private Date Data_Parto;
    @Enumerated
    private Status_Gravidez statusGravidez;
    private String Observacoes;


    public Gestacao(Long ID_Gestacao, Inseminacao inseminacao, Date data_Prevista_Parto,
                    Date data_Parto, Status_Gravidez statusGravidez,
                    String observacoes) {
        this.ID_Gestacao = ID_Gestacao;
        this.inseminacao = inseminacao;
        Data_Prevista_Parto = data_Prevista_Parto;
        Data_Parto = data_Parto;
        this.statusGravidez = statusGravidez;
        Observacoes = observacoes;
    }
}
