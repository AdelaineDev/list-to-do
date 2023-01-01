package com.estudo.listToDo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;

    @Column(columnDefinition =  "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createAt;

    @Column(columnDefinition =  "TIMESTAMP WITHOUT TIME ZONE")
    private Instant updateAt;
}
