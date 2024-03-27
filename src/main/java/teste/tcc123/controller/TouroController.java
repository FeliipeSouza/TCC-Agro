package teste.tcc123.controller;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import teste.tcc123.domain.touro.DadosCadastroTouro;
import teste.tcc123.domain.touro.DadosDetalhamentoTouro;
import teste.tcc123.domain.touro.Touro;
import teste.tcc123.domain.touro.TouroRepository;

@RestController
@RequestMapping("/touro")
public class TouroController {
    @Autowired
    TouroRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity Cadastrar(@RequestBody DadosCadastroTouro dadosCadastroTouro, UriComponentsBuilder uriBuilder){
        var touro = new Touro(dadosCadastroTouro);
        repository.save(touro);
        var uri = uriBuilder.path("/touro/{id}").buildAndExpand(touro.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoTouro(touro));
    }
}
