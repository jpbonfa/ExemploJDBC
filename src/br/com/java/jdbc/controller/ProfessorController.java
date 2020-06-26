package br.com.java.jdbc.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

import br.com.java.jdbc.dao.AlunoDAO;
import br.com.java.jdbc.dao.ProfessorDAO;
import br.com.java.jdbc.model.Aluno;
import br.com.java.jdbc.model.Professor;
import br.com.java.jdbc.util.ConnectionFactory;

public class ProfessorController {

	private Connection conexao = ConnectionFactory.getConnection();

	public void inserir(Professor professor) {

		ProfessorDAO dao = new ProfessorDAO(conexao);
		try {
			dao.inserir(professor);
			JOptionPane.showMessageDialog(null, "Professor inserido com sucesso");
			conexao.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir o professor");
			e.printStackTrace();
		}
	}

	public void alterar(Professor professor) {
		ProfessorDAO dao = new ProfessorDAO(conexao);
		try {
			dao.alterar(professor);
			JOptionPane.showMessageDialog(null, "professor alterado com sucesso");
			conexao.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao alterar o professor");
			e.printStackTrace();
		}
	}

	public void excluir(Professor professor) {
		ProfessorDAO dao = new ProfessorDAO(conexao);
		try {
			dao.excluir(professor);
			JOptionPane.showMessageDialog(null, "professor excluido com sucesso");
			conexao.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir o professor");
			e.printStackTrace();
		}
	}

	public List<Professor> buscarTodos() {
		List<Professor> listaprofessores = new ArrayList<Professor>();
		ProfessorDAO dao = new ProfessorDAO(conexao);
		try {
			listaprofessores = dao.buscarTodos();
			conexao.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao listar os professor");
			e.printStackTrace();
		}
		return listaprofessores;
	}
}
