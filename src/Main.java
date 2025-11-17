import Artículos.Libro;
import Artículos.Pelicula;
import Artículos.Videojuego;   // Todas las clases y carpetas que hemos importado al Main.
import Artículos.albumMusica;
import Usuarios.Administrador;
import Usuarios.Cliente;


public class Main {
    public static void main(String[] args) {
        //Crea 2 artículos de cada tipo
        Videojuego juego1 = new Videojuego("Uncharted 4", 2016, 6, "Neil Druckmann", "PS4,PS5", 18);
        Videojuego juego2 = new Videojuego("The last of us", 2013, 5, "Bruce Straley", "PS3,PS4,PS5", 18);

        Pelicula pelicula1 = new Pelicula("Star Wars", 1977, 3, "George Lucas", 121);
        Pelicula pelicula2 = new Pelicula("La Muerte Tenía un Precio", 1965, 2, "Sergio Leone", 132);

        Libro libro1 = new Libro("El Código Da Vinci", 2016, 4, "Dan Brown", 480, Libro.Genero.MISTERIO);
        Libro libro2 = new Libro("Los Pilares de la Tierra", 1989, 3, "Ken Follet", 811, Libro.Genero.FANTASIA);

        albumMusica album1 = new albumMusica("Intuición", 2018, 2, "Gian Marco", 11, true);
        albumMusica album2 = new albumMusica("Tropicoqueta", 2025, 2, "Karol G", 5, true);

        // Crea 2 Clientes
        Cliente Rafa = new Cliente("Rafa", "apruebame1234", 77895620, 1997, album2 , 1046);
        Cliente Melissa = new Cliente("Melissa", "nosoydeaqui", 77677877, 1979, album1, 10);


        //Crea 1 administrador y asignar un artículo a un cliente
        Administrador Daniel = new Administrador("D.Chaves", "apruebameplis", 77849086, 1999, Administrador.Rol.JEFE);
        Daniel.asignarArticulo(Rafa , pelicula1);

        //Compruebo que he asignado bien el artículo al cliente
        System.out.println(Rafa);
        System.out.println("Articulo asignado al primer cliente: " + Rafa.getArticulo().getTitulo());
        }
    }
