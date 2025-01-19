package ejercicio5_parte2.almacen;

public class Articulo {
    private static final int longitudCodigo = 6;
    private String codigo;
    private String descripcion;
    private Double precioCompra;
    private Double precioVenta;
    private int stock;

    public Articulo(String codigo, String descripcion, Double precioCompra, Double precioVenta, int stock){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }
    public void cargarStock(int cantidad){
        stock += cantidad;
        System.out.println("La mercancía ha entrado en el almacén.");
    }
    public void quitarStock(int cantidad){
        stock -= cantidad;
        System.out.println("La mercancía ha salido en el almacén.");
    }

    public String getCodigo() {
        return codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public static int getLongitudcodigo() {
        return longitudCodigo;
    }
    public Double getPrecioCompra() {
        return precioCompra;
    }
    public Double getPrecioVenta() {
        return precioVenta;
    }
    public int getStock() {
        return stock;
    }
    public String toString(){
        return String.format("""
                ------------------------------------------
                Código: %s
                Descripción: %s
                Precio de compra: %.2f
                Precio de venta: %.2f
                Stock: %d unidades
                ------------------------------------------
                """, codigo,descripcion,precioCompra,precioVenta,stock);
    }
}
