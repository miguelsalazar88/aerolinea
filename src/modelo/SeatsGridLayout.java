package modelo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SeatsGridLayout extends JPanel{
	 private int gridSize;
	 private JButton[][] gridButtons;
	 private JButton selectedButton; // Variable para almacenar el botón seleccionado
	 
 
	 
	 public SeatsGridLayout(int gridSize) {
		 	//Arreglo de letras para generar los botones
		 	ArrayList<String> letras = new ArrayList<>();

		 	for (char c = 'A'; c <= 'Z'; c++) {
		 		letras.add(String.valueOf(c));
		 	}
	     
	        this.gridSize = gridSize;
	        
	        /* METODOS DE UN JFRAME. SI FUESE UNA VENTANA DE BOTONES, ESTE SERÍA EL COMPORTAMIENTO A AÑADIR
	        setTitle("Cuadrícula");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
	        
	        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

	        gridButtons = new JButton[gridSize][gridSize];
	        for (int row = 0; row < gridSize; row++) {
	            for (int col = 0; col < gridSize; col++) {
	                JButton button = new JButton();
	                button.addActionListener(new GridButtonListener(row, col));
	                
	                String label = (String) (letras.get(row) + col);
	                String labelText = String.valueOf(label);
	                button.setText(labelText);
	                gridButtons[row][col] = button;
	                add(button);
	            }
	        }

	        //pack();
	        
	        setPreferredSize(new Dimension(300, 300)); // Establece el tamaño preferido del panel

	        // Opcional: Establece el tamaño mínimo y máximo si es necesario
	        setMinimumSize(new Dimension(200, 200));
	        setMaximumSize(new Dimension(500, 500));
	        
	        setVisible(true);
	    }
	 
	 private class GridButtonListener implements ActionListener {
	        private int row;
	        private int col;
	        
	        public GridButtonListener(int row, int col) {
	            this.row = row;
	            this.col = col;
	        }

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            selectedButton = (JButton) e.getSource(); // Obtener el botón seleccionado
	            // Realizar otras acciones con el botón seleccionado si es necesario
	            System.out.println("Botón seleccionado: " + selectedButton.getText());
	        }
	    }
	 
	 public String getAsiento() {
		 return selectedButton.getText();
	 }

}
