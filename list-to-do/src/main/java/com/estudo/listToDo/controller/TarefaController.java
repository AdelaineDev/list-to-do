package com.estudo.listToDo.controller;

import com.estudo.listToDo.DTO.TarefaDTO;
import com.estudo.listToDo.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    @Autowired
    TarefaService tarefaService;

    @PostMapping
    public ResponseEntity<TarefaDTO> salvarTarefa(@RequestBody TarefaDTO tarefaDTO){

        tarefaService.salvarTarefa(tarefaDTO).getId();
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
        return  ResponseEntity.created(uri).body(tarefaDTO);
    }
}
