package backend.projeto_final.Repositories;

import backend.projeto_final.Models.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.UUID;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, UUID> {
    List<Projeto> findByTema(String tema);
    List<Projeto> findAll(Pageable pageable);
}
