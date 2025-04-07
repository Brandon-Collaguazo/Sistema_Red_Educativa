package ec.edu.ups.poo.clases;

import java.util.List;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private List<Direccion> direccion;

    public Persona(String cedula, String nombre, String apellido, String celular, String correo, List<Direccion> direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
    }
    public Persona() {
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

    public List<Direccion> getDireccion() {
        return direccion;
    }
    public void setDireccion(List<Direccion> direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cédula: " + getCedula() +
                ", Nombre: " + getNombre() +
                ", Apellido: " + getApellido() +
                ", Número de celular: " + getCelular() +
                ", Correo electrónico: " + getCorreo() +
                ", Direccion: " + getDireccion();
    }
}
