package Usuarios;  //Aquí nos indica que la clase "Usuario" está metido en la carpeta "Usuarios".

public class Usuario {  // Nombramos los componentes de la clase "Usuario", que será la clase padre de la carpeta "Usuarios".
    private String nombreUsuario;
    private String contrasenha;
    private int id;
    private int anhoNacimiento;


    //Constructores:
    public Usuario(String nombreUsuario, String contrasenha, int id, int anhoNacimiento) {  // Creamos el Constructor con todos los componentes.
        this.nombreUsuario = nombreUsuario;
        this.contrasenha = contrasenha;
        this.id = id;
        this.anhoNacimiento = anhoNacimiento;
    }


    public Usuario() {  // Creamos otro Constructor totalmente vacío.
    }



    // Generamos todos los "Getters and Setters".
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnhoNacimiento() {
        return anhoNacimiento;
    }

    public void setAnhoNacimiento(int anhoNacimiento) {
        this.anhoNacimiento = anhoNacimiento;
    }

    //Métodos:
    public boolean esAdulto() {  // Marcamos los parámetros para que nos marque si es mayor de edad. Para ello se le restará a 2025(año actual) el año de nacimiento del usuario y el resultado se medirá si es mayor o igual a 18. Una vez lo sepa nos lo dice con un "true/false".
        return 2025 - this.anhoNacimiento >= 18;
    }

    public boolean contrasenhaSegura() {  // Estipulamos que si la contraseña tiene más de 10 caracteres, es que es segura. Una vez lo sepa nos lo dice con un "true/false".
        return this.contrasenha.length() > 10;
    }



    //ToString
    @Override
    public String toString() {  // Para finalizar, realizamos el to String para definir lo que saldrá por consola si lo llamamos en el Main.
        return this.nombreUsuario + " (" + this.id + ") ";
    }
}
