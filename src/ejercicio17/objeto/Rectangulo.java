package ejercicio17.objeto;

public class Rectangulo extends Objeto{
    private int base;
    private static int RectangulosCreados=0;
    public Rectangulo(int base, int altura){
        super(altura);
        this.base = base;
        RectangulosCreados++;
    }
    public void escribirRectangulo(){
        for(int i=1; i<=super.altura;i++){
            for(int j=1; j<=base; j++){
                System.err.printf("*");
            }
            if(i==super.altura){

            }else{
                System.out.println();
            }
        }
    }
    public static int getRectangulosCreados(){
        return RectangulosCreados;
    }
    @Override
    public String toString(){
        escribirRectangulo();
        return String.format("");
    }
    

}
