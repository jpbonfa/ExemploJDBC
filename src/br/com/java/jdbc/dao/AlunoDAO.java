package br.com.java.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsalvel por armazenar os metodos crud
 * 
 * @author joaop
 * 
 * @since 16/06/2020
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.java.jdbc.model.Aluno;

public class AlunoDAO {

	private Connection bd;

	public AlunoDAO(Connection bd) {
		this.bd = bd;
	}

	public void inserir(Aluno aluno) throws SQLException {
		String sql = "INSERT INTO aluno (nome,cidade,idade) VALUES (?,?,?)";
		PreparedStatement comando = (PreparedStatement) bd.prepareStatement(sql);
		comando.setString(1, aluno.getNome());
		comando.setString(2, aluno.getCidade());
		comando.setInt(3, aluno.getIdade());
		comando.execute();
	}

	public void alterar(Aluno aluno) throws SQLException {
		String sql = "UPDATE aluno SET cidade=?, idade = ? WHERE nome=?;";
		PreparedStatement comando = (PreparedStatement) bd.prepareStatement(sql);
		comando.setString(1, aluno.getCidade());
		comando.setInt(2, aluno.getIdade());
		comando.setString(3, aluno.getNome());
		comando.execute();
	}

	public void excluir(Aluno aluno) throws SQLException {
		String sql = "DELETE FROM aluno WHERE nome = ?";
		PreparedStatement comando = (PreparedStatement) bd.prepareStatement(sql);
		comando.setString(1, aluno.getNome());
		comando.execute();
	}

	public List<Aluno> buscarTodos() throws SQLException {
		String sql = "SELECT * FROM aluno ORDER BY nome";
		PreparedStatement comando = (PreparedStatement) bd.prepareStatement(sql);
		ResultSet cursor = comando.executeQuery();
		List<Aluno> listaAlunos = new ArrayList<Aluno>();

		while (cursor.next()) {
			Aluno aluno = new Aluno();
			aluno.setNome(cursor.getString("nome"));
			aluno.setCidade(cursor.getString("cidade"));
			aluno.setIdade(cursor.getInt("idade"));
			listaAlunos.add(aluno);
		}

		return listaAlunos;
	}
}
