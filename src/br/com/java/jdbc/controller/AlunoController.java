package br.com.java.jdbc.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

import br.com.java.jdbc.dao.AlunoDAO;
import br.com.java.jdbc.model.Aluno;
import br.com.java.jdbc.util.ConnectionFactory;

public class AlunoController {

	private Connection conexao = ConnectionFactory.getConnection();

	public void inserir(Aluno aluno) {

		AlunoDAO dao = new AlunoDAO(conexao);
		try {
			dao.inserir(aluno);
			JOptionPane.showMessageDialog(null, "aluno inserido com sucesso");
			conexao.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao inserir o aluno");
			e.printStackTrace();
		}
	}

	public void alterar(Aluno aluno) {
		AlunoDAO dao = new AlunoDAO(conexao);
		try {
			dao.alterar(aluno);
			JOptionPane.showMessageDialog(null, "aluno alterado com sucesso");
			conexao.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao alterar o aluno");
			e.printStackTrace();
		}
	}

	public void excluir(Aluno aluno) {
		AlunoDAO dao = new AlunoDAO(conexao);
		try {
			dao.excluir(aluno);
			JOptionPane.showMessageDialog(null, "aluno excluido com sucesso");
			conexao.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao excluir o aluno");
			e.printStackTrace();
		}
	}

	public List<Aluno> buscarTodos() {
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		AlunoDAO dao = new AlunoDAO(conexao);
		try {
			listaAlunos = dao.buscarTodos();
			conexao.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao listar os alunos");
			e.printStackTrace();
		}
		return listaAlunos;
	}
}
