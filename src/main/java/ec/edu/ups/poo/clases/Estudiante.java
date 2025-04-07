package ec.edu.ups.poo.clases;

import java.util.List;

public class Estudiante extends Persona{
    private String carrera;
    public Estudiante(String cedula, String nombre, String apellido, String celular, String correo, List<Direccion> direccion, String carrera) {
        super(cedula, nombre, apellido, celular, correo, direccion);
        this.carrera = carrera;
    }
    public Estudiante() {

    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Carrera: " + getCarrera();
    }
}
