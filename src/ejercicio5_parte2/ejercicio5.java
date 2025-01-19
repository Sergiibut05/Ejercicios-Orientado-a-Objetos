package ejercicio5_parte2;

import ejercicio5_parte2.almacen.Almacen;
import ejercicio5_parte2.almacen.Articulo;

public class ejercicio5 {
    private static Almacen almacen = new Almacen(10);
    public static void main(String[] args) {
        boolean continuar = true;
        int opcion;
        do{
            System.out.println("""
                    G E S T I S I M A L
                    ===================
                    1. Listado
                    2. Alta
                    3. Baja
                    4. Modificación
                    5. Entrada de mercancía
                    6. Salida de mercancía
                    7. Salir
                    """);
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(System.console().readLine());
            menu(opcion);
        }while(continuar);
    }
    public static void entrada(){
        System.out.println("""
                ENTRADA DE MERCANCÍA
                ====================""");
        System.out.print("Por favor, introduzca el código del artículo: ");
        String codigo = System.console().readLine();
        int posicion = almacen.buscarPosicion(codigo);
        almacen.cargarStock(posicion);
    }
    public static void salida(){
        System.out.println("""
                SALIDA DE MERCANCÍA
                ====================""");
        System.out.print("Por favor, introduzca el código del artículo: ");
        String codigo = System.console().readLine();
        int posicion = almacen.buscarPosicion(codigo);
        almacen.salidaStock(posicion);
    }
    public static void baja(){
        System.out.println("""
                ELIMINAR ARTICULO
                =================""");
                System.out.print("Introduzca el código del articulo a eliminar: ");
                String codigo = System.console().readLine();
                int posicion = almacen.buscarPosicion(codigo);
                if(posicion == -1){
                    System.out.println("Error: no se encontro el código del articulo en el almacén");
                }else{
                    almacen.eliminarArticulo(posicion);
                }

    }
    public static void modificar(){
        System.out.println("""
                MODIFICACIÓN
                ============""");
        System.out.print("Por favor, introduzca el código del artículo: ");
        String codigo = System.console().readLine();
        int posicion = almacen.buscarPosicion(codigo);
        if(posicion == -1){
            System.out.println("Error: no se encontro el código del articulo en el almacén");
        }else{
            almacen.modicacion(posicion);
        }
    }
    public static void listado(){
        System.out.println("""
                LISTADO
                =======
                """);
        almacen.leerArticulos();
    }
    public static void alta(){
        int posicion = almacen.buscarhueco();
        if (posicion == -1){
            System.out.println("Error: no se puede añadir más articulos");
        }else{
            System.out.println("""
                NUEVO ARTÍCULO
                ==============
                Por favor, introduzca los datos del artículo.""");
            System.out.print("Código: ");
            String codigo = System.console().readLine();
            System.out.print("Descripcion: ");
            String descripcion = System.console().readLine();
            System.out.print("Precio de compra: ");
            Double precioCompra = Double.parseDouble(System.console().readLine());
            System.out.print("Precio de venta: ");
            Double precioVenta = Double.parseDouble(System.console().readLine());
            System.out.print("Stock: ");
            int stock = Integer.parseInt(System.console().readLine());
            Articulo nuevo = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
            almacen.cargarArticulo(nuevo, posicion);
        }
    }
    public static void menu(int opcion){
        switch (opcion) {
            case 1:
                listado();
                break;
            case 2:
                alta();
                break;
            case 3:
                baja();
                break;
            case 4:
                modificar();
                break;
            case 5:
                entrada();
                break;
            case 6:
                salida();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
