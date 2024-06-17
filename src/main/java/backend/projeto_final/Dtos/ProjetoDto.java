package backend.projeto_final.Dtos;

import backend.projeto_final.Models.Curso;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record ProjetoDto(
        @NotEmpty(message = "O tema não pode ser vazio")
        String tema,
        @NotNull(message = "Você deve informar de qual curso é o projeto")
        Curso curso) {}
