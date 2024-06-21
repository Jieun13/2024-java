//2022112454 멀티미디어공학과 백지은

package bin;

public class Rectangle {
	
	public int iWidth;
	public int iHeight;
	
	public Rectangle() {
		this(0,0);
		//iWidth = 0;
		//iHeight = 0;
	}
	
	public Rectangle(int width, int height) {
		iWidth = width;
		iHeight = height;
	}
	
	public int getRound() {
		int iRound = 2 * (iWidth + iHeight);
		return iRound;
	}
	
	public int getArea() {
		int iArea = iWidth * iHeight;
		return iArea;
	}
	
	public boolean isSquare() {
		boolean bSquare = false;
		if (iWidth == iHeight) {
			if(iWidth == 0) {
				bSquare = false;
			}
			bSquare = true;
		}
		return bSquare;
	}
	
}