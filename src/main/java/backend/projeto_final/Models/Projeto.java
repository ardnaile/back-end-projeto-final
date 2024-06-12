package backend.projeto_final.Models;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name= "projetos")
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProjeto;
    private String tema;

    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;

    @ManyToMany(mappedBy = "projetos")
    private Set<Estudante> estudantes;

    public Projeto(){}

    public Projeto(String tema, Curso curso) {
        this.tema = tema;
        this.curso = curso;
    }

    public Long getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(Long idProjeto) {
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
