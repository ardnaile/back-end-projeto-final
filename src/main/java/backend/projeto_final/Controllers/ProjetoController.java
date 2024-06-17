package backend.projeto_final.Controllers;

import backend.projeto_final.Dtos.EstudanteDto;
import backend.projeto_final.Dtos.ProjetoDto;
import backend.projeto_final.Mappers.ProjetoMapper;
import backend.projeto_final.Models.Estudante;
import backend.projeto_final.Models.Projeto;
import backend.projeto_final.Services.ProjetoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjetoController {
    @Autowired
    ProjetoService projetoService;

    @Autowired
    ProjetoMapper projetoMapper;

    @GetMapping("verTodosProjetos")
    public ResponseEntity<List<Projeto>> verTodosProjetos(){
        List<Projeto> lista = projetoService.verTodosProjetos();
        return ResponseEntity.ok(lista);
    }

    @PostMapping("salvarProjeto")
    public ResponseEntity<Projeto> salvarProjeto(@RequestBody @Valid ProjetoDto projetoDto){
        Projeto projeto = projetoMapper.toEntity(projetoDto);
        projetoService.salvarProjeto(projeto);
        return ResponseEntity.ok(projeto);
    }
}
