package bin;

public class Point {
	
	public int x;
	public int y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point(int x) {
		this.x = x;
		this.y = x;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void prnPoint() {
		System.out.print("(" + x + "," + y + ")");
	}
	
	public int getXValue() {
		return x;
	}
	
	public int getYValue() {
		return y;
	}
}