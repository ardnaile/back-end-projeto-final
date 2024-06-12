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

@RestController
@RequestMapping
public class EstudanteController {
    @Autowired
    EstudanteService estudanteService;

    @Autowired
    EstudanteMapper estudanteMapper;

    @PostMapping("adicionarEstudante")
    public ResponseEntity<Estudante> adicionarEstudante(@RequestBody @Valid EstudanteDto estudanteDto){
        Estudante estudante = estudanteMapper.toEntity(estudanteDto);
        estudanteService.save(estudante);
        return ResponseEntity.ok(estudante);
    }
    @GetMapping("verTodosEstudantes")
    public ResponseEntity<List<Estudante>> verTodosEstudantes(){
        List<Estudante> lista = estudanteService.retornaTodosEstudantes();
        return ResponseEntity.ok(lista);
    }

}
