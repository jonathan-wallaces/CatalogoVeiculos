package com.testeint.cep.adapter.out.persistence;

import com.testeint.cep.application.port.out.EnderecoPort;
import com.testeint.cep.domain.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnderecoPersistenceAdapter implements EnderecoPort {
    private final EnderecoRepository enderecoRepository;
    @Override
    public void save(Endereco endereco) {
        enderecoRepository.save(endereco);
    }
}
