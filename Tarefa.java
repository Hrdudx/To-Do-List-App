package br.com.seuprojeto.todolist.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID da tarefa", example = "1")
    private Long id;

    @Schema(description = "Título da tarefa", example = "Fazer compras")
    private String titulo;

    @Schema(description = "Descrição da tarefa", example = "Comprar leite, pão e ovos")
    private String descricao;

    @Schema(description = "Status da tarefa", example = "false")
    private boolean concluida;

    @Schema(description = "Data de criação", example = "2024-05-16T10:00:00")
    private LocalDateTime dataCriacao;

}
