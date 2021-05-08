package ad.spring.practica4RubenGrauPadilla.repository;

import ad.spring.practica4RubenGrauPadilla.domain.Personaje;
import org.springframework.data.repository.CrudRepository;

public interface PersonajeRepository extends CrudRepository<Personaje, Integer> {

    public Personaje findByNombrePersonajeAndNivelPersonaje(String nombre, String nivel);
}
