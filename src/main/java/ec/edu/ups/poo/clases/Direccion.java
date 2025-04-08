package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.TipoDireccion;

public class Direccion {
    private TipoDireccion tipoDireccion;
    private String cprincipal;
    private String csecundaria;
    private String numeracion;
    private String ciudad;
    private String provincia;
    private String pais;
    public Direccion(TipoDireccion tipoDireccion, String cprincipal, String csecundaria, String numeracion, String ciudad, String provincia, String pais) {
        this.tipoDireccion = tipoDireccion;
        this.cprincipal = cprincipal;
        this.csecundaria = csecundaria;
        this.numeracion = numeracion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }
    public Direccion() {

    }
    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }
    public void setTipoDireccion(TipoDireccion tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    public String getCprincipal() {
        return cprincipal;
    }
    public void setCprincipal(String cprincipal) {
        this.cprincipal = cprincipal;
    }
    public String getCsecundaria() {
        return csecundaria;
    }
    public void setCsecundaria(String csecundaria) {
        this.csecundaria = csecundaria;
    }
    public String getNumeracion() {
        return numeracion;
    }
    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "tipoDireccion=" + tipoDireccion +
                ", cprincipal='" + cprincipal + '\'' +
                ", csecundaria='" + csecundaria + '\'' +
                ", numeracion='" + numeracion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
