package ejercicio4.fraccion;

public class Fraccion {
    private int numerador;
    private int denominador;
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;

    }
    public Fraccion multiplicar(int numero){
        return new Fraccion(this.numerador*numero, this.denominador*numero);
    }
    public Fraccion multiplicar(Fraccion f){
        return new Fraccion(this.numerador*f.numerador, this.denominador*f.denominador);
    }
    public Fraccion dividir(int numero){
        return new Fraccion(this.numerador, this.denominador*numero);
    }
    public Fraccion dividir(Fraccion f){
        return new Fraccion(this.numerador*f.denominador, this.denominador*f.numerador);
    }
    public Fraccion invierte(){
        return new Fraccion(this.denominador, this.numerador);
    }
    public Fraccion potencia(){
        return new Fraccion(numerador, denominador);
    }
    
    @Override
    public String toString(){
        return String.format("%d/%d",this.numerador,this.denominador);
    }
}
