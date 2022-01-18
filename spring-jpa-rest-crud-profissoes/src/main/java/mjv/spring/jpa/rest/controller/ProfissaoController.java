package mjv.spring.jpa.rest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mjv.spring.jpa.rest.model.Profissao;
import mjv.spring.jpa.rest.repository.ProfissaoRepository;

@RestController
@RequestMapping("/profissoes")
public class ProfissaoController {
	//+UM RECURSO QUE BUSCA AS PROFISSOES POR NOME = LIKE
	//+UM RECURSO QUE BUSCAR A PROFISSAO PELO ID
	@Autowired
	private ProfissaoRepository repository;
	
	
	@GetMapping(value="/{id}")
	public Profissao profissaoPorId(@PathVariable("id") Integer id) {
		Optional<Profissao> p =  repository.findById(id);
		Profissao profissao = p.get();
		return profissao;
	}
	
	@GetMapping(value="/nome/{nome}")
	public Iterable<Profissao> profissaoPorNome(@PathVariable("nome") String nome) {
		return repository.findByNome(nome);
	}
	
}
