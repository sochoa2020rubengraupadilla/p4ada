package ad.spring.practica4RubenGrauPadilla.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "artefactos")
public class Artefactos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArtefacto;

    private String nombreArtefacto;

    private String tipoArtefacto;

    @ManyToOne
    @JoinColumn(name = "Personajes_idPersonaje")
    private Personaje personaje;

    @ManyToMany(mappedBy = "artefactos")
    private Set<Substats> substats = new HashSet<>();

    public Artefactos() {

    }

    public Artefactos(String nombre, String tipo) {
        this.nombreArtefacto = nombre;
        this.tipoArtefacto = tipo;
    }

    public int getIdArtefacto() {
        return idArtefacto;
    }

    public void setIdArtefacto(int idArtefacto) {
        this.idArtefacto = idArtefacto;
    }

    public String getNombreArtefacto() {
        return nombreArtefacto;
    }

    public void setNombreArtefacto(String nombreArtefacto) {
        this.nombreArtefacto = nombreArtefacto;
    }

    public String getTipoArtefacto() {
        return tipoArtefacto;
    }

    public void setTipoArtefacto(String tipoArtefacto) {
        this.tipoArtefacto = tipoArtefacto;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Set<Substats> getSubstats() {
        return substats;
    }

    public void setSubstats(Set<Substats> substats) {
        this.substats = substats;
    }

    @Override
    public String toString() {
        return "Artefacto del set: " + nombreArtefacto + " - Tipo de artefacto: " + tipoArtefacto;
    }

}
