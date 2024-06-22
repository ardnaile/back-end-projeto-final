package backend.projeto_final.Controllers;

import backend.projeto_final.Dtos.AutenticacaoDto;
import backend.projeto_final.Dtos.RegistroDto;
import backend.projeto_final.Services.AutorizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("autorizacao")
public class AutorizacaoController {

    @Autowired
    AutorizacaoService autorizacaoService;

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody @Valid AutenticacaoDto autenticacaoDto){
        return autorizacaoService.login(autenticacaoDto);
    }


    @PostMapping("/register")
    public ResponseEntity<Object> register (@RequestBody RegistroDto registroDto){
        return autorizacaoService.register(registroDto);
    }
}
