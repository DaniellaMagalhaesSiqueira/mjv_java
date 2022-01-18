package mjv.easy_job;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mjv.easy_job.model.RegistroProfissional;

@Component
public class TesteApplication implements CommandLineRunner{
//	
//	@Autowired
//	private RegistroProfissionalRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		RegistroProfissional rp = new RegistroProfissional();
		
	}



}
