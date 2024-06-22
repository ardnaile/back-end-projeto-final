package backend.projeto_final.Services;

import java.sql.Date;

import backend.projeto_final.Dtos.AutenticacaoDto;
import backend.projeto_final.Dtos.LoginResponseDto;
import backend.projeto_final.Dtos.RegistroDto;
import backend.projeto_final.Models.Usuario;
import backend.projeto_final.Repositories.UsuarioRepository;
import backend.projeto_final.Seguranca.TokenSeguranca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;

@Service
public class AutorizacaoService implements UserDetailsService{
    @Autowired
    private ApplicationContext context;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TokenSeguranca tokenSeguranca;

    private AuthenticationManager authenticationManager;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return usuarioRepository.findByEmail(email);
    }

    public ResponseEntity<Object> login(@RequestBody @Valid AutenticacaoDto data){
        authenticationManager = context.getBean(AuthenticationManager.class);

        var usernamePassword = new UsernamePasswordAuthenticationToken(data.email(), data.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);
        var token = tokenSeguranca.generateToken((Usuario) auth.getPrincipal());
        return ResponseEntity.ok(new LoginResponseDto(token));
    }


    public ResponseEntity<Object> register (@RequestBody RegistroDto registroDto){
        if (this.usuarioRepository.findByEmail(registroDto.email()) != null ) return ResponseEntity.badRequest().build();
        String encryptedPassword = new BCryptPasswordEncoder().encode(registroDto.password());

        Usuario newUser = new Usuario(registroDto.email(), encryptedPassword, registroDto.role());
        newUser.setCreatedAt(new Date(System.currentTimeMillis()));
        this.usuarioRepository.save(newUser);
        return ResponseEntity.ok().build();
    }

}
