/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec;

import cr.ac.ucenfotec.entidades.Cliente;
import cr.ac.ucenfotec.entidades.Cuenta;
/**
 *
 * @author Teco
 */
public class Clase7RelacionesEntreObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente unCliente = new Cliente();
        unCliente.setNombre("Yajairo");
        unCliente.setNacional(true);
        unCliente.setDir("San Pedro");
        unCliente.setId("7-0001-0002");
        
        Cuenta unaCuenta = new Cuenta(1, "DEBITO", 10000.00, "2020-09-28", true, unCliente);
        
    }
    
}
