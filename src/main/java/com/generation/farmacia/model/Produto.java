package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo princípio ativo é obrigatório.")
	@Size(min = 5, max = 100, message = "O atributo princípio ativo deve conter no mínimo 5 caracteres e no máximo 100 caracteres.")
	private String principioAtivo;
	
	@NotBlank(message = "O atributo dosagem é obrigatório.")
	@Size(min = 2, max = 10, message = "O atributo dosagem deve conter no mínimo 2 caracteres e no máximo 10 caracteres.")
	private String dosagem;
	
	@NotBlank(message = "O atributo descrição é obrigatório.")
	@Size(min = 5, max = 100, message = "O atributo descrição deve conter no mínimo 5 caracteres e no máximo 100 caracteres.")
	private String descricao;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrincipioAtivo() {
		return principioAtivo;
	}

	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}

	public String getDosagem() {
		return dosagem;
	}

	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
