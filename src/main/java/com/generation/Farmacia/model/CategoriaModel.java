package com.generation.Farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")

public class CategoriaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;


	@NotBlank /* anotações */
	@Size(min = 4, max = 120) /* tamanho da escrita */
	private String descricao; /* nome tabela */

	@NotBlank
	@Size(min = 4, max = 120)
	
	@ManyToOne
	@JsonIgnoreProperties("tb_categoria")
	private ProdutoModel produto;
	
	public long getId() {
		return id;
		
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
