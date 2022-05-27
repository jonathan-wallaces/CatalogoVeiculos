package com.testeint.cep.adapter.in.web;

import com.testeint.cep.application.SalvaEnderecoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/endereco")
public class SalvarCepController {
    private final SalvaEnderecoUseCase salvaEnderecoUseCase;

    @PostMapping(path = "/{cep}")
    @ResponseStatus(HttpStatus.OK)
    public void execute(@PathVariable String cep){
        salvaEnderecoUseCase.execute(cep);
    }
}
//https://edermfl.wordpress.com/2017/02/08/aprendendo-springboot-3-enviando-e-mail/