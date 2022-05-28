package com.testeint.cep.adapter.in.web.response;

import com.testeint.cep.domain.Endereco;
import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class EnderecoResponse {
    Long id;
    String logradouro;
    String complemento;
    String bairro;
    String localidade;
    String uf;

    public static List<EnderecoResponse> of(List<Endereco> enderecoList){
        return enderecoList.stream()
                .map(EnderecoResponse::of)
                .collect(Collectors.toList());
    }

    public static EnderecoResponse of(Endereco endereco){
        return new EnderecoResponse(
            endereco.getId(),
            endereco.getLogradouro(),
            endereco.getComplemento(),
            endereco.getBairro(),
            endereco.getLocalidade(),
            endereco.getUf()
        );
    }
}
