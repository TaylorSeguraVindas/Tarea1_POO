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
    public UI() {
    }

    //Metodos
    public int menuInicio() {
        System.out.print("\n\n\n\n");
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

        System.out.print("\nSu opcion: ");
        int opcion = input.nextInt();
        return opcion;
    }

    //Citas
    public Cita menuRegistrarCita() {
        System.out.println("\n\nBienvenido al registro de citas");
        System.out.print("Ingrese el nombre de la mascota: ");
        String nombre = input.next();

        System.out.print("Ingrese la fecha de la cita: ");
        String fecha = input.next();

        System.out.print("Ingrese las observaciones: ");
        String observaciones = input.next();

        Cita nuevaCita = new Cita(nombre, fecha, observaciones);
        return nuevaCita;
    }

    public void listarCitas(Cita[] citas) {
        System.out.println("\n\nListado de citas");
        for (int i = 0; i < citas.length; i++) {
            if (citas[i] != null) {
                System.out.println((i + 1) + ". " + citas[i].toString());
            }
        }
    }

    //Reservaciones
    public Reservacion menuRegistrarReservacion() {
        System.out.println("\n\nBienvenido al registro de reservaciones");
        System.out.print("Ingrese el nombre de la mascota: ");
        String nombre = input.next();

        System.out.print("Ingrese la fecha de entrada: ");
        String fechaEntrada = input.next();

        System.out.print("Ingrese la fecha de salida: ");
        String fechaSalida = input.next();

        Reservacion nuevaReservacion = new Reservacion(nombre, fechaEntrada, fechaSalida);
        return nuevaReservacion;
    }

    public void listarReservaciones(Reservacion[] reservaciones) {
        System.out.println("\n\nListado de reservaciones");
        for (int i = 0; i < reservaciones.length; i++) {
            if (reservaciones[i] != null) {
                System.out.println((i + 1) + ". " + reservaciones[i].toString());
            }
        }
    }

    //Usuarios
    public Usuario menuRegistrarUsuario() {
        return null;
    }

    public void listarUsuarios(Usuario[] usuarios) {

    }

    //Mascotas
    public Mascota menuRegistrarMascota() {
        return null;
    }

    public void listarMascotas(Mascota[] mascotas) {

    }

    //Otros
    public void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
