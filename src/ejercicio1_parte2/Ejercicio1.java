package ejercicio1_parte2;
import ejercicio1_parte2.gato.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        Gato[] gatos = new Gato[4];
        String nombre;
        String color;
        String raza;
        System.out.println("Por favor, introduzca los datos de los gatos.");
        
        for(int i=1;i<=4;i++){
            System.out.println("Gato no "+i);
            System.out.printf("Nombre: ");
            nombre = System.console().readLine();
            System.out.println("Color: ");
            color = System.console().readLine();
            System.out.println("Raza: ");
            raza = System.console().readLine();
            Gato d = new Gato(nombre, color, raza);
            gatos[i-1] = d;
        }
        for(int i=0; i<4;i++){
            gatos[i].descripcionGato();
        }
    }
}
