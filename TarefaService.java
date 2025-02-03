package br.com.seuprojeto.todolist.service;

import br.com.seuprojeto.todolist.model.Tarefa;
import br.com.seuprojeto.todolist.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    public Tarefa criarTarefa(Tarefa tarefa) {
        tarefa.setDataCriacao(LocalDateTime.now());
        return tarefaRepository.save(tarefa);
    }

    // Outros métodos (atualizar, deletar, etc.)
}
