package backend.projeto_final.Services;

import backend.projeto_final.Repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudanteService {
    @Autowired
    EstudanteRepository estudanteRepository;
}
