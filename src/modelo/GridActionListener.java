package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GridActionListener implements ActionListener {
    private int row;
    private int col;
    private JButton selectedButton;
    
    public GridActionListener(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        selectedButton = (JButton) e.getSource(); // Obtener el bot�n seleccionado
        // Realizar otras acciones con el bot�n seleccionado si es necesario
        System.out.println("Bot�n seleccionado: " + selectedButton.getText());
    }

}
