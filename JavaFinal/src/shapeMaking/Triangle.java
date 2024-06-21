package shapeMaking;

public class Triangle implements Shape{
	
	private int width;
	private int height;
	
	public Triangle() {
		width = 0;
		height = 0;
	}
	
	public Triangle(int w, int h) {
		width = w;
		height = h;
	}
	
	public void setTriangle(int w, int h) {
		width = w;
		height = h;
	}

	@Override
	public double calculateArea() {
		double area;
		area = width * height * 0.5;
		return area;
	}

}
