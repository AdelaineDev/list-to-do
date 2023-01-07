package com.estudo.listtodo.service;

import com.estudo.listToDo.DTO.TarefaDTO;
import com.estudo.listToDo.entity.Tarefa;
import com.estudo.listToDo.repository.TarefaRepository;
import com.estudo.listToDo.service.TarefaServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class TarefaServiceTest {

   @Autowired
    private TarefaServiceImpl tarefaService;

    @MockBean
    TarefaRepository tarefaRepository;

    @Test
    public void DeveTestarSeEstarSalvandoUmaTarefaComSucesso(){

        Tarefa tarefa = new Tarefa();
        tarefa.setId(1L);
        tarefa.setNome("Limpar XYZ");

        Mockito.when(tarefaRepository.save(tarefa)).thenReturn(tarefa);

        TarefaDTO tarefaDTO = new TarefaDTO();
        tarefaDTO.setId(1L);
        tarefaDTO.setNome("Limpar XYZ");

        tarefaService.salvarTarefa(tarefaDTO);

        assertThat(tarefa.getId()).isEqualTo(tarefaDTO.getId());
        assertThat(tarefa.getNome()).isEqualTo(tarefaDTO.getNome());


       // verify(tarefaRepository.save(tarefa));



    }
}
