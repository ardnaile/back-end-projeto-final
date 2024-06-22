package backend.projeto_final.Dtos;

import backend.projeto_final.Enum.UsuarioEnum;
import jakarta.validation.constraints.NotNull;

public record RegistroDto(@NotNull String email, @NotNull String password, @NotNull UsuarioEnum role ) {
}
