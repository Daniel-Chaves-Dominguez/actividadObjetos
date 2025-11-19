package Artículos;  //Aquí nos indica que la clase "AlbumMusica" está metido en la carpeta "Artículos".

public class AlbumMusica extends Articulo {   // Nombramos los componentes de la clase "AlbumMusica" y le hacemos heredar los componentes de la clase padre "Articulo".
    private String autor;
    private int  numCanciones;
    private boolean single;

    //Constructores:
    public AlbumMusica(String titulo, int anhoLanzamiento, double precioPorDia, String autor, int numCanciones, boolean single) {   // Creamos el Constructor con todos los componentes de la clase padre "Articulo" junto con todos los componentes de "AlbumMusica".
        super(titulo, anhoLanzamiento, precioPorDia); // Esto es lo que la clase "AlbumMusica" ha heredado de la clase padre.
        this.autor = autor;
        this.numCanciones = numCanciones;
        this.single = single;
    }

    public AlbumMusica() {  // Creamos otro Constructor totalmente vacío, incluso sin la clase padre.
    }

    // Generamos todos los "Getters and Setters".
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    //Métodos:
    public int getDuracionTotal(int duracion) { // Hacemos la fórmula matemática para calcular la duración total del álbum entero. El resultado será devuelto una vez lo llamemos en el Main.
        return duracion * this.numCanciones;
    }


    //ToString
    @Override
    public String toString() {   // Para finalizar, realizamos el to String para definir lo que saldrá por consola si lo llamamos en el Main.
        return "[Álbum] " + getTitulo() + ", de " + this.autor + " ( " + getPrecioPorDia() + " €/día)";
    }
}
