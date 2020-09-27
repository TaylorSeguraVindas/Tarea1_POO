package segura.taylor.entidades;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Cita {
    //Variables
    private String nombreMascota;
    private String fecha;
    private String observaciones;
    
    //Propiedades
    public String getNombreMascota(){
        return this.nombreMascota;
    }
    public void setNombreMascota(String value){
        this.nombreMascota = value;
    }
    
    public String getFecha(){
        return this.fecha;
    }
    public void setFecha(String value){
        this.fecha = value;
    }
    
    public String getObservaciones(){
        return this.observaciones;
    }
    public void setObservaciones(String value){
        this.observaciones = value;
    }
    
    //constructores
    public Cita(){}
    public Cita(String p_nombreMascota, String p_fecha, String p_observaciones){
        this.nombreMascota = p_nombreMascota;
        this.fecha = p_fecha;
        this.observaciones = p_observaciones;
    }
}
