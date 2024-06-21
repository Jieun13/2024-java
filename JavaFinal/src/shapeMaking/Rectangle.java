package shapeMaking;

public class Rectangle implements Shape{
	
	private int width;
	private int height;
	
	public Rectangle() {
		width = 0;
		height = 0;
	}
	
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	
	public void setRectangle(int w, int h) {
		width = w;
		height = h;
	}

	@Override
	public double calculateArea() {
		double area;
		area = width * height;
		return area;
	}

}
