package backend.projeto_final.Controllers;

import backend.projeto_final.Repositories.CursoRepository;
import backend.projeto_final.Services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    @Autowired
    CursoService cursoService;
}
