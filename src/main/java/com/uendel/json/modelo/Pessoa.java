package com.uendel.json.modelo;

import java.util.Objects;

public class Pessoa {

	private String Nome;
	private int idade;
	private double altura;
	private String estadoCivil;
	
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pessoa(String nome, int idade, double altura, String estadoCivil) {
		super();
		Nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.estadoCivil = estadoCivil;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	

	
	
}
