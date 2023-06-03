package modelo;

public class Empleado extends Usuario{
    private String cargo;
    private int salario;

    private Aerolinea aerolinea;
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

    @Override
    public String toString() {
        return "Empleado{" +
                "cargo='" + cargo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }
}
