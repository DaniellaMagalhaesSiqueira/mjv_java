package mjv.easy_job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mjv.easy_job.model.RegistroProfissional;
import mjv.easy_job.repository.RegistroProfissionalRepository;

@RestController
@RequestMapping("/registros")
public class RegistroProfissionalController {
	
	@Autowired
	private RegistroProfissionalRepository repository;
	
	@GetMapping
	public List<RegistroProfissional> getRegistros(){
		return repository.findAll();
	}

}
