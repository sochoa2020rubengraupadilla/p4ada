package ad.spring.practica4RubenGrauPadilla.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "substats")
public class Substats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSubstats;

    private String nombreSubstat;

    @ManyToMany
//    @JoinColumn(name = "artefactos_has_substats",
//            joinColumns = @JoinColumn(name = "Artefactos_idArtefacto"),
//            inverseJoinColumns = @JoinColumn(name = "Substats_idSubstats")
//    )
    @JsonIgnore
    private Set<Artefactos> artefactos = new HashSet<>();

    public Substats() {

    }

    public Substats(String nombreSubstat) {
        this.nombreSubstat = nombreSubstat;
    }

    public int getIdSubstats() {
        return idSubstats;
    }

    public void setIdSubstats(int idSubstats) {
        this.idSubstats = idSubstats;
    }

    public String getNombreSubstat() {
        return nombreSubstat;
    }

    public void setNombreSubstat(String nombreSubstat) {
        this.nombreSubstat = nombreSubstat;
    }

    public Set<Artefactos> getArtefactos() {
        return artefactos;
    }

    public void setArtefactos(Set<Artefactos> artefactos) {
        this.artefactos = artefactos;
    }

    @Override
    public String toString() {
        return "Substat: " + nombreSubstat;
    }
}
