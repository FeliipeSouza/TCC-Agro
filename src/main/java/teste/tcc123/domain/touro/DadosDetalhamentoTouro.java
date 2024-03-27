package teste.tcc123.domain.touro;

public record DadosDetalhamentoTouro(long id, String nomeFantasia, int quantMaterialGenetico, String nomeFazenda, String status) {
    public DadosDetalhamentoTouro(Touro touro) {
        this(touro.getId(), touro.getNomefantasia(), touro.getQuantMaterialGenetico(), touro.getNomeFazenda(), touro.getStatus().name());
    }
}
