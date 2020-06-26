package br.com.java.jdbc.util;

import br.com.java.jdbc.controller.AlunoController;
import br.com.java.jdbc.controller.ProfessorController;
import br.com.java.jdbc.model.Aluno;
import br.com.java.jdbc.model.Professor;

public class TestaBuscarTodosProfessor {

	public static void main(String[] args) {
		for (Professor professor : new ProfessorController().buscarTodos()) {
			System.out.println("Nome do professor: " + professor.getNome());
			System.out.println("Materia do professor: " + professor.getMateria());
			System.out.println("Salario do professor: " + professor.getSalario());
			System.out.println("Sexo do professor: " + professor.getSexo());
			
		}
	}

}
