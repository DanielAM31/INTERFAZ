import javax.swing.*;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener {
	JButton boton1;
	
	public Interfaz() {
		setLayout(null);
		boton1 = new JButton("Aceptar");
		boton1.setBounds(300, 250, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent c) {
		if(c.getSource() == boton1) {
			System.exit(0);
		}
	}
}
