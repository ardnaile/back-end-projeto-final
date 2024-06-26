package backend.projeto_final.Repositories;

import backend.projeto_final.Models.Projeto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, UUID> {
    List<Projeto> findByTema(String tema);
    Page<Projeto> findAll(Pageable pageable);
}
