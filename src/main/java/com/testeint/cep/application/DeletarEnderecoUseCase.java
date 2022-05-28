package com.testeint.cep.application;

import com.testeint.cep.application.port.out.EnderecoPort;
import com.testeint.cep.domain.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class DeletarEnderecoUseCase {
    private final EnderecoPort enderecoPort;

    @Transactional
    public void execute(Long id){
        Endereco endereco = enderecoPort.findEnderecoById(id);
        enderecoPort.deleteEndereco(endereco);
    }
}
