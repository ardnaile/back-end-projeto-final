package backend.projeto_final.Services;

import backend.projeto_final.Models.Curso;
import backend.projeto_final.Models.Projeto;
import backend.projeto_final.Repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProjetoService {
    @Autowired
    ProjetoRepository projetoRepository;

    // retornar todos os projetos
    public List<Projeto> verTodosProjetos(int pagina, int itens) {
        return projetoRepository.findAll(PageRequest.of(pagina, itens)).stream().toList();
    }

    // retornar projeto pelo id
    public Optional<Projeto> verProjeto(UUID idProjeto){
        return projetoRepository.findById(idProjeto);
    }

    // salvar novo projeto
    public void salvarProjeto(Projeto novoProjeto){
        projetoRepository.save(novoProjeto);
    }

    // deletar curso pelo id
    public Projeto deletarProjeto(UUID idProjeto) {
        Projeto projeto = projetoRepository.findById(idProjeto).get();
        projetoRepository.delete(projeto);
        return projeto;
    }

    // procurar curso por tema
    public List<Projeto> buscarProjetoPorTema(String tema){
        return projetoRepository.findByTema(tema);
    }

}
