package ejercicio10.ameba;

public class Ameba {
    private int peso;
    public Ameba(){
        this.peso=3;
    }
    public void come(int comida){
        this.peso += comida-1;
    }
    public void come(Ameba f){
        this.peso += f.peso-1;
        f.peso = 0;
    }
    @Override
    public String toString(){
        return "Soy una ameba y peso "+this.peso+" microgramos.";
    }

}
