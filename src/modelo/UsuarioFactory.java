package modelo;

public class UsuarioFactory {

    public static Usuario crearUsuario(String tipo, String username, String password, String nombre, String apellido, String cargo, int salario) {
        if (tipo.equalsIgnoreCase("empleado")) {
            return new Empleado(username, password, nombre, apellido, cargo, salario);
        } else if (tipo.equalsIgnoreCase("pasajero")) {
            return new Pasajero(username, password, nombre, apellido);
        } else {
            throw new IllegalArgumentException("Tipo de usuario no válido");
        }
    }

}
