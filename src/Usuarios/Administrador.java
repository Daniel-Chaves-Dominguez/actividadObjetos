package Usuarios;  //Aquí nos indica que la clase "Cliente" está metido en la carpeta "Usuarios".
import Artículos.Articulo;  // Importamos la clase "Articulo" de la carpeta "Artículos".

public class Administrador extends Usuario {  // Nombramos los componentes de la clase "Administrador" y le hacemos heredar los componentes de la clase padre "Usuario".
    public enum Rol {JEFE, VENDEDOR}  // Para marcar el rol, implementamos un "enum" para que se pueda elegir entre el rol de jefe o de vendedor.
    private Rol rol;


    //Constructores:
    public Administrador(String nombreUsuario, String contrasenha, int id, int anhoNacimiento, Rol rol) {  // Creamos el Constructor con todos los componentes de la clase padre "Usuario" junto con todos los componentes de "Administrador".
        super(nombreUsuario, contrasenha, id, anhoNacimiento);  // Esto es lo que la clase "Administrador" ha heredado de la clase padre.
        this.rol = rol;
    }

    public Administrador() {  // Creamos otro Constructor totalmente vacío, incluso sin la clase padre.
    }


    // Generamos todos los "Getters and Setters".
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    //Métodos:
    public void asignarArticulo(Usuario usuario , Articulo articulo) {  // Esto es una fórmula para asignar un artículo a un cliente.
        ((Cliente) usuario).setArticulo(articulo);
    }

    public void retirarArticulo(Usuario usuario) {  // Esto es una fórmula para retirar un artículo a un cliente.
        ((Cliente)usuario).setArticulo(null);
    }


    //ToString
    @Override
    public String toString() {  // Para finalizar, realizamos el to String para definir lo que saldrá por consola si lo llamamos en el Main.
        return "Administrador " + getNombreUsuario() + " (" + getId() + ")";
    }
}
