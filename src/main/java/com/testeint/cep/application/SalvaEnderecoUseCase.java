package com.testeint.cep.application;

import com.testeint.cep.application.port.out.EnderecoPort;
import com.testeint.cep.domain.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SalvaEnderecoUseCase {
    private final EnderecoPort enderecoPort;
    private final BuscaEndereco buscaEndereco;

    public void execute(String cep){
        Endereco end = buscaEndereco.buscaEnderecoPorCep(cep);
        Endereco endereco = new Endereco(
                end.getCep(),
                end.getLogradouro(),
                end.getComplemento(),
                end.getBairro(),
                end.getLocalidade(),
                end.getUf()
                );
        enderecoPort.save(endereco);
    }
}
