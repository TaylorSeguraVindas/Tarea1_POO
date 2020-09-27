package segura.taylor.entidades;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Usuario {
    //Variables
    private String nombreCompleto;
    private int cedula;
    private int telefono;
    private String direccion;
    private String estado;
    private String rol;
    
    //Propiedades
    public String getNombreCompleto(){
        return this.nombreCompleto;
    }
    public void setNombreCompleto(String value){
        this.nombreCompleto = value;
    }
    
    public int getCedula(){
        return this.cedula;
    }
    public void setCedula(int value){
        this.cedula = value;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int value){
        this.telefono = value;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String value){
        this.direccion = value;
    }
    
    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String value){
        this.estado = value;
    }
    
    public String getRol(){
        return this.rol;
    }
    public void setRol(String value){
        this.rol = value;
    }
    
    //Constructores
    public Usuario(){}
    public Usuario(String pNombre, int pCedula, int pTelefono, String pDireccion, String pEstado, String pRol){
        this.nombreCompleto = pNombre;
        this.cedula = pCedula;
        this.telefono = pTelefono;
        this.direccion = pDireccion;
        this.estado = pEstado;
        this.rol = pRol;
    }
    
    //Metodos
}
