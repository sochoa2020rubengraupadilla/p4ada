package ad.spring.practica4RubenGrauPadilla.service;

import ad.spring.practica4RubenGrauPadilla.domain.Artefactos;
import ad.spring.practica4RubenGrauPadilla.domain.querydsl.QArtefactos;
import ad.spring.practica4RubenGrauPadilla.domain.querydsl.QPersonaje;
import ad.spring.practica4RubenGrauPadilla.repository.ArtefactosRepository;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class ArtefactosService {

    private final ArtefactosRepository artefactosRepository;

    @Autowired
    private EntityManager em;

    @Autowired
    public ArtefactosService(ArtefactosRepository artefactosRepository) {
        this.artefactosRepository = artefactosRepository;
    }

    public void anyadirArtefacto(Artefactos artefactos) {
        artefactosRepository.save(artefactos);
    }

    public void eliminarArtefacto(Artefactos artefactos) {
        artefactosRepository.delete(artefactos);
    }

    public List<Artefactos> findArtefactosByIdPersonaje(String id) {

        QPersonaje qPersonaje = QPersonaje.personaje;
        QArtefactos qArtefactos = QArtefactos.artefactos;

        JPAQuery<Artefactos> query = new JPAQuery<Artefactos>(em)
                .select(qArtefactos)
                .from(qPersonaje)
                .join(qPersonaje.artefactos, qArtefactos)
                .where(qPersonaje.idPersonaje.eq(Integer.valueOf(id)));
        return query.fetch();
    }

    public List<Artefactos> getAllArtefactos(int pagina) {

        Pageable paging = PageRequest.of(pagina, 5, Sort.by("nombreArtefacto"));

        Page<Artefactos> paginas = artefactosRepository.findAll(paging);

        if (paginas.hasContent()) {
            return paginas.getContent();
        } else {
            return new ArrayList<Artefactos>();
        }
    }

}
