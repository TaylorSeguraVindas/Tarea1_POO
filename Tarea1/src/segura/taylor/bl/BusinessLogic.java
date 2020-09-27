package segura.taylor.bl;


import segura.taylor.ui.UI;
import segura.taylor.entidades.Cita;
import segura.taylor.entidades.Mascota;
import segura.taylor.entidades.Reservacion;
import segura.taylor.entidades.Usuario;

/**
 *
 * @author Taylor Segura Vindas
 */
public class BusinessLogic {
    //Variables
    private UI ui = new UI();
    
    private Cita[] citas = new Cita[10];
    private Mascota[] mascotas = new Mascota[10];
    private Reservacion[] reservaciones = new Reservacion[10];
    private Usuario[] usuarios = new Usuario[10];
    
    //Propiedades
    
    //Constructores
    public BusinessLogic(){}
    
    //Metodos
    public void iniciarPrograma(){
        int opcion = 0;
        
        do{    
            opcion = ui.menuInicio();
            procesarOpcion(opcion);
        } while(opcion != 9);
    }
    
    public void procesarOpcion(int opcion){
        switch(opcion){
            case 1:
                registrarCita();
                break;
            case 2:
                listarCitas();
                break;
            case 3:
                registrarReservacion();
                break;
            case 4:
                listarReservaciones();
                break;
            case 5:
                registrarUsuario();
                break;
            case 6:
                listarUsuarios();
                break;
            case 7:
                registrarMascota();
                break;
            case 8:
                listarMascotas();
                break;
            case 9:
                ui.imprimirMensaje("Adios");
                break;
            default:
                ui.imprimirMensaje("Opcion invalida");
                break;
        }
    }
    
    //Citas
    public void registrarCita(){
        Cita nuevaCita = ui.menuRegistrarCita();
        if(nuevaCita != null){
            //Guardar la cita si se recibe una valida.
            for (int i = 0; i < citas.length; i++){
                if(citas[i] == null){
                    citas[i] = nuevaCita;
                    ui.imprimirMensaje("Cita registrada correctamente.");
                    return;
                }
            }
        }
    }    
    public void listarCitas(){
        ui.listarCitas(citas);
    }
    
    //Reservaciones
    public void registrarReservacion(){
        Reservacion nuevaReservacion = ui.menuRegistrarReservacion();
        if(nuevaReservacion != null){
            //Guardar la reservacion si se recibe una valida.
        }
    }
    public void listarReservaciones(){
        ui.listarReservaciones(reservaciones);
    }
    
    //Usuarios
    public void registrarUsuario(){
        Usuario nuevoUsuario = ui.menuRegistrarUsuario();
        if(nuevoUsuario != null){
            //Guardar el usuario si se recibe uno valido.
        }
    }
    public void listarUsuarios(){
        ui.listarUsuarios(usuarios);
    }
    
    //Mascotas
    public void registrarMascota(){
        Mascota nuevaMascota = ui.menuRegistrarMascota();
        if(nuevaMascota != null){
            //Guardar la mascota si se recibe una valida.
        }
    }
    public void listarMascotas(){
        ui.listarMascotas(mascotas);
    }
}
