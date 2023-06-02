package vista;

import controlador.Controlador;
import modelo.Aerolinea;
import modelo.AvionPasajeros;
import modelo.Ciudad;
import modelo.Constants;
import modelo.Coordenadas;
import modelo.Empleado;
import modelo.SeatsGridLayout;
import modelo.Tiquete;
import modelo.Vuelo;
import modelo.VueloComboBoxModel;
import modelo.VueloComercial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;


public class VentanaTiquetes extends Ventana{
	

	    private JPanel panel;
	    private JLabel disponiblesLabel;
	    private JLabel listaLabel;
	    private JLabel asientosLabel;

	    private JButton registrarBtn;
	    
	    private JComboBox<Vuelo> listaVuelos;
	    private Vuelo opcionVuelo;
	    
	    private SeatsGridLayout asientos;
	    
	    private String asiento;

	    public VentanaTiquetes(String title) throws HeadlessException {
	        super(title);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setSize(600,900);
	    }

	    @Override
	    public void initComponents() {
	        panel = new JPanel(new GridBagLayout());
	        GridBagConstraints gbc = new GridBagConstraints();
	        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

	        disponiblesLabel = new JLabel("Vuelos disponibles:");
	        
	        registrarBtn = new JButton("Comprar");
	        
	        asientosLabel = new JLabel("Asientos disponible");
	        
	        
	        //Crear ArrayList de ejemplo
	        
	        Empleado emp1 = new Empleado("ChatoPadilla", "123", "Jaimito", "ElCartero", "BOSS", 5000);
	        Tiquete[] tiquete = null;
	        
	        AvionPasajeros av1 = new AvionPasajeros(1,"BOEING", "AIRBUS", 200);
	        
	        Aerolinea aerolinea1 = new Aerolinea("AMERICAN AIRLINES", emp1);
	        
	        VueloComercial vuel1 = new VueloComercial("1", aerolinea1, av1, (new Ciudad("BOGOTA", new Coordenadas(100,200))), (new Ciudad("TANGAMANDAPIO", new Coordenadas(200,400))), tiquete);
	        vuel1.cargarTiquetes((vuel1.getCapacidad()/6), vuel1, 1500000);
	        
	        
	        VueloComercial vuel2 = new VueloComercial("2", aerolinea1, av1, (new Ciudad("BOGOTA2", new Coordenadas(100,200))), (new Ciudad("TANGAMANDAPIO2", new Coordenadas(200,400))), tiquete);
	        vuel2.cargarTiquetes((vuel1.getCapacidad()/6), vuel2, 1500000);
	        
	        VueloComercial vuel3 = new VueloComercial("3", aerolinea1, av1, (new Ciudad("BOGOTA3", new Coordenadas(100,200))), (new Ciudad("TANGAMANDAPIO3", new Coordenadas(200,400))), tiquete);
	        vuel3.cargarTiquetes((vuel1.getCapacidad()/6), vuel3, 1500000);
	        
	        ArrayList<Vuelo> vuelos = new ArrayList<>();
	        
	        vuelos.add(vuel1);
	        vuelos.add(vuel2);
	        vuelos.add(vuel3);       
	        
	     // Configuraci�n b�sica del JFrame
	        //setTitle("Lista desplegable");
	        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //setLayout(new FlowLayout());

	        
	        // Crear el JComboBox y asignarle el modelo personalizado
	        listaVuelos = new JComboBox<>();
	        VueloComboBoxModel model = new VueloComboBoxModel(vuelos);
	        listaVuelos.setModel(model);
	        
	        opcionVuelo = (Vuelo) listaVuelos.getSelectedItem();	




	        // Mostrar la ventana
	        pack();
	        setVisible(true);
	        
	        asientos = new SeatsGridLayout(5);
	        
	        
	        // Configuración de las restricciones del GridBagConstraints
	        gbc.gridx = 0;
	        gbc.gridy = 0;
	        gbc.anchor = GridBagConstraints.WEST;
	        panel.add(disponiblesLabel, gbc);
	        
	        gbc.gridy = 1;
	        // Agregar el JComboBox al contenedor principal
	        panel.add(listaVuelos, gbc);
	        //panel.add(empleadoRadioButton, gbc);;	        
	        
	        gbc.gridy = 2;
	        panel.add(asientosLabel, gbc);
	        
	        gbc.gridy = 3;
	        panel.add(asientos, gbc);
	        
	        gbc.gridy = 4;
	        gbc.gridwidth = 2;
	        panel.add(registrarBtn, gbc);
	        
	        
	        listaVuelos.addItemListener(new ItemListener() {
	            @Override
	            public void itemStateChanged(ItemEvent e) {
	                if (e.getStateChange() == ItemEvent.SELECTED) {
	                    opcionVuelo = (Vuelo) listaVuelos.getSelectedItem();

	                    // Realiza las operaciones necesarias con el vueloSeleccionado
	                    // ...

	                    // Ejemplo: Imprime el vuelo seleccionado
	                    System.out.println("Vuelo seleccionado: " + opcionVuelo);
	       
	                }
	            }
	        });

	        add(panel);
	    }

	    @Override
	    public void setController(Controlador c) {
	        controller = c;
	        this.registrarBtn.addActionListener(controller);
	    }

	    public JButton getRegistrarBtn() {
	        return registrarBtn;
	    }
	    public Vuelo getVuelo() {
	    	return opcionVuelo;
	    }
	    
	    public String getAsiento() {
	    	asiento = asientos.getAsiento();
	    	return asiento;
	    }
	    
}
