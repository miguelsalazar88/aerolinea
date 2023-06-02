package modelo;

import java.util.ArrayList;
import javax.swing.*;


public class VueloComboBoxModel extends DefaultComboBoxModel<Vuelo>{
	
    private ArrayList<Vuelo> vuelos;

    public VueloComboBoxModel(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    @Override
    public Vuelo getElementAt(int index) {
        return vuelos.get(index);
    }

    @Override
    public int getSize() {
        return vuelos.size();
    }

    @Override
    public String toString() {
        // Devuelve el atributo deseado de la persona para mostrar en la lista desplegable
        return vuelos.get(0).getInfo(); // Por ejemplo, el nombre de la persona
    }
}
