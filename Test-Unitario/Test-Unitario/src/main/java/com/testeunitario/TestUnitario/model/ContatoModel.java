package com.testeunitario.TestUnitario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class ContatoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = " O ddd deve ser digitado ")
	private String ddd;
	
	@NotEmpty(message = " O telefone deve ser digitado ")
	private String telefone;
	
	@NotEmpty(message = " O Nome deve ser digitado ")
	private String nome;
	
	// Pião
	public ContatoModel() 
	{
		
	}
	
	public ContatoModel(String nome, String ddd, String telefone){
		this.setNome(nome);
		this.ddd = ddd;
		this.telefone = telefone;
	}
	
	//Encapsulamento :) 
	
	public Long getId() 
	{
		return id;
	
	}
	public void  setId(Long id)
	{
		this.id = id;
	}
	public String getNome()
{
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDdd() 
	{
		return ddd;
	
	}
	public void  setDdd(String ddd) 
	{
		this.ddd = ddd;
	}
	public String getTelefone() 
	{
		return telefone;
	}
	public void setTelefone(String telefone) 
	{
		this.telefone = telefone;
	}
}
