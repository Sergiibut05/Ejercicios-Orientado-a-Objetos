package ejercicio11.tarjetaregalo;

public class TarjetaRegalo {
    private int codigo;
    private double saldo;
    public TarjetaRegalo(double saldo){
        this.saldo = saldo;
        this.codigo = (int)((Math.random()*100000)+10000);
    }
    public void gasta(double cantidad){
        if(cantidad>this.saldo){
            System.out.printf("No tiene suficiente saldo para gastar %.2f $%n",cantidad);
        }else{
            this.saldo -= cantidad;
        }
    }
    public TarjetaRegalo fusionaCon(TarjetaRegalo f){
        TarjetaRegalo t3 = new TarjetaRegalo(this.saldo+f.saldo);
        f.saldo=0;
        this.saldo=0;
        return t3;
    }
    @Override
    public String toString(){
        return String.format("Tarjeta no %d - Saldo %.2f$",this.codigo,this.saldo);
    }
}
