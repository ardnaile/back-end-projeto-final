package backend.projeto_final.Services;

import backend.projeto_final.Repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetoService {
    @Autowired
    ProjetoRepository projetoRepository;
}
