package ejercicio8.terminal;

public class Terminal {
    private int tiempoconversacion;
    private String numerin;
    public Terminal(String numerin){
        this.tiempoconversacion = tiempoconversacion;
        this.numerin = numerin;

    }
    public void llama(Terminal f, int tiempo){
        this.tiempoconversacion += tiempo;
        f.tiempoconversacion += tiempo;
    }
    @Override
    public String toString() {
        return "No "+this.numerin+" - "+this.tiempoconversacion+" de conversación";
    }
}
