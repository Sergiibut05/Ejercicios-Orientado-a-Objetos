package ejercicio3_parte2;

public class Discos {
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    public Discos(String codigo, String autor, String titulo, String genero, int duracion){
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
    public String getAutor() {
        return autor;
    }
    public String getCodigo() {
        return codigo;
    }
    public int getDuracion() {
        return duracion;
    }
    public String getGenero() {
        return genero;
    }
    public String getTitulo() {
        return titulo;
    }
    @Override
    public String toString(){
        return String.format(
            "-------------------------------------%n"+
            "Código: %s%n"+
            "Autor: %s%n"+
            "Título: %s%n"+
            "Género: %s%n"+
            "Duración: %d%n"+
            "-------------------------------------",codigo,autor,titulo,genero,duracion);
    }

}
