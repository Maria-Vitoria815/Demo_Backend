package br.edu.ifba.demo.backend.api.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifba.demo.backend.api.model.LivroModel;

@Repository
public interface LivroRepository extends JpaRepository<LivroModel, Long>

{

    LivroModel findByIsbn(String isbn);

    List<LivroModel> findByTituloContainingIgnoreCase(String titulo);

}