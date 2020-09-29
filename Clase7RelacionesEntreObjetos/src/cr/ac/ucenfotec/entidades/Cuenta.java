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
public class Cuenta {
    //Variables
    private long consecutivo;
    private String tipo;
    private double saldo;
    private String fechaApertura;
    private boolean activa;
    private Cliente cliente;
    
    //Properties
    public long getConsecutivo() {
        return consecutivo;
    }
    public void setConsecutivo(long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }
    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public boolean isActiva() {
        return activa;
    }
    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    //Constructores
    public Cuenta() {}
    public Cuenta(long consecutivo, String tipo, double saldo, String fechaApertura, boolean activa, Cliente cliente){
        this.consecutivo = consecutivo;
        this. tipo = tipo;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.activa = activa;
        this.cliente = cliente;
    }
    
    //Metodos
    @Override
    public String toString(){
        return "Cuenta {" + "consecutivo: " + this.consecutivo + ", tipo: " + this.tipo + ", saldo: " + this.saldo + ", fechaApertura: " + this.fechaApertura + ", activa: " + this.activa + ", cliente: " + this.cliente + "}";
    }
}
