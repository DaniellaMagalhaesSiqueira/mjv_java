package mjv.easy_job.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mjv.easy_job.model.RegistroProfissional;
import mjv.easy_job.repository.ProfissaoRepository;
import mjv.easy_job.repository.RegistroProfissionalRepository;

@Service	
public class CadastroService {
	
	@Autowired
	private RegistroProfissionalRepository repository;
	
	private ProfissaoRepository profissaoRepository;

	public void salvarCadastro(RegistroProfissional cadastro) {
		boolean existProf = profissaoRepository.existsById(cadastro.getProfissao().getId());
		if(existProf)
		repository.save(cadastro);
	}
}
