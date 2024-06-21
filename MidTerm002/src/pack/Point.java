//2022112454 멀티미디어공학 백지은

package pack;

public class Point {
	
	private int iX;
	private int iY;
	
	public Point() {
		this(0,0);
	}
	
	public Point(int x, int y) {
		this.iX = x;
		this.iY = y;
	}
	
	public void setX(int x) {
		this.iX = x;
	}
	
	public void setY(int y) {
		this.iY = y;
	}
	
	public int getX() {
		return iX;
	}
	
	public int getY() {
		return iY;
	}
	
	public String getPointInfo() {
		String sRes;
		sRes = "(" + iX + "," + iY + ")";
		return sRes;
	}

}
