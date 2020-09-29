/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.entidades;

/**
 *
 * @author Teco
 */
public class Cliente {
    //Variables
    private String nombre;
    private String id;
    private boolean nacional;
    private String dir;

    //Propiedades
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public boolean isNacional() {
        return nacional;
    }
    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    public String getDir() {
        return dir;
    }
    public void setDir(String dir) {
        this.dir = dir;
    }
    
    //Constructores
    public Cliente(){}
    public Cliente(String nombre, String id, boolean nacional, String dir){
        this.nombre = nombre;
        this.id = id;
        this. nacional = nacional;
        this.dir = dir;
    }
    
    //Metodos
    @Override
    public String toString() {
        return "Cliente{" + "nombre: " + this.nombre + ", id: " + this.id + ", nacional: " + this.nacional + "direccion: " + this.dir + "}";
    }
}
