package com.estudo.listToDo.DTO;

import com.estudo.listToDo.entity.Tarefa;
import lombok.*;

@Getter
@Setter
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
