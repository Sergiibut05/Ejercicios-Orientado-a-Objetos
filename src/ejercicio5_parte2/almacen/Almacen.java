package ejercicio5_parte2.almacen;

public class Almacen {
    private Articulo[] articulos;

    public Almacen(int tamaño){
        this.articulos = new Articulo[tamaño];
    }
    public void cargarStock(int posicion){
        System.out.println("Entrada de mercancía del siguiente artículo:");
        System.out.println(articulos[posicion]);
        System.out.print("Introduzca el número de unidades que entran: ");
        int cantidad = Integer.parseInt(System.console().readLine());
        articulos[posicion].cargarStock(cantidad);
    }
    public void salidaStock(int posicion){
        System.out.println("Salida de mercancía del siguiente artículo:");
        System.out.println(articulos[posicion]);
        System.out.print("Introduzca el número de unidades que salen: ");
        int cantidad = Integer.parseInt(System.console().readLine());
        if(cantidad<=articulos[posicion].getStock()){
            articulos[posicion].quitarStock(cantidad);
        }else{
            System.out.println("Error: Cantidad introducida superior a la que hay.");
        }
    }
    public void modicacion(int posicion){
        System.out.println("Introduzca los nuevos datos del artículo o INTRO para dejarlos igual.");
        System.out.println("Código: "+articulos[posicion].getCodigo());
        System.out.print("Nuevo código: ");
        String codigo = System.console().readLine();
        if(codigo.isEmpty()){
            codigo = articulos[posicion].getCodigo();
        }
        System.out.println("Descripción: "+articulos[posicion].getDescripcion());
        System.out.print("Nueva Descripción");
        String descripcion = System.console().readLine();
        if(descripcion.isEmpty()){
            descripcion = articulos[posicion].getDescripcion();
        }
        System.out.println("Precio de compra: "+articulos[posicion].getPrecioCompra());
        System.out.print("Nuevo precio de compra: ");
        String _precioCompra = System.console().readLine();
        Double precioCompra = 0.00;
        if(_precioCompra.isEmpty()){
            precioCompra = articulos[posicion].getPrecioCompra();
        }else{
            precioCompra = Double.parseDouble(_precioCompra);
        }
        System.out.println("Precio de venta: "+articulos[posicion].getPrecioVenta());
        System.out.print("Nuevo precio de venta: ");
        String _precioVenta = System.console().readLine();
        Double precioVenta = 0.00;
        if(_precioVenta.isEmpty()){
            precioVenta = articulos[posicion].getPrecioVenta();
        }else{
            precioVenta = Double.parseDouble(_precioVenta);
        }
        System.out.println("Stock: "+articulos[posicion].getStock());
        System.out.print("Nuevo stock: ");
        String _stock = System.console().readLine();
        int stock = 0;
        if(_stock.isEmpty()){
            stock = articulos[posicion].getStock();
        }else{
            stock = Integer.parseInt(_stock);
        }
        Articulo actualizado = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
        cargarArticulo(actualizado, posicion);
    }
    public void eliminarArticulo(int posicion){
        articulos[posicion] = null;
        if(articulos[posicion] == null){
            System.out.println("El artículo fue elimado correctamente");
        }else{
            System.out.println("Error: Ha habido un problema en la eliminación del articulo");
        }
    }
    public int buscarPosicion(String codigo){
        int posicion = -1;
        for(int i=0; i<articulos.length; i++){
            if(articulos[i]!=null && codigo.equals(articulos[i].getCodigo())){
                posicion = i;
            }
        }
        return posicion;
    }
    public void leerArticulos(){
        for(int i=0; i<articulos.length; i++){
            if(articulos[i]!=null){
                System.out.println(articulos[i]);
            }
        }
    }
    public void cargarArticulo(Articulo d, int posicion){
        articulos[posicion] = d;
    }
    public int buscarhueco(){
        int posicion = -1;
        for(int i=0; i<articulos.length; i++){
            if(articulos[i]==null){
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    


}
