package com.testeint.cep.application.port.out;

import com.testeint.cep.domain.Endereco;

import java.util.List;

public interface EnderecoPort {
    void save(Endereco endereco);

    Endereco findEnderecoById(Long id);

    List<Endereco> findAllEnderecos();

    void deleteEndereco(Endereco endereco);
}
