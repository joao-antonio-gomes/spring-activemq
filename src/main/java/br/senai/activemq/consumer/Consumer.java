package br.senai.activemq.consumer;

import br.senai.activemq.entity.MessageEntity;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
//qual diff do component pro bean?
public class Consumer {
    @JmsListener(destination = "jms-spring-app")
    public void messageListener(MessageEntity message) {
        System.out.println("Recebido: " + message.getTitulo() + " - " + message.getNota());
    }
}
