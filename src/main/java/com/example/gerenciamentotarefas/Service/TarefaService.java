package com.example.gerenciamentotarefas.Service;

import com.example.gerenciamentotarefas.Entity.Tarefa;
import com.example.gerenciamentotarefas.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TarefaService {
    @Autowired
    TarefaRepository tarefaRepository;

    public Tarefa salvaTarefa(Tarefa tarefa) {
        return tarefaRepository.salvaTarefa(tarefa);
    }

    public Tarefa atualizarTarefa(Tarefa tarefa, int id) {
        Tarefa tarefa1 = new Tarefa();
        if (tarefa1 == null) {
            return null;
        } else
            tarefa1.setId(id);
        tarefaRepository.deletaTarefa(tarefa1);
        tarefaRepository.salvaTarefa(tarefa);
        return tarefa;
    }

    public List<Tarefa> listaTarefas() {
        return tarefaRepository.listaDeTarefas();
    }

    public Tarefa tarefaPorId(int id) {
        return tarefaRepository.tarefaId(id);
    }


}
