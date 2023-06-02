package modelo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

//CLASE PARA CREAR MENUS DESPLEGABLES CON LA INFO QUE SE LE SUMINISTRE
public class Desplegable extends JFrame{
	
	private JComboBox<Vuelo> comboBox;

    public Desplegable() {
        // Configuraci�n b�sica del JFrame
        setTitle("Lista desplegable");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Crear ArrayList de ejemplo
        Empleado emp1 = new Empleado("ChatoPadilla", "123", "Jaimito", "ElCartero", "BOSS", 5000);
        AvionPasajeros av1 = new AvionPasajeros(1,"BOEING", "AIRBUS", 200);
        Aerolinea aerolinea1 = new Aerolinea("AMERICAN AIRLINES", emp1);
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        Tiquete[] tiquete = null;
        vuelos.add(new VueloComercial("1", aerolinea1, av1, (new Ciudad("BOGOTA", new Coordenadas(100,200))), (new Ciudad("TANGAMANDAPIO", new Coordenadas(200,400))), tiquete));
        vuelos.add(new VueloComercial("2", aerolinea1, av1, (new Ciudad("BOGOTA2", new Coordenadas(100,200))), (new Ciudad("TANGAMANDAPIO2", new Coordenadas(200,400))), tiquete));
        vuelos.add(new VueloComercial("3", aerolinea1, av1, (new Ciudad("BOGOTA", new Coordenadas(100,200))), (new Ciudad("TANGAMANDAPIO", new Coordenadas(200,400))), tiquete));

        // Crear el JComboBox y asignarle el modelo personalizado
        comboBox = new JComboBox<>();
        VueloComboBoxModel model = new VueloComboBoxModel(vuelos);
        comboBox.setModel(model);

        // Agregar el JComboBox al contenedor principal
        add(comboBox);

        // Mostrar la ventana
        pack();
        setVisible(true);
    }
	
}

    
