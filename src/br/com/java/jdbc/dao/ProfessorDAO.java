package br.com.java.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.java.jdbc.model.Aluno;
import br.com.java.jdbc.model.Professor;

public class ProfessorDAO {

	private Connection bd;

	public ProfessorDAO(Connection bd) {
		this.bd = bd;
	}

	public void inserir(Professor professor) throws SQLException {
		String sql = "INSERT INTO professor (nome,materia,salario,sexo) VALUES (?,?,?,?)";
		PreparedStatement comando = (PreparedStatement) bd.prepareStatement(sql);
		comando.setString(1, professor.getNome());
		comando.setString(2, professor.getMateria());
		comando.setDouble(3, professor.getSalario());
		comando.setString(4, professor.getSexo() + "");
		comando.execute();
	}

	public void alterar(Professor professor) throws SQLException {
		String sql = "UPDATE professor SET sexo=?, materia = ?,salario = ? WHERE nome=?";
		PreparedStatement comando = (PreparedStatement) bd.prepareStatement(sql);
		comando.setString(1, professor.getSexo() + "");
		comando.setString(2, professor.getMateria());
		comando.setDouble(3, professor.getSalario());
		comando.setString(4, professor.getNome());
		comando.execute();

	}

	public void excluir(Professor professor) throws SQLException {
		String sql = "DELETE FROM professor WHERE nome = ?";
		PreparedStatement comando = (PreparedStatement) bd.prepareStatement(sql);
		comando.setString(1, professor.getNome());
		comando.execute();
	}

	public List<Professor> buscarTodos() throws SQLException {
		String sql = "SELECT * FROM professor ORDER BY nome";
		PreparedStatement comando = (PreparedStatement) bd.prepareStatement(sql);
		ResultSet cursor = comando.executeQuery();
		List<Professor> listaProfessor = new ArrayList<Professor>();

		while (cursor.next()) {
			Professor professor = new Professor();
			professor.setNome(cursor.getString("nome"));
			professor.setMateria(cursor.getString("materia"));
			professor.setSalario(cursor.getDouble("salario"));
			professor.setSexo(cursor.getString("sexo").charAt(0));
			listaProfessor.add(professor);
		}

		return listaProfessor;
	}

}
