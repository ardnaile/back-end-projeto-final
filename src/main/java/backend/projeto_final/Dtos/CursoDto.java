package backend.projeto_final.Dtos;

import jakarta.validation.constraints.NotEmpty;

public record CursoDto(
        @NotEmpty(message = "O nome do curso não pode ser vazio")
        String nomeCurso) {}
