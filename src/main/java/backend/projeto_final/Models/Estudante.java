package backend.projeto_final.Models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;
import java.util.UUID;


@Entity
@Table(name= "estudantes")
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEstudante;

    private String nome;
    private String contato;
    private String temaPreferido;

    @ManyToMany
    @JoinTable(
            name = "estudante_projeto",
            joinColumns = @JoinColumn(name = "idEstudante"),
            inverseJoinColumns = @JoinColumn(name = "idProjeto")
    )
    private Set<Projeto> projetos;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Estudante() {}

    public Estudante(String nome, String contato, String temaPreferido, Usuario usuario) {
        this.nome = nome;
        this.contato = contato;
        this.temaPreferido = temaPreferido;
        this.usuario = usuario;
    }

    public UUID getIdEstudante() {
        return idEstudante;
    }

    public void setIdEstudante(UUID idEstudante) {
        this.idEstudante = idEstudante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(int String) {
        this.contato = contato;
    }

    public Set<Projeto> getProjeto() {
        return projetos;
    }

    public void setProjeto(Set<Projeto> projetos) {
        this.projetos = projetos;
    }

    public String getTemaPreferido() {
        return temaPreferido;
    }

    public void setTemaPreferido(String temaPreferido) {
        this.temaPreferido = temaPreferido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
