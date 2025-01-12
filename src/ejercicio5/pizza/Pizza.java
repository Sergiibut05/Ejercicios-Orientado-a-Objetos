package ejercicio5.pizza;

public class Pizza {
    private String tamaño;
    private String tipo;
    private String estado;
    private static int Totalpedidos=0;
    private static int Totalservidos=0;
    public Pizza(String tamaño, String tipo){
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado= "pedido";
        Totalpedidos++;
    }

    public static int getTotalPedidas(){
        return Totalpedidos;
    }
    public static int getTotalServidas(){
        return Totalservidos;
    }
    public void sirve(){
        if(this.estado.equals("pedido")){
            this.estado = "servido"; 
            Totalservidos++;
        }else{
            System.out.println("Error: ya esta servido");
        }
    }
    @Override
    public String toString() {
        return "Pizza " + tipo + ", " + tamaño + ", " + estado;
    }
}
