package br.com.java.jdbc.util;

import br.com.java.jdbc.controller.ProfessorController;
import br.com.java.jdbc.model.Professor;

public class TestaAlterarProfessor {

	public static void main(String[] args) {
		Professor professor = new Professor("Diego", "Matematica", 19.00,'F');
		ProfessorController controller = new ProfessorController();
		controller.alterar(professor);

	}

}
