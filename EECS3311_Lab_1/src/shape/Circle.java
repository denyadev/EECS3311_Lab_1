package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape {
	
	public Circle (int upperX, int upperY, int width, Color shapeColor) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = width;
		this.shapeColor = shapeColor;
	}
	
	@Override
	public double getArea() {
		return Math.PI * (this.width / 2.0) * (this.width / 2.0);
	}
	
	@Override
	public void draw(Graphics g) {
		Graphics g2d = (Graphics2D) g;
		g2d.setColor(this.shapeColor);
		g2d.fillOval(this.upperX, this.upperY, this.width, this.height);
	}
}
