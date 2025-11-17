package Artículos;  //Aquí nos indica que la clase "Videojuego" está metido en la carpeta "Artículos".

public class Videojuego extends Articulo {  // Nombramos los componentes de la clase "Videojuego" y le hacemos heredar los componentes de la clase padre "Articulo".
    private String director;
    private String plataformas;
    private int pegi;


    //Constructores:
    public Videojuego(String titulo, int anhoLanzamiento, double precioPorDia, String director, String plataformas, int pegi) {  // Creamos el Constructor con todos los componentes de la clase padre "Articulo" junto con todos los componentes de "Videojuego".
        super(titulo, anhoLanzamiento, precioPorDia);  // Esto es lo que la clase "Pelicula" ha heredado de la clase padre.
        this.director = director;
        this.plataformas = plataformas;
        this.pegi = pegi;
    }

    public Videojuego() {  // Creamos otro Constructor totalmente vacío, incluso sin la clase padre.
    }


    // Generamos todos los "Getters and Setters".
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    //Métodos:
    public boolean paraAdultos() {  // Marcamos los parámetros para que pegi sepa que mayor de edad es igual o mayor que 18, y una vez lo sepa nos lo dice con un "true/false".
        return this.pegi >= 18;
    }

    public boolean esApto(int edad) {  // Marcamos el parámetro para saber si la edad que se estipula en el Main es mayor o igual a pegi. Con eso sabremos si la persona es apta para el videojuego.
        return edad >= this.pegi;
    }



    //ToString
    @Override
    public String toString() {  // Para finalizar, realizamos el to String para definir lo que saldrá por consola si lo llamamos en el Main.
        return "[Videojuego] " + getTitulo() + ", de " + this.director + " ( " + getPrecioPorDia() + " €/día)";
    }
}
