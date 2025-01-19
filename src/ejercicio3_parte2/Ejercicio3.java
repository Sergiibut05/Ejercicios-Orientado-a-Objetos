package ejercicio3_parte2;

public class Ejercicio3 {
    private static ColeccionDiscos coleccion = new ColeccionDiscos(10);
    
    public static void main(String[] args) {
        Discos discot = new Discos("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        coleccion.melapela(discot);
        menu();
    }
    public static void menu(){
        boolean activo = true;
        int opcion = 0;
        do{
            System.out.println("COLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.printf("Introduzca una opción: ");
            opcion = Integer.parseInt(System.console().readLine());
            opciones(opcion);
        }while(activo);
    }
    public static void opciones(int opcion){
        switch (opcion) {
            case 1:
                coleccion.listado();
                break;
            case 2:
                coleccion.anadirDisco();
                break;
            case 3:
                coleccion.modificarDisco();
                break;
            case 4:
                coleccion.borrarDisco();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                break;
        }
    }
    
}
