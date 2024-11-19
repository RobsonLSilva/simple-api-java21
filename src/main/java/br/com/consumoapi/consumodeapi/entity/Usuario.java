package br.com.consumoapi.consumodeapi.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

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
    private Instant dtNascimento;

    public Usuario() {
    }

    public Usuario(Long id, String nome, Instant dtNascimento) {
        this.id = id;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
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
}
