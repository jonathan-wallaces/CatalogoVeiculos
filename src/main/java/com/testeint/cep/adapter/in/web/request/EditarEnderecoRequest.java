package com.testeint.cep.adapter.in.web.request;

import lombok.Value;

@Value
public class EditarEnderecoRequest{
    Long id;
    String logradouro;
    String complemento;
    String bairro;
    String localidade;
    String uf;
}
