package backend.projeto_final.Dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record EstudanteDto(
        @NotEmpty(message = "O nome não pode ser vazio")
        String nome,
        @NotNull (message = "O contato não pode ser nulo")
        @Size(min = 11, max = 11, message = "O contato deve ter 11 caracteres sem espaço (ddd + número)")
        String contato) {}
