package com.testeint.cep.adapter.in.web;

import com.testeint.cep.application.SalvaEnderecoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/endereco")
public class SalvarEnderecoController {
    private final SalvaEnderecoUseCase salvaEnderecoUseCase;

    @PostMapping(path = "/{cep}")
    @ResponseStatus(HttpStatus.OK)
    public void execute(@PathVariable String cep){
        salvaEnderecoUseCase.execute(cep);
    }
}