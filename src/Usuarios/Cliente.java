package Usuarios;  //Aquí nos indica que la clase "Cliente" está metido en la carpeta "Usuarios".
import Artículos.Articulo;  // Importamos la clase "Articulo" de la carpeta "Artículos".


public class Cliente extends Usuario {  // Nombramos los componentes de la clase "Cliente" y le hacemos heredar los componentes de la clase padre "Usuario".
    private Articulo articulo;
    private int numSocio;


    //Constructores:
    public Cliente(String nombreUsuario, String contrasenha, int id, int anhoNacimiento, Articulo articulo, int numSocio) {  // Creamos el Constructor con todos los componentes de la clase padre "Usuario" junto con todos los componentes de "Cliente".
        super(nombreUsuario, contrasenha, id, anhoNacimiento);  // Esto es lo que la clase "Cliente" ha heredado de la clase padre.
        this.articulo = articulo;
        this.numSocio = numSocio;
    }


    public Cliente() {  // Creamos otro Constructor totalmente vacío, incluso sin la clase padre.
    }




    // Generamos todos los "Getters and Setters".
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    //Métodos:
    public double calcularPrecio(int numArticulos, int dias) {  // Hacemos una fórmula matemática para calcular el precio total para un número de artículos y un número de días, teniendo en cuenta el artículo del cliente.
    return this.getArticulo().calcularPrecio(numArticulos, dias);
    }


    //ToString
    @Override
    public String toString() {  // Para finalizar, realizamos el to String para definir lo que saldrá por consola si lo llamamos en el Main.
        return "Cliente " + getNombreUsuario() + " (" + getId() + ")";
    }
}
