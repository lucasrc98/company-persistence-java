package br.com.persistencia.java;

import javax.persistence.*;

@Entity
public class Lembrete {

//    Proprio banco de dados vai ficar encarregado de gerar a chave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // NOT NULL
    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descricao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Lembrete() {
    }

    @Override
    public String toString() {
        return "Lembrete{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
