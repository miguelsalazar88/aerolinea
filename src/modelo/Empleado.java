package modelo;

public class Empleado extends Usuario {
    private String tipo;

    public Empleado(String username, String password, String nombre, String apellido, String tipo) {
        super(username, password, nombre, apellido);
        this.tipo = tipo;
    }
}
