package com.testeint.cep.application;

import com.testeint.cep.application.port.out.EnderecoPort;
import com.testeint.cep.core.EnviarEmail;
import com.testeint.cep.domain.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SalvaEnderecoUseCase {
    private final EnderecoPort enderecoPort;
    private final BuscaEndereco buscaEndereco;
    private final EnviarEmail enviarEmail;

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

        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo("contato@integralys.com.br");
        email.setSubject("TESTE – CEP - Seleção DEV Java - <Jonathan_Wallace>");
        email.setText(String.valueOf(endereco));

        enviarEmail.enviar(email);
    }
}
