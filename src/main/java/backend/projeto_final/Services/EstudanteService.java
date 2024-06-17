package backend.projeto_final.Services;

import backend.projeto_final.Models.Estudante;
import backend.projeto_final.Models.Projeto;
import backend.projeto_final.Repositories.EstudanteRepository;
import backend.projeto_final.Repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class EstudanteService {
    @Autowired
    EstudanteRepository estudanteRepository;
    @Autowired
    ProjetoRepository projetoRepository;

    // ver todos os estudantes
    public List<Estudante> verTodosEstudantes() {
        return estudanteRepository.findAll();
    }

    // salvar novo estudante
    public void salvarEstudante(Estudante novoEstudante){
        estudanteRepository.save(novoEstudante);
    }

    // vincular estudante a um projeto
    public Estudante vincularProjeto(UUID idEstudante, UUID idProjeto){
        Estudante estudante = estudanteRepository.findById(idEstudante)
                .orElseThrow(()-> new NoSuchElementException("Usuário não encontrado com ID: " + idEstudante));

        Projeto projeto = projetoRepository.findById(idProjeto)
                .orElseThrow(()-> new NoSuchElementException("Projeto não encontrado com ID: " + idProjeto));

        estudante.getProjeto().add(projeto);
        return estudanteRepository.save(estudante);
    }
}
