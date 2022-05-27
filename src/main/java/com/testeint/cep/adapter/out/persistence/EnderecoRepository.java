package com.testeint.cep.adapter.out.persistence;

import com.testeint.cep.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
