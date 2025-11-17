package Artículos;  //Aquí nos indica que la clase "Articulo" está metido en la carpeta "Artículos".

public class Articulo {  // Nombramos los componentes de la clase "Articulo", que será la clase padre de la carpeta "Artículos".
    private String titulo;
    private int anhoLanzamiento;
    private double precioPorDia;

    //Constructores:
    public Articulo(String titulo, int anhoLanzamiento, double precioPorDia) {  // Creamos el Constructor con todos los componentes.
        this.titulo = titulo;
        this.anhoLanzamiento = anhoLanzamiento;
        this.precioPorDia = precioPorDia;
    }


    public Articulo() {  // Creamos otro Constructor totalmente vacío.
    }


    // Generamos todos los "Getters and Setters".
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnhoLanzamiento() {
        return anhoLanzamiento;
    }

    public void setAnhoLanzamiento(int anhoLanzamiento) {
        this.anhoLanzamiento = anhoLanzamiento;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    //Métodos:
    public double calcularPrecio(int numArticulos, int dias){  // Hacemos la fórmula matemática para calcular el precio por días. El resultado será devuelto una vez lo llamemos en el Main.
        return numArticulos * dias * this.precioPorDia;
    }


    //ToString
    @Override
    public String toString() {  // Para finalizar, realizamos el to String para definir lo que saldrá por consola si lo llamamos en el Main.
        return "[Artículos] " + this.titulo + " ( " + this.precioPorDia + " €/día)";
    }
}
