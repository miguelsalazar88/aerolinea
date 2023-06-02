package modelo;

public class Empleado extends Usuario{
    private String cargo;
    private int salario;

    public Empleado(String username, String password, String nombre, String apellido, String cargo, int salario) {
        super(username, password, nombre, apellido);
        this.cargo = cargo;
        this.salario = salario;
    }

    //Getters y Setters
    public String getCargo() {
        return cargo;
    }

    public int getSalario() {
        return salario;
    }
}
