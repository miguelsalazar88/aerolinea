package controlador;

import modelo.SistemaSingleton;
import vista.Ventana;

import java.awt.event.ActionListener;

public abstract class Controlador implements ActionListener {
    protected SistemaSingleton sistema;

    public Controlador(SistemaSingleton sistema) {
        this.sistema = sistema;
    }
}
