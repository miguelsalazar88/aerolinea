package controlador;

import modelo.SistemaSingleton;
import vista.*;

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
            VentanaMapa ventanaMapa = new VentanaMapa("Mapa");
            ventanaMapa.getPanel().start();
        }
        if(e.getSource().equals(vista.getBtnUsuario())){
            VentanaLogin ventanaLogin = new VentanaLogin("Login");
            ControladorLoginUsuario controladorLoginUsuario = new ControladorLoginUsuario(sistema,ventanaLogin);
        }
        if(e.getSource().equals(vista.getBtnAerolinea())){
            VentanaLogin ventanaLogin = new VentanaLogin("Aerolinea");
            ControladorLoginAerolinea controladorLoginAerolinea = new ControladorLoginAerolinea(sistema,ventanaLogin);
        }
        if(e.getSource().equals(vista.getBtnRegistrarse())){
            VentanaRegistro ventanaRegistro = new VentanaRegistro("Registro");
            ControladorRegistro controladorRegistro = new ControladorRegistro(SistemaSingleton.getInstance(), ventanaRegistro);
        }
        if(e.getSource().equals(vista.getBtnComprar())){
            VentanaTiquetes ventanaTiquetes = new VentanaTiquetes("Comprar Tiquetes");
            ControladorCompra controladorcompra = new ControladorCompra(SistemaSingleton.getInstance(), ventanaTiquetes);
        }
    }
}
