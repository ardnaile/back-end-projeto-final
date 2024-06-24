package backend.projeto_final.Models;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;


@Entity
@Table(name= "projetos")
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProjeto;
    private String tema;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idCurso")
    private Curso curso;

    @ManyToMany(mappedBy = "projetos")
    private Set<Estudante> estudantes;

    public Projeto(){}

    public Projeto(String tema, Curso curso) {
        this.tema = tema;
        this.curso = curso;
    }

    public UUID getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(UUID idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
