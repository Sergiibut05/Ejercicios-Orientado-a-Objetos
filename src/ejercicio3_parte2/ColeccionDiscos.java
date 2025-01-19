package ejercicio3_parte2;

public class ColeccionDiscos {
    private int tamaño;
    private Discos[] discos;
    public ColeccionDiscos(int tamaño){
        discos = new Discos[tamaño];
    }
    public void listado(){
        for(int i=0; i<tamaño;i++){
            if(discos[i]!=null){
                System.out.println(discos[i]);
            }
        }
    }
    public boolean llenaColeccion(){
        boolean lleno = true;
        for(int i=0; i<tamaño;i++){
            if(discos[i]==null){
                lleno =false;
            }
        }
        
        return lleno;
    }
    public void anadirDisco(){
        if (llenaColeccion() == true){
            System.out.println("Error: La colección está llena.");
        }else{
            System.out.println("NUEVO DISCO");
            System.out.println("===========");
            System.out.println("Por favor, introduzca los datos del disco.");
            System.out.printf("Código: ");
            String codigo = System.console().readLine();
            System.out.printf("%nAutor: ");
            String autor = System.console().readLine();
            System.out.printf("%nTítulo: ");
            String titulo = System.console().readLine();
            System.out.printf("%nGénero: ");
            String genero = System.console().readLine();
            System.out.printf("%nDuración: ");
            int duracion = Integer.parseInt(System.console().readLine());
            System.out.printf("%n");
            Discos t = new Discos(codigo, autor, titulo, genero, duracion);
            for(int i=0; i<tamaño;i++){
                if(discos[i]==null){
                    discos[i] = t;
                }
            }
        }
    }
    public void melapela(Discos t){
        discos[0] = t;
    }

    public void borrarDisco(){
        System.out.println("BORRAR");
        System.out.println("======");
        System.out.println("Por favor, introduzca el código del disco que desea borrar: ");
        String cod = System.console().readLine();
        boolean borrado = false;
        for(int i=0; i<tamaño;i++){
            if(cod.equals(discos[i].getCodigo())){
                borrado = true;
                discos[i] = null;
            }
        }
        if (!borrado){
            System.out.println("Error: No se ha encontrado ningún Disco con ese código.");
        }else{
            System.out.println("Album borrado.");
        }
    }

    public void modificarDisco(){
        System.out.println("MODIFICAR");
        System.out.println("===========");
        System.out.println("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        
        String cod = System.console().readLine();
        int t = consultarPorID(cod);
        Discos d = discos[t];
        if(d!=null){
            System.out.printf("Autor: %s%n", d.getAutor());
            System.out.print("Nuevo Autor: ");
            String autor = System.console().readLine();
            if(autor.isEmpty()){
                autor = d.getAutor();
            }   
            System.out.printf("Título: %s%n", d.getTitulo());
            System.out.print("Nuevo Título: ");
            String titulo = System.console().readLine();
            if(titulo.isEmpty()){
                titulo = d.getTitulo();
            }
            System.out.printf("Género: %s%n", d.getGenero());
            System.out.print("Nuevo Género: ");
            String genero = System.console().readLine();
            if(genero.isEmpty()){
                genero = d.getGenero();
            }
            System.out.printf("Duración: %d%n", d.getDuracion());
            System.out.print("Nueva Duración: ");
            String _duracion = System.console().readLine();
            int duracion = 0;
            if(_duracion.isEmpty())
                duracion = d.getDuracion();
            else
                duracion = Integer.parseInt(_duracion);
            Discos actualizado = new Discos(cod, autor, titulo, genero, duracion);
            discos[t] = actualizado;
        }else{
            System.out.println("El disco no existe en la colección");
        }
        
    }
    public int consultarPorID(String cod){
        int t = -1;
        for(int i=0; i<tamaño;i++){
            if(cod.equals(discos[i].getCodigo())){
                t = i;
                break;
            }
        }
        return t;
    }

}
