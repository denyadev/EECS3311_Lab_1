package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangle extends Shape {
	
	public Rectangle (int upperX, int upperY, int width, int height, Color shapeColor) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = height;
		this.shapeColor = shapeColor;
	}
	
	@Override
	public double getArea() {
		return this.width * this.height;
	}
	
	@Override
	public void draw(Graphics g) {
		Graphics g2d = (Graphics2D) g;
		g2d.setColor(this.shapeColor);
		g2d.fillRect(this.upperX, this.upperY, this.width, this.height);
	}
}
