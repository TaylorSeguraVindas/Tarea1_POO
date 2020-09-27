package segura.taylor.entidades;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Mascota {

    //Variables

    private String nombre;
    private Duenno duenno;
    private String foto;
    private String observaciones;
    private int ranking;

    //Propiedades
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String value) {
        this.nombre = value;
    }

    public Duenno getDuenno() {
        return this.duenno;
    }

    public void setDuenno(Duenno value) {
        this.duenno = value;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String value) {
        this.foto = value;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void setRanking(int value) {
        this.ranking = value;
    }

    //Constructores
    public Mascota() {
    }

    public Mascota(String pNombre, Duenno pDuenno, String pFoto, String pObservaciones, int pRanking) {
        this.nombre = pNombre;
        this.duenno = pDuenno;
        this.foto = pFoto;
        this.observaciones = pObservaciones;
        this.ranking = pRanking;
    }

    //Metodos
    @Override
    public String toString() {
        String resultado = "Mascota [Nombre: " + this.nombre + ", foto: " + this.foto + ", ranking: " + this.ranking + ", observaciones: " + this.observaciones + "] " + this.duenno.toString();
        return resultado;
    }
}
