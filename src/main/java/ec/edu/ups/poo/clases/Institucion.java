package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Institucion {
    private int id;
    private String nombre;
    private List<String> sedes;
    private Direccion direccion;
    private List<Asignacion> asignaciones;

    public Institucion() {
        this.sedes = new ArrayList<>();
        this.asignaciones = new ArrayList<>();
    }
    public Institucion(int id, String nombre, List<String> sedes, Direccion direccion, List<Asignacion> asignaciones) {
        this.id = id;
        this.nombre = nombre;
        this.sedes = new ArrayList<>();
        this.direccion = direccion;
        this.asignaciones = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addSedes(String sede) {
        sedes.add(sede);
    }
    public List<String> getSedes() {
        return sedes;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public  void addAsignacion(Asignacion asignacion) {
        asignaciones.add(asignacion);
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sedes=" + sedes +
                ", direccion=" + direccion +
                ", asignaciones=" + asignaciones +
                '}';
    }
}
