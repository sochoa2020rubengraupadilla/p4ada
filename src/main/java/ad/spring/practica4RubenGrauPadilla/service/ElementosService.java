package ad.spring.practica4RubenGrauPadilla.service;

import ad.spring.practica4RubenGrauPadilla.domain.Elemento;
import ad.spring.practica4RubenGrauPadilla.repository.ElementoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ElementosService {
    private final ElementoRepository elementoRepository;

    @Autowired
    public ElementosService(ElementoRepository elementoRepository) {
        this.elementoRepository = elementoRepository;
    }

    public void anyadirElemento(Elemento elemento) {
        elementoRepository.save(elemento);
    }

    public void eliminarElemento(Elemento elemento) {
        elementoRepository.delete(elemento);
    }
}
