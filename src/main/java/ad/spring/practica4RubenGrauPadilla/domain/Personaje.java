package ad.spring.practica4RubenGrauPadilla.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonaje;

    private String nombrePersonaje;

    private String nivelPersonaje;

    @OneToOne(mappedBy = "personaje")
    private Elemento elemento;

    @OneToMany(mappedBy = "personaje")
    @JsonIgnore
    private Set<Artefactos> artefactos;

    public Personaje() {

    }

    public Personaje(String nombre) {
        this.nombrePersonaje = nombre;
    }

    public Personaje(String nombre, String nivel) {
        this.nombrePersonaje = nombre;
        this.nivelPersonaje = nivel;
    }

    public int getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public String getNivelPersonaje() {
        return nivelPersonaje;
    }

    public void setNivelPersonaje(String nivelPersonaje) {
        this.nivelPersonaje = nivelPersonaje;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Set<Artefactos> getArtefactos() {
        return artefactos;
    }

    public void setArtefactos(Set<Artefactos> artefactos) {
        this.artefactos = artefactos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombrePersonaje + " - Nivel: " + nivelPersonaje;
    }
}