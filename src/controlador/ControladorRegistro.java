package controlador;

import modelo.SistemaSingleton;
import modelo.Usuario;
import modelo.UsuarioFactory;
import vista.VentanaRegistro;

import java.awt.event.ActionEvent;

public class ControladorRegistro extends Controlador{

    private VentanaRegistro vista;

    public ControladorRegistro(SistemaSingleton sistema, VentanaRegistro vista) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.getRegistrarBtn())){

            //Se toman los campos de la ventana para asignar a las variables
            String tipoUsuario = vista.getEmpleadoRadioButton().isSelected() ? "empleado" : "pasajero";
            String username = vista.getUsernameField().getText();
            String password = vista.getPasswordField().getText();
            String nombre = vista.getNombreField().getText();
            String apellido = vista.getApellidoField().getText();
            String cargo = vista.getTipoEmpleadoCBox().getSelectedItem().toString();
            int salario = 0;
            if(vista.getEmpleadoRadioButton().isSelected()){
                salario = Integer.parseInt(vista.getSalarioField().getText());
            }

            //Se crea el usuario con el Factory Method y se registra en el sistema
            Usuario usuario = UsuarioFactory.crearUsuario(tipoUsuario, username, password, nombre, apellido,cargo, salario);
            sistema.registarUsuario(usuario);
            for (Usuario u:
                 sistema.getUsuarios()) {
                System.out.println(u.getNombre());
            }
        }
    }
}
