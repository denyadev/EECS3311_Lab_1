package shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeFactory extends JPanel {
	
	private static final long serialVersionUID = -2589265275348692373L;
	
	static final int SPACE = 10;
	static final int MAX_SHAPE_SIZE = 50;
	static final int MIN_SHAPE_SIZE = 40;
	static final int MAX_COLOR = 256;
	static final int NUM_OF_SHAPES = 6;
	
	private List<Shape> shapes = new ArrayList<Shape>();

	private static Random random = new Random();
	private static int upperX = SPACE;
	private static int upperY = SPACE;
	private static int shapeType, width, height;
	private static Color shapeColor;
	
	private JButton buttonLoad;
	private JButton buttonSort;
	
	public ShapeFactory() {
		buttonLoad = new JButton("Load Shapes");
		buttonLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	createShapes();
            	repaint();
            }
        });
		buttonSort = new JButton("Sort Shapes");
		buttonSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	SortingTechnique.bubbleSort(shapes);
            	repaint();
            }
        });
		add(buttonLoad);
		add(buttonSort);
	}
	
	public static Shape createShape() {
		shapeType = random.nextInt(3);
		shapeColor = new Color(random.nextInt(MAX_COLOR), random.nextInt(MAX_COLOR), random.nextInt(MAX_COLOR));
		switch (shapeType) {
			case 0:		// RECTANGLE
				width = MIN_SHAPE_SIZE + random.nextInt(MAX_SHAPE_SIZE);
				height = MIN_SHAPE_SIZE + random.nextInt(MAX_SHAPE_SIZE);
				return new Rectangle(upperX, upperY, width, height, shapeColor);
			case 1:		// SQUARE
				width = MIN_SHAPE_SIZE + random.nextInt(MAX_SHAPE_SIZE);
				return new Square(upperX, upperY, width, shapeColor);
			case 2: 	// CIRCLE
				width = MIN_SHAPE_SIZE + random.nextInt(MAX_SHAPE_SIZE);
				return new Circle(upperX, upperY, width, shapeColor);
		}
		return null;	
	}
	
	public void createShapes() {
		shapes.clear();
		upperX = SPACE;
		upperY = SPACE;
		for (int i = 0; i < NUM_OF_SHAPES; i++) {
			shapes.add(createShape());
			upperX += 90;
			upperY += 90;
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Shape shape : shapes) {
			if (shape != null) 
				shape.draw(g);
		}
	}
}
