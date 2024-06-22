package backend.projeto_final.Controllers;

import backend.projeto_final.Dtos.EstudanteDto;
import backend.projeto_final.Mappers.EstudanteMapper;
import backend.projeto_final.Models.Curso;
import backend.projeto_final.Models.Estudante;
import backend.projeto_final.Services.EstudanteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@RestController
@RequestMapping
public class EstudanteController {
    @Autowired
    EstudanteService estudanteService;

    @Autowired
    EstudanteMapper estudanteMapper;

    @GetMapping("verTodosEstudantes")
    public ResponseEntity<List<Estudante>> verTodosEstudantes(@RequestParam int pagina, @RequestParam int itens){
        List<Estudante> lista = estudanteService.verTodosEstudantes(pagina, itens);
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/verEstudante/{idEstudante}")
    public ResponseEntity<Estudante> verEstudante(@PathVariable UUID idEstudante){
        Estudante estudante = estudanteService.verEstudante(idEstudante).orElseThrow(()-> new NoSuchElementException("Estudante não encontrado com ID: " + idEstudante));
        return ResponseEntity.ok(estudante);
    }

    @PostMapping("salvarEstudante")
    public ResponseEntity<Estudante> salvarEstudante(@RequestBody @Valid EstudanteDto estudanteDto){
        Estudante estudante = estudanteMapper.toEntity(estudanteDto);
        estudanteService.salvarEstudante(estudante);
        return ResponseEntity.ok(estudante);
    }

    @PostMapping("/vincular/{idEstudante}/{idProjeto}")
    public ResponseEntity<Estudante> vincularProjeto(@PathVariable UUID idEstudante, @PathVariable UUID idProjeto) {
        Estudante estudanteAtualizado = estudanteService.vincularProjeto(idEstudante, idProjeto);
        return ResponseEntity.ok(estudanteAtualizado);
    }

    @DeleteMapping("/deletarEstudante/{idEstudante}")
    public ResponseEntity<Estudante> deletarEstudante(@PathVariable UUID idEstudante){
        Estudante estudante = estudanteService.deletarEstudante(idEstudante);
        return ResponseEntity.ok(estudante);
    }

    @GetMapping("/buscarEstudante/tema/{temaPreferido}")
    public ResponseEntity<List<Estudante>> buscarEstudantePorTemaPreferido(@PathVariable String temaPreferido){
        List<Estudante> lista = estudanteService.buscarEstudantePorTemaPreferido(temaPreferido);
        return ResponseEntity.ok(lista);
    }

}
