package br.com.consumoapi.consumodeapi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "Usuario")
@Table(name = "tb_user")
public class Usuario implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String nome;


    @Column(name = "user_dtNascimento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant dtNascimento;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "usuario_id") // Define a chave estrangeira na tabela de telefone
    private List<Telefone> telefones;

    public Usuario() {
    }

    public Usuario(Long id, String nome, Instant dtNascimento, List<Telefone> telefones) {
        this.id = id;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.telefones = telefones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Instant getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Instant dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
