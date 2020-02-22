
public class Main {
	public static void main(String arg[]) {
		int fila = 8;
		Interfaz form = new Interfaz(fila);
		form.setBounds(0, 0, fila * 50 + 10, fila * 50 + 60);
		form.setVisible(true);
	}
}