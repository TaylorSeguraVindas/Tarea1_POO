package segura.taylor.entidades;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Duenno {
    //Variables
    private String nombreCompleto;
    private int cedula;
    private int telefono;
    private String direccion;
    
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
    
    //Constructores
    public Duenno(){}
    public Duenno(String p_nombre, int p_cedula, int p_telefono, String p_direccion){
        this.nombreCompleto = p_nombre;
        this.cedula = p_cedula;
        this.telefono = p_telefono;
        this.direccion = p_direccion;
    }
    
    //Metodos
}
