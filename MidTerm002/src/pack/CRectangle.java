//2022112454 멀티미디어공학 백지은

package pack;

public class CRectangle {
	
	private Point pPnt1;
	private Point pPnt2;
	
	public CRectangle() {
		pPnt1 = new Point(0,0);
		pPnt2 = new Point(0,0);
	}
	
	public CRectangle(Point p1, Point p2) {
		pPnt1 = new Point(p1.getX(), p1.getY());
		pPnt2 = new Point(p2.getX(), p2.getY());
	}
	
	public boolean isRectangle() {
		boolean bFlag;
		int iDx, iDy;
		
		iDx = pPnt1.getX() - pPnt2.getX();	//가로 길이
		iDy = pPnt1.getY() - pPnt2.getY();	//세로 길이
		
		if((iDx==0) || (iDy==0)) {
			bFlag = false;
		}
		else {
			bFlag = true;
		}
				
		return bFlag;
	}
	
	public String getRectangleInfo() {
		String sRes;
		sRes = pPnt1.getPointInfo() + "와 " + pPnt2.getPointInfo() + "로 이루어진 사각형";
		return sRes;
	}
	
	public int getAround() {
		int iAround;
		int iSide1, iSide2;
		
		iSide1 = pPnt1.getX() - pPnt2.getX();
		iSide2 = pPnt1.getY() - pPnt2.getY();
		
		if(iSide1<0) {
			iSide1 = -iSide1;
		}
		if(iSide2<0) {
			iSide2 = -iSide2;
		}
		iAround = 2 * (iSide1 + iSide2);
		
		return iAround;
	}
	
	public int getArea() {
		int iArea;
		int iSide1, iSide2;
		
		iSide1 = pPnt1.getX() - pPnt2.getX();
		iSide2 = pPnt1.getY() - pPnt2.getY();
		
		if(iSide1<0) {
			iSide1 = -iSide1;
		}
		if(iSide2<0) {
			iSide2 = -iSide2;
		}
		iArea = iSide1 * iSide2;
		return iArea;
	}
}
