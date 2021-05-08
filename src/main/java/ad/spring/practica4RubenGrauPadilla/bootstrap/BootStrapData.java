package ad.spring.practica4RubenGrauPadilla.bootstrap;

import ad.spring.practica4RubenGrauPadilla.domain.Elemento;
import ad.spring.practica4RubenGrauPadilla.domain.Personaje;
import ad.spring.practica4RubenGrauPadilla.repository.ArtefactosRepository;
import ad.spring.practica4RubenGrauPadilla.repository.ElementoRepository;
import ad.spring.practica4RubenGrauPadilla.repository.PersonajeRepository;
import ad.spring.practica4RubenGrauPadilla.repository.SubstatsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PersonajeRepository personajeRepository;
    private final ElementoRepository elementoRepository;
    private final ArtefactosRepository artefactosRepository;
    private final SubstatsRepository substatsRepository;

    public BootStrapData(PersonajeRepository personajeRepository, ElementoRepository elementoRepository,
                         ArtefactosRepository artefactosRepository, SubstatsRepository substatsRepository) {
        this.personajeRepository = personajeRepository;
        this.elementoRepository = elementoRepository;
        this.artefactosRepository = artefactosRepository;
        this.substatsRepository = substatsRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        Personaje p = new Personaje("Hu Tao", "90");
//        Elemento e = new Elemento("Pyro");
//
//        personajeRepository.save(p);
//        elementoRepository.save(e);
//
//        System.out.println("Número personajes: " + personajeRepository.count());
//        System.out.println("Número elementos: " + elementoRepository.count());
    }
}
