package mjv.spring.jpa.rest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mjv.spring.jpa.rest.model.Profissao;
import mjv.spring.jpa.rest.repository.ProfissaoRepository;

@Service
public class ProfissaoService {
	
	@Autowired
	private ProfissaoRepository repository;
	
	public Profissao buscarProfissao(Integer id) {
		Optional<Profissao> p =  repository.findById(id);
		Profissao profissao = p.get();
		return profissao;
	}
}
