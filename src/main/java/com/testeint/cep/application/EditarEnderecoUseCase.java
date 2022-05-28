package com.testeint.cep.application;

import com.testeint.cep.application.port.out.EnderecoPort;
import com.testeint.cep.core.EnviarEmail;
import com.testeint.cep.domain.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditarEnderecoUseCase {
    private final EnderecoPort enderecoPort;
    private final EnviarEmail enviarEmail;

    public void execute(Long id,
                        String logradouro,
                        String complemento,
                        String bairro,
                        String localidade,
                        String uf){
        Endereco endereco = enderecoPort.findEnderecoById(id);
        endereco.editaEndereco(logradouro, complemento, bairro, localidade, uf);
        enderecoPort.save(endereco);


        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo("wallace97@outlook.com");
        email.setSubject("ESTE – CEP - Seleção DEV Java - Jonathan");
        email.setText(String.valueOf(endereco));

        enviarEmail.enviar(email);
    }
}
