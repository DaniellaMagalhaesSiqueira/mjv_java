package mjv.spring.jpa.rest.start;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mjv.spring.jpa.rest.model.Cadastro;
import mjv.spring.jpa.rest.model.Endereco;
import mjv.spring.jpa.rest.model.Profissao;
import mjv.spring.jpa.rest.model.Sexo;
import mjv.spring.jpa.rest.model.Telefone;
import mjv.spring.jpa.rest.model.TelefoneTipo;
import mjv.spring.jpa.rest.repository.ProfissaoRepository;
import mjv.spring.jpa.rest.service.CadastroService;
import mjv.spring.jpa.rest.service.ProfissaoService;

@Component
public class Application implements CommandLineRunner {

	@Autowired
	private CadastroService cadastroService;
	
	@Autowired
	private ProfissaoService service;
	
	@Autowired
	private ProfissaoRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Endereco end = new Endereco();
		end.setLogradouro("RUA RIO NOVO");
		end.setNumero("SN");
		
		Cadastro cadastro = new Cadastro();
		cadastro.setCpfCnpj("08681014781");
		cadastro.setNome("CADASTRO TESTE");
		cadastro.setSexo(Sexo.F);
		cadastro.setEndereco(end);
		
		List<String> emails = new ArrayList<>();
		emails.add("email1234_1234@gmail.com");
		emails.add("email_cadastr_teste@gmail.com");
		cadastro.setEmails(emails);
		
		List<Telefone> tels = new ArrayList<>();
		Telefone tel1 = new Telefone();
		tel1.setDdd("022");
		tel1.setNumero("998741950");
		tel1.setTipo(TelefoneTipo.CEL);
		tel1.setCadastro(cadastro);
		tels.add(tel1);
		Telefone tel2 = new Telefone();
		tel2.setDdd("024");
		tel2.setNumero("277241878");
		tel2.setTipo(TelefoneTipo.FIXO);
		tel2.setCadastro(cadastro); //é importante setar o cadastro no telefone para persistir
		tels.add(tel2);
		cadastro.setTelefones(tels);
		
		Profissao p = new Profissao();
		p.setId(1);
		p.setNome("PROGRAMADOR");
		cadastro.setProfissao(p);
		cadastroService.salvarCadastro(cadastro);
	}

}
