package br.com.java.jdbc.util;

import br.com.java.jdbc.controller.AlunoController;
import br.com.java.jdbc.model.Aluno;

public class TesteAlterarAluno {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("Pedro", "São Carlos", 19);
		AlunoController controller = new AlunoController();
		controller.alterar(aluno);
	}

}
