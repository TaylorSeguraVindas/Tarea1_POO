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
    public String getNombreMascota() {
        return this.nombreMascota;
    }

    public void setNombreMascota(String value) {
        this.nombreMascota = value;
    }

    public String getFechaEntrada() {
        return this.fechaEntrada;
    }

    public void setFechaEntrada(String value) {
        this.fechaEntrada = value;
    }

    public String getFechaSalida() {
        return this.fechaSalida;
    }

    public void setFechaSalida(String value) {
        this.fechaSalida = value;
    }

    //Constructores
    public Reservacion() {
    }

    public Reservacion(String pNombreMascota, String pFechaEntrada, String pFechaSalida) {
        this.nombreMascota = pNombreMascota;
        this.fechaEntrada = pFechaEntrada;
        this.fechaSalida = pFechaSalida;
    }

    //Metodos
    @Override
    public String toString() {
        String resultado = "Reservacion [Mascota: " + this.nombreMascota + ", fecha de entrada: " + this.fechaEntrada + ", fecha de salida: " + this.fechaSalida + "]";
        return resultado;
    }
}
