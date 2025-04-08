package ec.edu.ups.poo.clases;

import java.util.GregorianCalendar;
import java.util.List;

public class Visitante extends Persona {
    private String motivo;
    private GregorianCalendar fEntrada;
    private GregorianCalendar fSalida;
    public Visitante(String cedula, String nombre, String apellido, String celular, String correo, List<Direccion> direccion, String motivo, GregorianCalendar fEntrada, GregorianCalendar fSalida) {
        super(cedula, nombre, apellido, celular, correo);
        this.motivo = motivo;
        this.fEntrada = fEntrada;
        this.fSalida = fSalida;
    }
    public Visitante() {

    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public GregorianCalendar getfEntrada() {
        return fEntrada;
    }
    public void setfEntrada(GregorianCalendar fEntrada) {
        this.fEntrada = fEntrada;
    }
    public GregorianCalendar getfSalida() {
        return fSalida;
    }
    public void setfSalida(GregorianCalendar fSalida) {
        this.fSalida = fSalida;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Motivo: " + getMotivo() +
                ", Fecha de entrada: " + getfEntrada() +
                ", Fecha de salida: " + getfSalida();
    }
}
