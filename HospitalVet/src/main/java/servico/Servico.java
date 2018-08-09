package servico;

import modelo.Pet;
import modelo.Medico;

public interface Servico {

	Pet create(final Pet pet);
	
	Medico create(final Medico medico);
}
