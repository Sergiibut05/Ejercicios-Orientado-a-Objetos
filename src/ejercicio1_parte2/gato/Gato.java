package ejercicio1_parte2.gato;

public class Gato {
    private String nombre;
    private String color;
    private String raza;
    private int numgato;
    private static int numgatoTotal = 0;
    
    public Gato(String nombre, String color, String raza){
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        numgatoTotal++;
        this.numgato = numgatoTotal;
    }
    public void descripcionGato(){
        System.out.println("Gato no "+this.numgato);
        System.out.println("Nombre: "+nombre);
        System.out.println("Color: "+color);
        System.out.println("Raza: "+raza);
    }
}
