package backend.projeto_final.Mappers;

import backend.projeto_final.Dtos.EstudanteDto;
import backend.projeto_final.Models.Estudante;
import backend.projeto_final.Models.Usuario;
import backend.projeto_final.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.NoSuchElementException;

@Component
public class EstudanteMapper {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Estudante toEntity(EstudanteDto estudanteDto){
        Usuario usuario = usuarioRepository.findById(estudanteDto.id()).orElseThrow(() -> new NoSuchElementException("Usuário não encontrado"));
        Estudante objeto = new Estudante(
                estudanteDto.nome(),
                estudanteDto.contato(),
                estudanteDto.temaPreferido(),
                usuario
        );
        return objeto;
    }
}
