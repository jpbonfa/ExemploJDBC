package br.com.java.jdbc.util;

import br.com.java.jdbc.controller.ProfessorController;
import br.com.java.jdbc.model.Professor;

public class TestaExcluirProfessor {

	public static void main(String[] args) {
		Professor professor = new Professor("Diego", "S�o Carlos", 19.00, 'F');
		ProfessorController controller = new ProfessorController();
		controller.excluir(professor);

	}

}
