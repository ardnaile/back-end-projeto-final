package backend.projeto_final.Repositories;

import backend.projeto_final.Models.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

// modelo e tipo da primary key dentro do <>
public interface EstudanteRepository extends JpaRepository<Estudante, UUID> {
}