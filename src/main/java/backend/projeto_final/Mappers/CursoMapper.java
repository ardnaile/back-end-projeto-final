package backend.projeto_final.Mappers;

import org.springframework.stereotype.Component;

import backend.projeto_final.Dtos.CursoDto;
import backend.projeto_final.Models.Curso;

@Component
public class CursoMapper {

    public Curso toEntity(CursoDto cursoDto){
        Curso objeto = new Curso(
                cursoDto.nomeCurso()
        );
        return objeto;
    }
}
