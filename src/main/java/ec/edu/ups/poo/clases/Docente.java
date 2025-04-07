package ec.edu.ups.poo.clases;

import java.util.List;

public class Docente extends Persona{
    private List<String> titulo;
    private List<String> aespecializacion;
    public Docente(String cedula, String nombre, String apellido, String celular, String correo, List<Direccion> direccion, List<String> titulo, List<String> aespecializacion) {
        super(cedula, nombre, apellido, celular, correo, direccion);
        this.titulo = titulo;
        this.aespecializacion = aespecializacion;
    }
    public Docente() {

    }
    public List<String> getTitulo() {
        return titulo;
    }
    public void setTitulo(List<String> titulo) {
        this.titulo = titulo;
    }
    public List<String> getAespecializacion() {
        return aespecializacion;
    }
    public void setAespecializacion(List<String> aespecializacion) {
        this.aespecializacion = aespecializacion;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Títulos: " + getTitulo() +
                ", Areas de especialización: " + getAespecializacion();
    }
}
