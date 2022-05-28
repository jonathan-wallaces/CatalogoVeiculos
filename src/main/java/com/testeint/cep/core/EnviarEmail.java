package com.testeint.cep.core;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnviarEmail {
    private final JavaMailSender javaMailSender;

    public void enviar(SimpleMailMessage email){
        javaMailSender.send(email);
    }

}
