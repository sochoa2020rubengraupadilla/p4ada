package ad.spring.practica4RubenGrauPadilla.controller;

import ad.spring.practica4RubenGrauPadilla.repository.ArtefactosRepository;

public class ArtefactosController {

    private final ArtefactosRepository artefactosRepository;

    ArtefactosController(ArtefactosRepository artefactosRepository) {
        this.artefactosRepository = artefactosRepository;
    }
}
