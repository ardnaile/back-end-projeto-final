package backend.projeto_final.Controllers;

import backend.projeto_final.Dtos.EstudanteDto;
import backend.projeto_final.Dtos.ProjetoDto;
import backend.projeto_final.Mappers.ProjetoMapper;
import backend.projeto_final.Models.Curso;
import backend.projeto_final.Models.Estudante;
import backend.projeto_final.Models.Projeto;
import backend.projeto_final.Services.ProjetoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@RestController
@RequestMapping
public class ProjetoController {
    @Autowired
    ProjetoService projetoService;

    @Autowired
    ProjetoMapper projetoMapper;

    @GetMapping("verTodosProjetos")
    public ResponseEntity<List<Projeto>> verTodosProjetos(@RequestParam(defaultValue = "0") int pagina, @RequestParam(defaultValue = "10") int itens){
        List<Projeto> lista = projetoService.verTodosProjetos(pagina, itens);
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/verProjeto/{idProjeto}")
    public ResponseEntity<Projeto> verProjeto(@PathVariable UUID idProjeto){
        Projeto projeto = projetoService.verProjeto(idProjeto).orElseThrow(()-> new NoSuchElementException("Projeto não encontrado com ID: " + idProjeto));
        return ResponseEntity.ok(projeto);
    }

    @PostMapping("salvarProjeto")
    public ResponseEntity<Projeto> salvarProjeto(@RequestBody @Valid ProjetoDto projetoDto){
        Projeto projeto = projetoMapper.toEntity(projetoDto);
        projetoService.salvarProjeto(projeto);
        return ResponseEntity.ok(projeto);
    }
    @DeleteMapping("/deletarProjeto/{idProjeto}")
    public ResponseEntity<Projeto> deletarProjeto(@PathVariable UUID idProjeto){
        Projeto projeto = projetoService.deletarProjeto(idProjeto);
        return ResponseEntity.ok(projeto);
    }

    @GetMapping("/buscarProjeto/tema/{tema}")
    public ResponseEntity<List<Projeto>> buscarProjetoPorTema(@PathVariable String tema){
        List<Projeto> lista = projetoService.buscarProjetoPorTema(tema);
        return ResponseEntity.ok(lista);
    }
}
