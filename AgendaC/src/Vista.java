import java.util.Scanner;

public class Vista {
    private Scanner sc = new Scanner(System.in);


    public int mostrarMenu() {
        System.out.println("\n===== AGENDA DE CONTACTOS =====");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Mostrar contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Modificar contacto");
        System.out.println("5. Eliminar contacto");
        System.out.println("6. Salir");
        System.out.print("Opciones: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }
    public String pedirDato(String mensaje) {
        System.out.print(mensaje + ": ");
        return sc.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}