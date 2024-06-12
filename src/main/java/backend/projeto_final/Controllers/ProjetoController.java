package backend.projeto_final.Controllers;

import backend.projeto_final.Services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjetoController {
    @Autowired
    ProjetoService projetoService;
}
