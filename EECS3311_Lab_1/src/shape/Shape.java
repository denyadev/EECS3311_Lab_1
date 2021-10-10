package shape;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Comparable<Shape> {
	
	protected int upperX; 
	protected int upperY;
	protected int width;
	protected int height;
	protected Color shapeColor;
	
	public abstract double getArea();
	public abstract void draw(Graphics g);
	
	// Getters & Setters
	
	public int getUpperX() {
		return upperX;
	}
	
	public void setUpperX(int upperX) {
		this.upperX = upperX;
	}
	
	public int getUpperY() {
		return upperY;
	}
	
	public void setUpperY(int upperY) {
		this.upperY = upperY;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Color getShapeColor() {
		return shapeColor;
	}
	
	public void setShapeColor(Color shapeColor) {
		this.shapeColor = shapeColor;
	}
	
	public int compareTo(Shape o) {
		return (int) Math.ceil(this.getArea() - o.getArea());
	}
	
}
