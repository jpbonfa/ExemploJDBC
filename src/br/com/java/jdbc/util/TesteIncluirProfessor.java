package br.com.java.jdbc.util;

import br.com.java.jdbc.controller.AlunoController;
import br.com.java.jdbc.controller.ProfessorController;
import br.com.java.jdbc.model.Aluno;
import br.com.java.jdbc.model.Professor;

public class TesteIncluirProfessor {

	public static void main(String[] args) {

		Professor professor = new Professor("Guilherme", "Adm", 2000.00, 'M');
		ProfessorController controller = new ProfessorController();
		controller.inserir(professor);
	}

}
