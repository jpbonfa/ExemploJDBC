package br.com.java.jdbc.util;

import br.com.java.jdbc.controller.AlunoController;
import br.com.java.jdbc.model.Aluno;

public class TesteBuscarAlunos {

	public static void main(String[] args) {
		for (Aluno aluno : new AlunoController().buscarTodos()) {
			System.out.println("Nome do aluno: " + aluno.getNome());
			System.out.println("Cidade do aluno: " + aluno.getCidade());
			System.out.println("Idade do aluno: " + aluno.getIdade());
		}
	}

}
