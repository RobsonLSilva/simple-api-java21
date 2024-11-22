package br.com.consumoapi.consumodeapi.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tb_telefone")
public class Telefone implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tel_fixo")
    private String fixo;
    @Column(name = "tel_celular")
    private String celular;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Telefone() {
    }

    public Telefone(Long id, String fixo, String celular) {
        this.id = id;
        this.fixo = fixo;
        this.celular = celular;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFixo() {
        return fixo;
    }

    public void setFixo(String fixo) {
        this.fixo = fixo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
