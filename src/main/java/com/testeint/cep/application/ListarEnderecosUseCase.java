package com.testeint.cep.application;

import com.testeint.cep.application.port.out.EnderecoPort;
import com.testeint.cep.domain.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListarEnderecosUseCase {
    private final EnderecoPort enderecoPort;

    public List<Endereco> execute(){
        List<Endereco> enderecos = enderecoPort.findAllEnderecos();
       if(enderecos.isEmpty()){
           throw new RuntimeException("Não há endereços cadastrados");
       }
        return enderecos;
    }
}
