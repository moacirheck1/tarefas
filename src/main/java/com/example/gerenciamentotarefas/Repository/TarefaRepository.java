package com.example.gerenciamentotarefas.Repository;

import com.example.gerenciamentotarefas.Entity.Tarefa;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TarefaRepository {
    List<Tarefa> listaTarefeas = new ArrayList<>();

    public List<Tarefa> listaDeTarefas() {
        return listaTarefeas;
    }

    public TarefaRepository() {
        // listaTarefea
    }

    public Tarefa tarefaId(@PathVariable int id) {
        for (Tarefa n : listaTarefeas) {
            if (n.getId() == id) {
                return n;
            }
        }
        return new Tarefa();
    }

    public Tarefa salvaTarefa(Tarefa tarefa) {
        listaTarefeas.add(tarefa);
        return tarefa;
    }

    public Tarefa deletaTarefa(Tarefa tarefa) {
        listaTarefeas.remove(tarefa);
        return tarefa;
    }
}
