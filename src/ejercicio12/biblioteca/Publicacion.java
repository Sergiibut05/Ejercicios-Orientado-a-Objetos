package ejercicio12.biblioteca;

public abstract class Publicacion {
    private String ISBN;
    private String Titulo;
    private int Anopubli;
    protected Publicacion(String ISBN, String Titulo, int Anopubli){
        this.ISBN=ISBN;
        this.Titulo=Titulo;
        this.Anopubli=Anopubli;
    }
}
