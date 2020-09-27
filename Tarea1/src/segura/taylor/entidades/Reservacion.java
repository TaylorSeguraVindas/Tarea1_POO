package segura.taylor.entidades;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Reservacion {
    //Variables
    private String nombreMascota;
    private String fechaEntrada;
    private String fechaSalida;
    
    //Propiedades
    public String getNombreMascota(){
        return this.nombreMascota;
    }
    public void setNombreMascota(String value){
        this.nombreMascota = value;
    }
    
    public String getFechaEntrada(){
        return this.fechaEntrada;
    }
    public void setFechaEntrada(String value){
        this.fechaEntrada = value;
    }
    
    public String getFechaSalida(){
        return this.fechaSalida;
    }
    public void setFechaSalida(String value){
        this.fechaSalida = value;
    }
    
    //Constructores
    public Reservacion(){}
    public  Reservacion(String p_nombreMascota, String p_fechaEntrada, String p_fechaSalida){
        this.nombreMascota = p_nombreMascota;
        this.fechaEntrada = p_fechaEntrada;
        this.fechaSalida = p_fechaSalida;
    }
    
    //Metodos
}
