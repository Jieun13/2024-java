package shapeMaking;

public class Circle implements Shape{
	
	private int radius;
	
	public Circle() {
		radius = 0;
	}
	
	public Circle(int r) {
		radius = r;
	}
	
	public void setCircle(int r) {
		radius = r;
	}

	@Override
	public double calculateArea() {
		double area;
		area = 3.14 * radius * radius;
		return area;
	}

}
