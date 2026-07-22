package com.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojagames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	// Buscar todas as categorias que contenham parte do nome (case-insensitive)
    List<Categoria> findAllByNomeContainingIgnoreCase(String nome);

    // Buscar todas as categorias que contenham parte do tipo (case-insensitive)
    List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
}
