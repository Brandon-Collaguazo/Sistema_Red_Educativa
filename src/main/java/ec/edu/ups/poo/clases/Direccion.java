package ec.edu.ups.poo.clases;

public class Direccion {
    private String tipo;
    private String cprincipal;
    private String csecundaria;
    private String numeracion;
    private String ciudad;
    private String provincia;
    private String pais;
    public Direccion(String tipo, String cprincipal, String csecundaria, String numeracion, String ciudad, String provincia, String pais) {
        this.tipo = tipo;
        this.cprincipal = cprincipal;
        this.csecundaria = csecundaria;
        this.numeracion = numeracion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }
    public Direccion() {

    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
                "Tipo: '" + tipo + '\'' +
                ", Calle principal: '" + cprincipal + '\'' +
                ", Calle secundaria: '" + csecundaria + '\'' +
                ", Numeración: '" + numeracion + '\'' +
                ", Ciudad: '" + ciudad + '\'' +
                ", Provincia: '" + provincia + '\'' +
                ", País: '" + pais + '\'' +
                '}';
    }
}
