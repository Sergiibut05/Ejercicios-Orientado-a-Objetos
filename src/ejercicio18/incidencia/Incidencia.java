package ejercicio18.incidencia;

public class Incidencia {
    
    private static int numIncidenciaTotal = 0;
    private int numIncidencia;
    private int puesto;
    private String problema;
    private String solucion;
    private String estado;
    private static int Pendientes = 0;
    public Incidencia(int puesto, String problema){
        this.puesto = puesto;
        this.problema = problema;
        numIncidenciaTotal++;
        Pendientes++;
        this.numIncidencia = numIncidenciaTotal;
        this.estado = "Pendiente";
        this.solucion = "";
    }
    public void resuelve(String sol){
        solucion = sol;
        estado = "Resuelta";
        Pendientes--;
    }
    public static int getPendientes(){
        return Pendientes;
    }
    public String toString(){
        if(estado.equals("Resuelta")){
            return String.format("Incidencia %d - Puesto: %d - %s - %s - %s",this.numIncidencia,puesto,problema,estado,solucion);
        }else{
            return String.format("Incidencia %d - Puesto: %d - %s - %s",this.numIncidencia,puesto,problema,estado);
        }
    }

}
