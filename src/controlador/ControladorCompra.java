package controlador;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import modelo.Pasajero;
import modelo.SistemaSingleton;
import modelo.Tiquete;
import modelo.Usuario;
import modelo.UsuarioFactory;
import modelo.Vuelo;
import vista.VentanaTiquetes;

public class ControladorCompra extends Controlador {

    private VentanaTiquetes vista;
    

    public ControladorCompra(SistemaSingleton sistema, VentanaTiquetes vista) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.vista.getRegistrarBtn())){

            //Se toman los campos de la ventana para asignar a las variables
            Vuelo vueloSeleccionado = vista.getVuelo();
            String asiento = vista.getAsiento();
            

           if(vueloSeleccionado == null){
                JOptionPane.showMessageDialog(
                        vista,
                        "No has seleccionado un vuelo .",
                        "Elige un vuelo",
                        JOptionPane.ERROR_MESSAGE
                );
            }
            else{
            	Pasajero testUser = new Pasajero("Pepo", "123", "urmom", "bro");
                //Se crea el usuario con el Factory Method y se registra en el sistema
            	Tiquete t = new Tiquete(0, vueloSeleccionado, 0);
            	t.setAsiento(asiento);
            	t.setOwner(testUser);
                sistema.registrarTiquete(testUser, t);
                System.out.println("Vuelo "+vueloSeleccionado.toString()+" seleccionado");
                System.out.println("Silla añadida: "+t.getAsiento());
            }

        }
    }
}
