package Artículos;  //Aquí nos indica que la clase "Pelicula" está metido en la carpeta "Artículos".

public class Pelicula extends Articulo {  // Nombramos los componentes de la clase "Pelicula" y le hacemos heredar los componentes de la clase padre "Articulo".
    private String director;
    private int duracion;

    //Constructores:
    public Pelicula(String titulo, int anhoLanzamiento, double precioPorDia, String director, int duracion) {  // Creamos el Constructor con todos los componentes de la clase padre "Articulo" junto con todos los componentes de "Pelicula".
        super(titulo, anhoLanzamiento, precioPorDia);  // Esto es lo que la clase "Pelicula" ha heredado de la clase padre.
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {  // Creamos otro Constructor totalmente vacío, incluso sin la clase padre.
    }


    // Generamos todos los "Getters and Setters".
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //Métodos:
    public void getDuracionHorasYMinutos() {   // Hacemos la fórmula matemática para calcular cuántas horas y minutos dura la película. El resultado será devuelto una vez lo llamemos en el Main.
        int horas = this.duracion / 60;
        int minutos = this.duracion % 60;
        System.out.println(horas + "horas y " + minutos + "minutos");
    }


    public int getDuracionSegundos() {   // Hacemos la fórmula matemática para calcular cuánto segundos dura la película. El resultado será devuelto una vez lo llamemos en el Main.
        return this.duracion * 60;
    }



    //ToString
    @Override
    public String toString() {  // Para finalizar, realizamos el to String para definir lo que saldrá por consola si lo llamamos en el Main.
        return "[Película] " + getTitulo() + ", de " + this.director + " ( " + getPrecioPorDia() + " €/día)";
    }
}
