package br.senai.activemq.producer;

import br.senai.activemq.entity.MessageEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    private final JmsTemplate jmsTemplate;

    public ProducerController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @PostMapping(value = "/public", consumes = "application/json")
    public ResponseEntity<String> publishMessage(@RequestBody MessageEntity message) {
        try {
            jmsTemplate.convertAndSend("jms-spring-app", message);
            return new ResponseEntity<>("Enviado com sucesso", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
