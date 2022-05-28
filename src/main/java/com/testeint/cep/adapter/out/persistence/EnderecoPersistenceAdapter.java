package com.testeint.cep.adapter.out.persistence;

import com.testeint.cep.application.port.out.EnderecoPort;
import com.testeint.cep.domain.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EnderecoPersistenceAdapter implements EnderecoPort {
    private final EnderecoRepository enderecoRepository;
    @Override
    public void save(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    @Override
    public Endereco findEnderecoById(Long id) {
        return enderecoRepository.findById(id).orElseThrow(()->new RuntimeException("Endereço não encontrado!"));
    }

    @Override
    public List<Endereco> findAllEnderecos() {
        return enderecoRepository.findAll();
    }

    @Override
    public void deleteEndereco(Endereco endereco) {
        enderecoRepository.delete(endereco);
    }
}
