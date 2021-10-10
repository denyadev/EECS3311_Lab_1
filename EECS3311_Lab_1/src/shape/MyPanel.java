package shape;

import javax.swing.JFrame;

public class MyPanel {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new ShapeFactory());		
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Display Shapes - Denis Kosogov");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
