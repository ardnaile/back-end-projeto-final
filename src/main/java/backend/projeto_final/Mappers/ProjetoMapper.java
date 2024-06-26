package backend.projeto_final.Mappers;

import org.springframework.stereotype.Component;

import backend.projeto_final.Dtos.ProjetoDto;
import backend.projeto_final.Models.Projeto;

@Component
public class ProjetoMapper {

    public Projeto toEntity(ProjetoDto projetoDto){
        Projeto objeto = new Projeto(
                projetoDto.tema(),
                projetoDto.curso()
        );
        return objeto;
    }
}
