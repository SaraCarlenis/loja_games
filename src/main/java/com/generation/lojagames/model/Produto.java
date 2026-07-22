package com.generation.lojagames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_games")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Atributo titulo é obrigatório!")
	@Size(min = 2, max = 100, message = "O atributo título deve ter no mínimo 2 e no máximo 100 caracteres")
	@Column(length = 100)
	private String titulo;
	
	@NotBlank(message = "A descrição é obrigatoria!")
    @Size(max = 1000, message = "A descrição deve ter no máximo 1000 caracteres")
    @Column(length = 1000, nullable = false)
	private String descricao;
	
	@NotNull(message = "O preço é obrigatorio!")
	@Positive(message = "O preço deve ser maior que zero!")
	@Column(nullable = false)
	private BigDecimal preco;
	
    @NotNull(message = "A quantidade em estoque é obrigatória!")
    @Min(value = 0, message = "A quantidade não pode ser negativa")
    @Column(nullable = false)
    private Integer estoque;
    
    //Cria o atributo foto
    
    @Size(max = 1000, message = "O link para anexar a foto deve ter no máximo 1000 caracteres.")
    @Column(length = 1000)
    private String foto;
    
    @ManyToOne ////Relacionamento Many to One com Categoria
    @JoinColumn(name = "categoria_id", nullable = false)
    @JsonBackReference //evita o loop infinito no Insomnia.
    private Categoria categoria;
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	
	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
