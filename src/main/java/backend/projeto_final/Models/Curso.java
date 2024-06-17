package backend.projeto_final.Models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name= "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCurso;
    private String nomeCurso;

    @OneToMany(mappedBy = "curso")
    private List<Projeto> projetos;


    public Curso() {}

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public UUID getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(UUID idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
