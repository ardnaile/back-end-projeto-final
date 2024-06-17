package backend.projeto_final.Controllers;

import backend.projeto_final.Dtos.CursoDto;
import backend.projeto_final.Dtos.ProjetoDto;
import backend.projeto_final.Mappers.CursoMapper;
import backend.projeto_final.Models.Curso;
import backend.projeto_final.Models.Projeto;
import backend.projeto_final.Repositories.CursoRepository;
import backend.projeto_final.Services.CursoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@RestController
@RequestMapping
public class CursoController {
    @Autowired
    CursoService cursoService;

    @Autowired
    CursoMapper cursoMapper;

    @GetMapping("/verTodosCursos")
    public ResponseEntity<List<Curso>> verTodosCursos(){
        List<Curso> lista = cursoService.verTodosCursos();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/verCurso/{idCurso}")
    public ResponseEntity<Curso> verCurso(@PathVariable UUID idCurso){
        Curso curso = cursoService.verCurso(idCurso).orElseThrow(()-> new NoSuchElementException("Curso não encontrado com ID: " + idCurso));
        return ResponseEntity.ok(curso);
    }

    @PostMapping("/salvarCurso")
    public ResponseEntity<Curso> salvarCurso(@RequestBody @Valid CursoDto cursoDto){
        Curso curso = cursoMapper.toEntity(cursoDto);
        cursoService.salvarCurso(curso);
        return ResponseEntity.ok(curso);
    }

    @DeleteMapping("/deletarCurso/{idCurso}")
    public ResponseEntity<Curso> deletarCurso(@PathVariable UUID idCurso){
        Curso curso = cursoService.deletarCurso(idCurso);
        return ResponseEntity.ok(curso);
    }
}
