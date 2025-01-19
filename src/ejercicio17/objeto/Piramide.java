package ejercicio17.objeto;

public class Piramide extends Objeto{
    private static int PiramidesCreadas = 0;
    public Piramide(int altura){
        super(altura);
        PiramidesCreadas++;
    }
    public void escribirPiramide(){
        for(int i=1;i<=super.altura ;i++){
            for(int j=i;j>=1;j--){
                System.err.printf("*");
            }
            if(i==super.altura){

            }else{
                System.out.println();
            }
            
        }
    }
    public static int getPiramidesCreadas(){
        return PiramidesCreadas;
    }
    @Override
    public String toString(){
        escribirPiramide();
        return String.format("");
    }
}
