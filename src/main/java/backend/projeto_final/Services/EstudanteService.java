package backend.projeto_final.Services;

import backend.projeto_final.Models.Curso;
import backend.projeto_final.Models.Estudante;
import backend.projeto_final.Repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {
    @Autowired
    EstudanteRepository estudanteRepository;

    // retornar todos os cursos
    public List<Estudante> retornaTodosEstudantes() {
        return estudanteRepository.findAll();
    }

    // salvar novo estudante
    public Estudante save(Estudante novoEstudante){
        return estudanteRepository.save(novoEstudante);
    }
}
