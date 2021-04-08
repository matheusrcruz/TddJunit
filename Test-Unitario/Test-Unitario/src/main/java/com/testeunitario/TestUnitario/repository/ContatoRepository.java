package com.testeunitario.TestUnitario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testeunitario.TestUnitario.model.ContatoModel;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

	public ContatoModel findFirstBynome(String nome);
								
	public List<ContatoModel> findAllByNomeIgnoreCaseContaining(String nome);
}