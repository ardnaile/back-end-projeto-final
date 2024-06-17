package backend.projeto_final.Mappers;

import backend.projeto_final.Dtos.CursoDto;
import backend.projeto_final.Models.Curso;

public class CursoMapper {

    public Curso toEntity(CursoDto cursoDto){
        Curso objeto = new Curso(
                cursoDto.nomeCurso()
        );
        return objeto;
    }
}
