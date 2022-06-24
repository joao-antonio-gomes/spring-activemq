package br.senai.activemq.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MessageEntity {
    private String titulo;
    private String nota;
}
