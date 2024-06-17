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

    // ver todos os cursos
    public List<Curso> verTodosCursos() {
        return cursoRepository.findAll();
    }

    // retornar curso pelo id
    public Optional<Curso> verCurso(UUID idCurso){
        return cursoRepository.findById(idCurso);
    }

    // salvar novo curso
    public Curso salvarCurso(Curso novoCurso){
        return cursoRepository.save(novoCurso);
    }

    // deletar curso pelo id
    public Curso deletarCurso(UUID idCurso) {
        Curso curso = cursoRepository.findById(idCurso).get();
        cursoRepository.delete(curso);
        return curso;
    }


}
