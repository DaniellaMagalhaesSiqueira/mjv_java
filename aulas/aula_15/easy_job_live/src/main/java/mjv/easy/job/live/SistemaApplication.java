package mjv.easy.job.live;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mjv.easy.job.live.model.Cadastro;
import mjv.easy.job.live.repository.CadastroRepository;

@Component
public class SistemaApplication implements CommandLineRunner{

	
	@Autowired
	private CadastroRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		Cadastro lucas = new Cadastro();
		lucas.setAniversario(LocalDate.of(1995, 10, 12));
		lucas.setNome("Lucas Silva");
		boolean exists = repository.existsByNome("Lucas Silva");
		if(exists) {
			System.out.println("Esse registro já existe");
		}else {
			
			repository.save(lucas);
		}
		
	}

}
