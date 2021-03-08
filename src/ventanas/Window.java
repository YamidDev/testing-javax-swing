package ventanas;

import javax.swing.*;

public class Window {
	javax.swing.JFrame window;
	JPanel panelA, panelB;
	JLabel saludo, saludo2;
	JButton button;
	
	public Window() {
		createPanelA();
		createPanelB();
		createWindow();
	}
	
	public void createPanelA() {
		panelA = new JPanel();
		saludo = new JLabel("Bienvenidos");
		panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
		panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
		panelA.add(saludo);
	}
	
	public void createPanelB() {
		panelB = new JPanel();
		button = new JButton();
		button.setText("Ingresar");
		panelB.setLayout(new BoxLayout(panelB, BoxLayout.X_AXIS));
		panelB.add(button);
	}
	
	
	public void createWindow () {
		window = new JFrame();
		window.setTitle("Ventana Nueva");
		window.setSize(400, 400);
		window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));
		
		window.add(panelA);
		window.add(panelB);
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
