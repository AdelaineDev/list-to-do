package com.estudo.listToDo.DTO;

import com.estudo.listToDo.entity.Tarefa;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TarefaDTO {

    private Long id;
    private String nome;
    private String descricao;


    public TarefaDTO(Tarefa tarefas) {
    }
}
