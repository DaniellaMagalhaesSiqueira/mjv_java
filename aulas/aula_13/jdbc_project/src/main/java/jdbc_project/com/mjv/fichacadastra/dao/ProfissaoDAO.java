package jdbc_project.com.mjv.fichacadastra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc_project.com.mjv.fichacadastral.model.Profissao;
import jdbc_project.com.mjv.fichacadastral.util.FabricaConexoes;

public class ProfissaoDAO {

	private Connection conexao;

	public ProfissaoDAO() {
		try {
			conexao = FabricaConexoes.criarConexao();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void save(Profissao profissao) {
		try {
			String sql = "INSERT INTO tab_profissao (nome) VALUES(?);";
			PreparedStatement pst = conexao.prepareStatement(sql);
			pst.setString(1, profissao.getNome());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(Profissao profissao) {
		try {
			String sql = "UPDATE tab_profissao SET nome= ? WHERE id_profissao= ?;";
			PreparedStatement pst = conexao.prepareStatement(sql);
			pst.setString(1, profissao.getNome());
			pst.setInt(2, profissao.getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Profissao findById(Integer id) {
		Profissao record = null;
		try {
			String sql = "SELECT * from tab_profissao WHERE id_profissao= ?;";
			PreparedStatement pst = conexao.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				record = new Profissao();
				record.setId(rs.getInt("id_profissao"));
				record.setNome(rs.getString("nome"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return record;
	}
}
