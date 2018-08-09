package servico;

import org.springframework.stereotype.Service;

import modelo.Medico;
import modelo.Pet;

@Service
public class ServicoImpl implements Servico{
	
	@Override
	public Pet create(Pet pet) {
		return pet;
	}
	
	@Override
	public Medico create(Medico medico) {
		return medico;
	}

}
