package segura.taylor.entidades;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Cita {

    //Variables

    private String nombreMascota;
    private String fecha;
    private String hora;
    private String observaciones;

    //Propiedades
    public String getNombreMascota() {
        return this.nombreMascota;
    }

    public void setNombreMascota(String value) {
        this.nombreMascota = value;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String value) {
        this.fecha = value;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String value) {
        this.hora = value;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    //constructores
    public Cita() {
    }

    public Cita(String pNombreMascota, String pFecha, String pHora, String pObservaciones) {
        this.nombreMascota = pNombreMascota;
        this.fecha = pFecha;
        this.hora = pHora;
        this.observaciones = pObservaciones;
    }

    //Metodos
    @Override
    public String toString() {
        String resultado = "Cita [Mascota: " + this.nombreMascota + ", fecha de la cita: " + this.fecha + ", hora de la cita: " + this.hora + ", observaciones: " + this.observaciones + "]";
        return resultado;
    }
}
