package ad.spring.practica4RubenGrauPadilla.controller;

import ad.spring.practica4RubenGrauPadilla.domain.Artefactos;
import ad.spring.practica4RubenGrauPadilla.domain.Personaje;
import ad.spring.practica4RubenGrauPadilla.repository.ArtefactosRepository;
import ad.spring.practica4RubenGrauPadilla.repository.PersonajeRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonajeRestController {

    private final Log log = LogFactory.getLog(PersonajeRestController.class);

    private final PersonajeRepository personajeRepository;

    private final ArtefactosRepository artefactosRepository;

    //Inyeccion dependencias
    PersonajeRestController(PersonajeRepository personajeRepository, ArtefactosRepository artefactosRepository) {
        this.personajeRepository = personajeRepository;
        this.artefactosRepository = artefactosRepository;
    }

    @GetMapping("/personajes")
    List<Personaje> getAll() {
        return (List<Personaje>) personajeRepository.findAll();
    }

    @GetMapping("/personajes/{id}")
    Personaje one(@PathVariable int id) {

        Optional<Personaje> personaje = personajeRepository.findById(id);
        if (!personaje.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Personaje no encontrado");
        }
        return personaje.get();
    }

    @PostMapping("/personajes")
    Personaje anyadirPersonaje(@RequestBody Personaje nuevoPersonaje) {
        log.info("nuevoPersonaje");
        return personajeRepository.save(nuevoPersonaje);
    }

    @PutMapping("/personajes/{id}")
    Personaje modificarPersonaje(@RequestBody Personaje nuevoPersonaje, @PathVariable int id) {
        return personajeRepository.findById(id)
                .map(personaje -> {
                    personaje.setNombrePersonaje(nuevoPersonaje.getNombrePersonaje());
                    personaje.setNivelPersonaje(nuevoPersonaje.getNivelPersonaje());
                    return personajeRepository.save(personaje);
                })
                .orElseGet(() -> {
                    nuevoPersonaje.setIdPersonaje(id);
                    return personajeRepository.save(nuevoPersonaje);
                });
    }

    @DeleteMapping("/personajes/{id}")
    void borrarPersonaje(@PathVariable int id) {
        personajeRepository.deleteById(id);
    }

    @GetMapping("/personajes/{nombrePersonaje}/nivel/{nivelPersonaje}")
    Personaje personajePorNombreYNivel(@PathVariable String nombrePersonaje, @PathVariable String nivelPersonaje) {
        return personajeRepository.findByNombrePersonajeAndNivelPersonaje(nombrePersonaje, nivelPersonaje);
    }

    @GetMapping("/artefactosPersonaje/{id}")
    List<Artefactos> artefactosPersonaje(@PathVariable int id) {
        return artefactosRepository.findArtefactosByIdPersonaje(id);
    }

    @GetMapping("/artefactos/{page}")
    List<Artefactos> getAllArtefactos(@PathVariable int page) {
        List<Artefactos> lista = artefactosRepository.getAllArtefactos(page);
        return lista;
    }

}
