package pack;

public class MyCircle {
	
	private Point pCenter;
	private int iRadius;
	
	public MyCircle() {
		pCenter = new Point();
		iRadius = 1;
	}
	
	public MyCircle(int x, int y, int radius) {
		pCenter = new Point(x,y);
		iRadius = radius;
	}
	
	public int getRadius() {
		return iRadius;
	}
	
	public int getCenterX() {
		return pCenter.getX();
	}
	public int getCenterY() {
		return pCenter.getY();
	}
	
	public String getpCenter() {
		String sRes;
		
		sRes = "(" + pCenter.getX() + "," + pCenter.getY() + ")";
		
		return sRes;
	}
}
