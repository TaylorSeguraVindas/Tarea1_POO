package segura.taylor.ui;

import java.util.Scanner;
import segura.taylor.entidades.Cita;
import segura.taylor.entidades.Mascota;
import segura.taylor.entidades.Reservacion;
import segura.taylor.entidades.Usuario;

/**
 *
 * @author Taylor Segura Vindas
 */
public class UI {
    //Variables
    private Scanner input = new Scanner(System.in).useDelimiter("\\n"); 
    
    //Propiedades
    
    //Constructores
    public UI(){}
    
    //Metodos
    public int menuInicio(){
        System.out.println("***Bienvenido a Veterinaria MOKA***");
        System.out.println("1. Registrar cita");
        System.out.println("2. Listar citas");
        System.out.println("3. Registrar reservacion");
        System.out.println("4. Listar reservaciones");
        System.out.println("5. Registrar usuario");
        System.out.println("6. Listar usuarios");
        System.out.println("7. Registrar mascota");
        System.out.println("8. Listar mascotas");
        System.out.println("9. Salir");
        
        int opcion = input.nextInt();
        return opcion;
    }
    
    //Citas
    public Cita menuRegistrarCita(){
        return null;
    }
    public void listarCitas(Cita[] p_citas){
        
    }
    
    //Reservaciones
    public Reservacion menuRegistrarReservacion(){
        return null;
    }
    public void listarReservaciones(Reservacion[] p_reservaciones){
    
    }
    
    //Usuarios
    public Usuario menuRegistrarUsuario(){
        return null;
    }
    public void listarUsuarios(Usuario[] p_usuarios){
        
    }
    
    //Mascotas
    public Mascota menuRegistrarMascota(){
        return null;
    }
    public void listarMascotas(Mascota[] p_mascotas){
        
    }
}
