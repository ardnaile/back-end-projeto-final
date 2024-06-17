package backend.projeto_final.Services;

import backend.projeto_final.Models.Projeto;
import backend.projeto_final.Repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {
    @Autowired
    ProjetoRepository projetoRepository;

    // retornar todos os projetos
    public List<Projeto> verTodosProjetos() {
        return projetoRepository.findAll();
    }

    // salvar novo projeto
    public void salvarProjeto(Projeto novoProjeto){
        projetoRepository.save(novoProjeto);
    }

}
