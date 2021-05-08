package ad.spring.practica4RubenGrauPadilla.controller;

import ad.spring.practica4RubenGrauPadilla.repository.PersonajeRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class PersonajeController {

    private final PersonajeRepository personajeRepository;

    //Inyeccion dependencias
    PersonajeController(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository;
    }

    @RequestMapping("/pers")
    public String getPersonajes(Model model) {

        model.addAttribute("personajes", personajeRepository.findAll());

        return "personajes";
    }
}
