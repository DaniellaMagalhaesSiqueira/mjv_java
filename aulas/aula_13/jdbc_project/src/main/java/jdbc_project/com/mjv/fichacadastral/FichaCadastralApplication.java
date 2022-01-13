package jdbc_project.com.mjv.fichacadastral;

import jdbc_project.com.mjv.fichacadastra.dao.ProfissaoDAO;
import jdbc_project.com.mjv.fichacadastral.model.Profissao;
public class FichaCadastralApplication {
	public static void main(String[] args) {
		exemploAlterar();
		exemploAlterarPorId();
	}
	
	public static void exemploSalvar() {
		Profissao p = new Profissao();
		p.setNome("ANALISTA DE DADOS");
		
		ProfissaoDAO dao = new ProfissaoDAO();
		dao.save(p);
	}
	public static void exemploAlterar() {
		Profissao p = new Profissao();
		p.setId(1);
		p.setNome("PROGRAMADOR JAVA JR");
		
		ProfissaoDAO dao = new ProfissaoDAO();
		dao.update(p);
	}
	public static void exemploAlterarPorId() {
		ProfissaoDAO dao = new ProfissaoDAO();
		Profissao p = dao.findById(1);
		
		p.setNome("DESENVOLVEDOR");
		
		dao.update(p);
	}
}
