package com.estudo.listToDo.service;

import com.estudo.listToDo.DTO.TarefaDTO;
import com.estudo.listToDo.entity.Tarefa;
import com.estudo.listToDo.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaServiceImpl implements TarefaService{

    @Autowired
    TarefaRepository tarefaRepository;

    public TarefaDTO salvarTarefa(TarefaDTO tarefaDTO){

        Tarefa tarefas = new Tarefa();

        tarefas.setId(tarefaDTO.getId());
        tarefas.setNome(tarefaDTO.getNome());
        tarefas.setDescricao(tarefaDTO.getDescricao());
        tarefas = tarefaRepository.save(tarefas);

        return new TarefaDTO(tarefas);

    }
}
