package br.edu.ifba.demo.backend.api.model;


import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "livro")
public class LivroModel {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_livro")
    private Long id_livro;
   
    @Column(name = "titulo", nullable = false)
    private String titulo;


    @Column(name = "autor", nullable = false)
    private String autor;
   
    @Column(name = "editora", nullable = true)
    private String editora;
   
    @Column(name = "ano_publicacao", nullable = true)
    private Date ano_publicacao;


    @Column(name = "genero", nullable = true)
    private String genero;


    @Column(name = "isbn", nullable = true)
    private String isbn;


    @Column(name = "num_paginas", nullable = true)
    private String num_paginas;


    @Column(name = "sinopse", nullable = true)
    private String sinopse;


    @Column(name = "idioma", nullable = true)
    private String idioma;


    @Column(name = "data_cadastro", nullable = true)
    private LocalDateTime data_cadastro;


    @Column(name = "preco", nullable = true)
    private Double preco;


    public LivroModel(){
        super();
    }

    public LivroModel(long id_livro, String titulo, String autor, String editora, Date ano_publicacao, 
    String genero, String isbn, String num_paginas, String sinopse, String idioma,
    LocalDateTime data_cadastro, double preco){

        super();
        this.id_livro = id_livro;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano_publicacao = ano_publicacao;
        this.genero = genero;
        this.isbn = isbn;
        this.num_paginas = num_paginas;
        this.sinopse = sinopse;
        this.idioma = idioma;
        this.data_cadastro = data_cadastro;
        this.preco = preco;

    }



}