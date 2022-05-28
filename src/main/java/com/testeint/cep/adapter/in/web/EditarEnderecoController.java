package com.testeint.cep.adapter.in.web;

import com.testeint.cep.adapter.in.web.request.EditarEnderecoRequest;
import com.testeint.cep.application.EditarEnderecoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/endereco")
public class EditarEnderecoController {
    private final EditarEnderecoUseCase editarEnderecoUseCase;

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void execute(@RequestBody EditarEnderecoRequest editarEnderecoRequest){
        editarEnderecoUseCase.execute(
                editarEnderecoRequest.getId(),
                editarEnderecoRequest.getLogradouro(),
                editarEnderecoRequest.getComplemento(),
                editarEnderecoRequest.getBairro(),
                editarEnderecoRequest.getLocalidade(),
                editarEnderecoRequest.getUf()
        );
    }
}
