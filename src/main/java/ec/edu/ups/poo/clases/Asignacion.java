package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.Rol;
import java.util.GregorianCalendar;

public class Asignacion {
    private Persona persona;
    private GregorianCalendar fInicio;
    private Rol rol;
    public Asignacion(Persona persona, GregorianCalendar fInicio, Rol rol) {
        this.persona = persona;
        this.fInicio = fInicio;
        this.rol = rol;
    }
    public Asignacion() {
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public GregorianCalendar getfInicio() {
        return fInicio;
    }
    public void setfInicio(GregorianCalendar fInicio) {
        this.fInicio = fInicio;
    }
    public Rol getRol() {
        return rol;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Asignacion{" +
                "persona=" + persona +
                ", fInicio=" + fInicio +
                ", rol=" + rol +
                '}';
    }
}
