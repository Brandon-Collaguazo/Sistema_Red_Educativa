package ec.edu.ups.poo.clases;

import java.util.List;

public class Administrativo extends Persona {
    private List<String> cargos;
    private List<String> responsabilidades;
    public Administrativo(String cedula, String nombre, String apellido, String celular, String correo, List<Direccion> direccion, List<String> cargos, List<String> responsabilidades) {
        super(cedula, nombre, apellido, celular, correo, direccion);
        this.cargos = cargos;
        this.responsabilidades = responsabilidades;
    }
    public Administrativo() {

    }
    public List<String> getCargos() {
        return cargos;
    }
    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }
    public List<String> getResponsabilidades() {
        return responsabilidades;
    }
    public void setResponsabilidades(List<String> responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Cargos: " + getCargos() +
                ", Responsabilidades: " + getResponsabilidades();
    }
}
