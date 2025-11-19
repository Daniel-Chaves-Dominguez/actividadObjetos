package Artículos;  //Aquí nos indica que la clase "Libro" está metido en la carpeta "Artículos".

public class Libro  extends Articulo {  // Nombramos los componentes de la clase "Libro" y le hacemos heredar los componentes de la clase padre "Articulo".
    private String autor;
    private int numPaginas;
    public enum Genero { MISTERIO, TERROR, ACCION, FANTASIA, HISTORIA }  // Creamos un "enum" para implementarle posibles géneros que puede ser el libro que queramos poner en el Main.
    private Genero genero;

    //Constructores:
    public Libro(String titulo, int anhoLanzamiento, double precioPorDia, String autor, int numPaginas, Genero genero) {  // Creamos el Constructor con todos los componentes de la clase padre "Articulo" junto con todos los componentes de "Libro".
        super(titulo, anhoLanzamiento, precioPorDia);  // Esto es lo que la clase "Libro" ha heredado de la clase padre.
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    public Libro() {  // Creamos otro Constructor totalmente vacío, incluso sin la clase padre.
    }


    public Libro(String titulo, int anhoLanzamiento, double precioPorDia, String autor, Genero genero) { //Creamos un Constructor especial dado el enunciado.
        super(titulo, anhoLanzamiento, precioPorDia);
        this.autor = autor;
        this.genero = genero;
        this.numPaginas = 100;  // El enunciado quiere que se haga un Constructor donde ponga que si o si el libro tenga 100 páginas, ni una más ni una menos.
    }



    // Generamos todos los "Getters and Setters".
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    //Métodos:
    public boolean esLargo(){  // Estipulamos los términos para saber si el libro es largo. Si tiene más de 200 páginas se denominará largo, y nos devolverá un "true" a la consola, en caso contrario será "false".
        return this.numPaginas > 200;
    }


    //ToString
    @Override
    public String toString() {  // Para finalizar, realizamos el to String para definir lo que saldrá por consola si lo llamamos en el Main.
        return "[Libro] " + getTitulo() + ", de " + this.autor + " ( " + getPrecioPorDia() + " €/día)";
    }
}
