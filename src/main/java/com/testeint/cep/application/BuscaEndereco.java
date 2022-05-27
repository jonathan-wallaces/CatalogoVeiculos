package com.testeint.cep.application;

import com.testeint.cep.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws",value = "cep")
public interface BuscaEndereco {

    @GetMapping("/{cep}/json")
    Endereco buscaEnderecoPorCep(@PathVariable("cep") String cep);

}
