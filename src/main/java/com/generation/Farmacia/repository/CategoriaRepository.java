package com.generation.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.Farmacia.model.CategoriaModel;

@Repository
/*
 * No JpaRepository vamos chamar tabela(CategoriaModel) e o tipo de dado(long)
 * da chave primária da tabela.
 */
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
	public List<CategoriaModel>findAllByDescricaoContainingIgnoreCase(String Descricao);

}
