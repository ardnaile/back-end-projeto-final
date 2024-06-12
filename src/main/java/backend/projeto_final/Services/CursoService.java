package backend.projeto_final.Services;

import backend.projeto_final.Models.Curso;
import backend.projeto_final.Repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;

    // retornar todos os cursos
    public List<Curso> retornaTodosCursos() {
        return cursoRepository.findAll();
    }

    // retornar curso pelo id
    public Optional<Curso> getOne(UUID idCurso){
        return cursoRepository.findById(idCurso);
    }

    // salvar novo curso
    public Curso save(Curso novoCurso){
        return cursoRepository.save(novoCurso);
    }

    // deletar curso pelo id
    public Curso delete(UUID idCurso) {
        Curso curso = cursoRepository.findById(idCurso).get();
        cursoRepository.delete(curso);
        return curso;
    }


}
