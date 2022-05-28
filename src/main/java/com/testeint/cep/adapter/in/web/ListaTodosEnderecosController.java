package com.testeint.cep.adapter.in.web;

import com.testeint.cep.adapter.in.web.response.EnderecoResponse;
import com.testeint.cep.application.ListarEnderecosUseCase;
import com.testeint.cep.domain.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/endereco")
public class ListaTodosEnderecosController {
    private final ListarEnderecosUseCase listarEnderecosUseCase;

    @GetMapping
    public ResponseEntity<List<EnderecoResponse>> execute(){
        List<Endereco> enderecos = listarEnderecosUseCase.execute();
        List<EnderecoResponse> response = EnderecoResponse.of(enderecos);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
