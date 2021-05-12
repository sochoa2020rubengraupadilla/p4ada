package ad.spring.practica4RubenGrauPadilla.service;

import ad.spring.practica4RubenGrauPadilla.domain.Personaje;
import ad.spring.practica4RubenGrauPadilla.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService {

    private final PersonajeRepository personajeRepository;

    @Autowired
    public PersonajeService(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository;
    }

    public void anyadirPersonaje(Personaje personaje) {
        personajeRepository.save(personaje);
    }

    public void eliminarPersonaje(Personaje personaje) {
        personajeRepository.delete(personaje);
    }
}
