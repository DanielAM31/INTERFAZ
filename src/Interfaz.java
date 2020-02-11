import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener {
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JPanel panel;
	
	public Interfaz() {
		
		/*Creación del Boton1 con caracteristicas*/
		
		//setLayout(null);
		boton1 = new JButton("Aceptar");
		boton2 = new JButton("Cancelar");
		boton3 = new JButton("Continuar");
		boton4 = new JButton("Salir");
		
		//boton1.setBounds(300, 250, 100, 30);
		//add(boton1);
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
		boton4.addActionListener(this);
		
		/*Creacion del Panel y contenido*/
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		add(panel);
		
		
	}
	
	public void actionPerformed(ActionEvent c) {
		if(c.getSource() == boton1) {
			System.exit(0);
		}
		
		if(c.getSource() == boton2) {
			boton2.setText("Cambio");
		}
		
		if(c.getSource() == boton3) {
			System.exit(0);
		}
		
		if(c.getSource() == boton4) {
			System.exit(0);
		}
	}
}