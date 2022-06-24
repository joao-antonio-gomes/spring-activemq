package br.senai.activemq.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class MessageEntity implements Serializable {
    private String titulo;
    private String nota;
}
