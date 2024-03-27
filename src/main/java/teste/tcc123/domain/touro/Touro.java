package teste.tcc123.domain.touro;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Getter;
import teste.tcc123.domain.touro.enums.Status;


@Table(name = "touro")
@Entity(name = "Touro")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Touro {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomefantasia;
    private int quantMaterialGenetico;
    private String nomeFazenda;
    @Enumerated(EnumType.STRING)
    private Status status;

public Touro(DadosCadastroTouro dadosCadastroTouro) {
    this.nomefantasia = dadosCadastroTouro.nomeFantasia();
    this.quantMaterialGenetico = dadosCadastroTouro.quantMaterialGenetico();
    this.nomeFazenda = dadosCadastroTouro.nomeFazenda();
    this.status = Status.ATIVO;
}



}
