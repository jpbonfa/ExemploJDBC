package br.com.java.jdbc.model;

public class Professor {
	
	private  String nome;
	private  String materia;
	private double salario;
	private char sexo;
	
	
	public Professor() {
		
	}


	public Professor(String nome, String materia, double salario, char sexo) {
		
		this.nome = nome;
		this.materia = materia;
		this.salario = salario;
		this.sexo = sexo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	


}
