package br.com.seuprojeto.todolist.repository;

import br.com.seuprojeto.todolist.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
