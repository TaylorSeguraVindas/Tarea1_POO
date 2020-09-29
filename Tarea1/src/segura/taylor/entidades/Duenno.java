package segura.taylor.entidades;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Duenno {

    //Variables

    private String nombreCompleto;
    private String cedula;
    private String telefono;
    private String direccion;

    //Propiedades
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String value) {
        this.nombreCompleto = value;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String value) {
        this.cedula = value;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String value) {
        this.telefono = value;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String value) {
        this.direccion = value;
    }

    //Constructores
    public Duenno() {
    }

    public Duenno(String pNombre, String pCedula, String pTelefono, String pDireccion) {
        this.nombreCompleto = pNombre;
        this.cedula = pCedula;
        this.telefono = pTelefono;
        this.direccion = pDireccion;
    }

    //Metodos
    @Override
    public String toString() {
        String resultado = "Dueño [Nombre: " + this.nombreCompleto + ", cedula: " + this.cedula + ", telefono: " + this.telefono + ", direccion: " + this.direccion + "]";
        return resultado;
    }
}
