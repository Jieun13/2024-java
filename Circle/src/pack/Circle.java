package pack;

public class Circle {
	
	private int iRadius;
	final double PI = 3.14;
	
	public Circle() {
		iRadius = 0;
	}
	
	public Circle(int radius) {
		iRadius = radius;
	}
	
	public void setRadius(int radius) {
		this.iRadius = radius;
	}
	
	public int getRadius() {
		return iRadius;
	}
	
	public double getArea() {
		double dArea;
		dArea = PI * iRadius * iRadius;
		return dArea;
	}
}
