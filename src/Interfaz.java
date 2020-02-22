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
	ImageIcon iconobtn;
	
	
	public Interfaz() {
		
		/*Creación del Boton1 con caracteristicas*/
		
		//setLayout(null);
		iconobtn = new ImageIcon("src/img/phone.png");
		boton1 = new JButton(iconobtn);
		boton2 = new JButton(iconobtn);
		boton3 = new JButton(iconobtn);
		boton4 = new JButton(iconobtn);
		
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
		
		iconobtn = new ImageIcon("src/img/gold.png");
		if(c.getSource() == boton1) {
			boton1.setIcon(iconobtn);
		}
		
		if(c.getSource() == boton2) {
			boton2.setIcon(iconobtn);
		}
		
		if(c.getSource() == boton3) {
			boton3.setIcon(iconobtn);
		}
		
		if(c.getSource() == boton4) {
			boton4.setIcon(iconobtn);
		}
	}
}