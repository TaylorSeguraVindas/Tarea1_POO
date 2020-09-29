package segura.taylor.entidades;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Usuario {

    //Variables

    private String nombreCompleto;
    private String cedula;
    private String telefono;
    private String direccion;
    private String estado;
    private String rol;

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

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String value) {
        this.estado = value;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String value) {
        this.rol = value;
    }

    //Constructores
    public Usuario() {
    }

    public Usuario(String pNombre, String pCedula, String pTelefono, String pDireccion, String pEstado, String pRol) {
        this.nombreCompleto = pNombre;
        this.cedula = pCedula;
        this.telefono = pTelefono;
        this.direccion = pDireccion;
        this.estado = pEstado;
        this.rol = pRol;
    }

    //Metodos
    @Override
    public String toString() {
        String resultado = "Usuario [Nombre: " + this.nombreCompleto + ", cedula: " + this.cedula + ", telefono: " + this.telefono + ", direccion: " + this.direccion + ", estado: " + this.estado + ", rol: " + this.rol + "]";
        return resultado;
    }
}
