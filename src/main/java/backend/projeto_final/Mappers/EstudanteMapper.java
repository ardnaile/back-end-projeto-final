package backend.projeto_final.Mappers;

import backend.projeto_final.Dtos.EstudanteDto;
import backend.projeto_final.Models.Estudante;
import org.springframework.stereotype.Component;

@Component
public class EstudanteMapper {

    public Estudante toEntity(EstudanteDto estudanteDto){
        Estudante objeto = new Estudante(
                estudanteDto.nome(),
                estudanteDto.contato()
        );
        return objeto;
    }
}
