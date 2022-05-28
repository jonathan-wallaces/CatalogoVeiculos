package com.testeint.cep.adapter.in.web;

import com.testeint.cep.application.DeletarEnderecoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/endereco")
public class DeletarEnderecoController {
    private final DeletarEnderecoUseCase deletarEnderecoUseCase;

    @DeleteMapping(path = "/{id}")
    public void execute(@PathVariable Long id){
        deletarEnderecoUseCase.execute(id);
    }
}
