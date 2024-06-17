package backend.projeto_final.Mappers;

import backend.projeto_final.Dtos.ProjetoDto;
import backend.projeto_final.Models.Projeto;

public class ProjetoMapper {

    public Projeto toEntity(ProjetoDto projetoDto){
        Projeto objeto = new Projeto(
                projetoDto.tema(),
                projetoDto.curso()
        );
        return objeto;
    }
}
