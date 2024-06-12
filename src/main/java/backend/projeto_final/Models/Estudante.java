package backend.projeto_final.Models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;


@Entity
@Table(name= "estudantes")
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEstudante;

    private String nome;
    private int contato;

    @ManyToMany
    @JoinTable(
            name = "estudante_projeto",
            joinColumns = @JoinColumn(name = "idEstudante"),
            inverseJoinColumns = @JoinColumn(name = "idProjeto")
    )
    private Set<Projeto> projetos;

    public Estudante() {}

    public Estudante(String nome, int contato, Set<Projeto> projetos) {
        this.nome = nome;
        this.contato = contato;
        this.projetos = projetos;
    }

    public Long getIdEstudante() {
        return idEstudante;
    }

    public void setIdEstudante(Long idEstudante) {
        this.idEstudante = idEstudante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public Set<Projeto> getProjeto() {
        return projetos;
    }

    public void setProjeto(Set<Projeto> projetos) {
        this.projetos = projetos;
    }
}
