package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private List<Direccion> direcciones;

    public Persona(String cedula, String nombre, String apellido, String celular, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.direcciones = new ArrayList<>();
    }
    public Persona() {
        this.direcciones = new ArrayList<>();
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void addDireccion(Direccion direccion) {
        direcciones.add(direccion);
    }
    public List<Direccion> getDireccion() {
        return direcciones;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", celular='" + celular + '\'' +
                ", correo='" + correo + '\'' +
                ", direcciones=" + direcciones +
                '}';
    }
}
