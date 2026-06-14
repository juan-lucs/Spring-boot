package io.github.Spring_boot.Produtosapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @Column
    String id;

    @Column
    String nome;

    @Column
    String descricao;

    @Column
    double preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                " id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                "  descricao='" + descricao + '\'' +
                '}';
    }
}
