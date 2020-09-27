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
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String value){
        this.nombre = value;
    }
    
    public Duenno getDuenno(){
        return this.duenno;
    }
    public void setDuenno(Duenno value){
        this.duenno = value;
    }
    
    public String getFoto(){
        return this.foto;
    }
    public void setFoto(String value){
        this.foto = value;
    }
    
    public String getObservaciones(){
        return this.observaciones;
    }
    public void setObservaciones(String value){
        this.observaciones = value;
    }
    
    public int getRanking(){
        return this.ranking;
    }
    public void setRanking(int value){
        this.ranking = value;
    }
    
    //Constructores
    public Mascota(){}
    public Mascota(String p_nombre, Duenno p_duenno, String p_foto, String p_observaciones, int p_ranking){
        this.nombre = p_nombre;
        this.duenno = p_duenno;
        this.foto = p_foto;
        this.observaciones = p_observaciones;
        this.ranking = p_ranking;
    }
    
    //Metodos
}
