package com.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	//Busca produtos pelo título (já existente?
	public List<Produto> findAllByTituloContainingIgnoreCase(String titulo);
	
	//Busca produtos com preço maior que um valor (ordem crescente)
    public List<Produto> findAllByPrecoGreaterThanOrderByPreco(Double preco);
    
 // Busca produtos com preço menor que um valor (ordem decrescente)
    public List<Produto> findAllByPrecoLessThanOrderByPrecoDesc(Double preco);
	
}
