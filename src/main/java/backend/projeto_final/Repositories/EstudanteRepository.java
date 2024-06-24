package backend.projeto_final.Repositories;

import backend.projeto_final.Models.Estudante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

// modelo e tipo da primary key dentro do <>

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, UUID> {
    List<Estudante> findByTemaPreferido(String temaPreferido);
    Page<Estudante> findAll(Pageable pageable);
}
