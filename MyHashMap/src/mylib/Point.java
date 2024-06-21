package mylib;

public class Point {
	
	private int iX;
	private int iY;
	
	public Point() {
		iX = 0;
		iY = 0;
	}
	
	public Point(int x, int y) {
		iX = x;
		iY = y;
	}
	
	public int getX() {
		return iX;
	}
	
	public int getY() {
		return iY;
	}
	
	public void setPoint(int x, int y) {
		iX = x;
		iY = y;
	}
	
	public String toString() {
		return "(" + iX + ", " + iY + ")";
	}
	
	public boolean equals(Object obj) {
		boolean bFlag = false;
		Point oPoint = (Point)obj;
		if(iX==oPoint.getX() && iY==oPoint.getY()) {
			bFlag = true;
		}
		return bFlag;
	}

}
