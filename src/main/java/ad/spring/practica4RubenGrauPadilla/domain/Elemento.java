package ad.spring.practica4RubenGrauPadilla.domain;

import javax.persistence.*;

@Entity
@Table(name = "elementos")
public class Elemento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idElemento;

    private String nombreElemento;

    @OneToOne
    @JoinColumn(name = "Personajes_idPersonaje")
    private Personaje personaje;

    public Elemento() {

    }

    public Elemento(String nombre) {
        this.nombreElemento = nombre;
    }

    public int getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(int idElemento) {
        this.idElemento = idElemento;
    }

    public String getNombreElemento() {
        return nombreElemento;
    }

    public void setNombreElemento(String nombreElemento) {
        this.nombreElemento = nombreElemento;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreElemento;
    }
}