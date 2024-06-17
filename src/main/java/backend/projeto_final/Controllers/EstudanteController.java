package backend.projeto_final.Controllers;

import backend.projeto_final.Dtos.EstudanteDto;
import backend.projeto_final.Mappers.EstudanteMapper;
import backend.projeto_final.Models.Estudante;
import backend.projeto_final.Services.EstudanteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping
public class EstudanteController {
    @Autowired
    EstudanteService estudanteService;

    @Autowired
    EstudanteMapper estudanteMapper;

    @GetMapping("verTodosEstudantes")
    public ResponseEntity<List<Estudante>> verTodosEstudantes(){
        List<Estudante> lista = estudanteService.verTodosEstudantes();
        return ResponseEntity.ok(lista);
    }

    @PostMapping("salvarEstudante")
    public ResponseEntity<Estudante> salvarEstudante(@RequestBody @Valid EstudanteDto estudanteDto){
        Estudante estudante = estudanteMapper.toEntity(estudanteDto);
        estudanteService.salvarEstudante(estudante);
        return ResponseEntity.ok(estudante);
    }

    @PostMapping("/{idEstudante}/projetos/{idProjeto}")
    public ResponseEntity<Estudante> vincularProjeto(@PathVariable UUID idEstudante, @PathVariable UUID idProjeto) {
        Estudante estudanteAtualizado = estudanteService.vincularProjeto(idEstudante, idProjeto);
        return ResponseEntity.ok(estudanteAtualizado);
    }

}
