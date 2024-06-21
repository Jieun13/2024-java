package interFace;

public class Circle implements Shape{
	
	private int radius;
	
	public Circle() {
		radius = 0;
	}

	@Override
	public void setShape(int r) {
		this.radius = r;
	}

	@Override
	public double getArea() {
		double dRes;
		dRes = radius * radius * 3.14;
		
		return dRes;
	}
}
