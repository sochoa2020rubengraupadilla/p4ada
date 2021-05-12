package ad.spring.practica4RubenGrauPadilla.service;

import ad.spring.practica4RubenGrauPadilla.domain.Substats;
import ad.spring.practica4RubenGrauPadilla.repository.SubstatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubstatsService {
    private final SubstatsRepository substatsRepository;

    @Autowired
    public SubstatsService(SubstatsRepository substatsRepository) {
        this.substatsRepository = substatsRepository;
    }

    public void anyadirSubstat(Substats substats) {
        substatsRepository.save(substats);
    }

    public void eliminarSubstat(Substats substats) {
        substatsRepository.delete(substats);
    }
}
