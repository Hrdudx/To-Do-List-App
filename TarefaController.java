package br.com.seuprojeto.todolist.controller;

import br.com.seuprojeto.todolist.model.Tarefa;
import br.com.seuprojeto.todolist.service.TarefaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    @Operation(summary = "Listar todas as tarefas")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Tarefas encontradas"),
        @ApiResponse(responseCode = "404", description = "Tarefas não encontradas")
    })
    public List<Tarefa> listarTarefas() {
        return tarefaService.listarTarefas();
    }

    @PostMapping
    @Operation(summary = "Criar uma nova tarefa")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Tarefa criada com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos")
    })
    public ResponseEntity<Tarefa> criarTarefa(@RequestBody Tarefa tarefa) {
        Tarefa novaTarefa = tarefaService.criarTarefa(tarefa);
        return new ResponseEntity<>(novaTarefa, HttpStatus.CREATED);
    }

    // Outros métodos (atualizar, deletar, etc.)
}
