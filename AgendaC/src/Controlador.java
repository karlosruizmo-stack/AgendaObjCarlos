public class Controlador {
    private Vista vista;
    private Agenda modelo;

    public Controlador(Vista vista, Agenda modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1 -> {
                    String nombre = vista.pedirDato("Ingresar tu nombre");
                    String tel = vista.pedirDato("Ingresar numero de telefono");
                    modelo.agregar(new Contacto(nombre, tel));
                    vista.mostrarMensaje("Guardado");
                }
            }
        } while (opcion != 6);
    }
}