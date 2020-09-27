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
    public Usuario(String p_nombre, int p_cedula, int p_telefono, String p_direccion, String p_estado, String p_rol){
        this.nombreCompleto = p_nombre;
        this.cedula = p_cedula;
        this.telefono = p_telefono;
        this.direccion = p_direccion;
        this.estado = p_estado;
        this.rol = p_rol;
    }
    
    //Metodos
}
