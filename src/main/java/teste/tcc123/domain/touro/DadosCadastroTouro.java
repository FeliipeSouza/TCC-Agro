package teste.tcc123.domain.touro;


import teste.tcc123.domain.touro.enums.Status;

public record DadosCadastroTouro (

    String nomeFantasia,
    int quantMaterialGenetico,
    String nomeFazenda,
    Status status

    ){

}
