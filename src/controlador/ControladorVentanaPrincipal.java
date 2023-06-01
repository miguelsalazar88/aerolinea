package controlador;

import modelo.SistemaSingleton;
import vista.Ventana;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;

import java.awt.event.ActionEvent;

public class ControladorVentanaPrincipal extends Controlador{

    private VentanaPrincipal vista;

    public ControladorVentanaPrincipal(VentanaPrincipal vista, SistemaSingleton sistema) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vista.getBtnMapa())){
            System.out.println("Ver Mapa");
        }
        if(e.getSource().equals(vista.getBtnUsuario())){
            System.out.println("Usuario");
        }
        if(e.getSource().equals(vista.getBtnAerolinea())){
            System.out.println("Aerolinea");
        }
        if(e.getSource().equals(vista.getBtnRegistrarse())){
            VentanaRegistro ventanaRegistro = new VentanaRegistro("Registro");
            ControladorRegistro controladorRegistro = new ControladorRegistro(SistemaSingleton.getInstance(), ventanaRegistro);
        }
    }
}
