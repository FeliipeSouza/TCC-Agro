package com.TCC.Agro.domain.animal;

public record DadosCadastroAnimal(
        Long IdProprietario,
        String NomeFantasia,
        String NomeNumeracao,
        String Raca,
        String Observacao,
        Integer Parto,
        Estado estado
) {}
