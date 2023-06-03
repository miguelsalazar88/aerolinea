package controlador;

import modelo.SistemaSingleton;
import modelo.Usuario;
import modelo.UsuarioFactory;
import vista.VentanaRegistroEmpleado;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ControladorRegistroEmpleado extends Controlador{

    private VentanaRegistroEmpleado vista;

    public ControladorRegistroEmpleado(SistemaSingleton sistema, VentanaRegistroEmpleado vista) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.vista.getRegistrarBtn())){

            //Se toman los campos de la ventana para asignar a las variables
            String username = vista.getUsernameField().getText();
            String password = vista.getPasswordField().getText();
            String nombre = vista.getNombreField().getText();
            String apellido = vista.getApellidoField().getText();
            String cargo = vista.getTipoEmpleadoCBox().getSelectedItem().toString();
            String salario = vista.getSalarioField().getText();

            if(username.isEmpty() || password.isEmpty()|| salario.isEmpty() ||
                    nombre.isEmpty() || apellido.isEmpty()){
                JOptionPane.showMessageDialog(vista,"Por favor, complete todos los campos.",
                        "Campos incompletos", JOptionPane.ERROR_MESSAGE);

            }

            else if(SistemaSingleton.getInstance().usuarioExiste(username)){
                JOptionPane.showMessageDialog(
                        vista,
                        "Por favor utilice otro numbre de usuario.",
                        "Usuario Existente",
                        JOptionPane.ERROR_MESSAGE
                );
            }
            else{
                //Se crea el usuario con el Factory Method y se registra en el sistema
                Usuario usuario = UsuarioFactory.crearUsuario("empleado", username, password, nombre,
                        apellido,cargo, Integer.parseInt(salario));
                sistema.registarUsuario(usuario);
                JOptionPane.showMessageDialog(this.vista,"Usuario Registrado!","Success",JOptionPane.OK_OPTION);
                this.vista.dispose();
            }

        }
    }
}
