package ad.spring.practica4RubenGrauPadilla.repository;

import ad.spring.practica4RubenGrauPadilla.domain.Artefactos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArtefactosRepository extends CrudRepository<Artefactos, Integer> {

    //public List<Artefactos> findArtefactosByIdPersonaje(int id);

    Page<Artefactos> findAll(Pageable paging);

    //public List<Artefactos> getAllArtefactos(int pagina);


}
