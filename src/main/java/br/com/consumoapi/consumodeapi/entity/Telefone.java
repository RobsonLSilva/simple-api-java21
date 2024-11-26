package br.com.consumoapi.consumodeapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_telefone")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private String tipo; // Ex: Celular, Comercial, etc.

    // Construtores
    public Telefone() {

    }

    public Telefone(Long id, String numero, String tipo) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
