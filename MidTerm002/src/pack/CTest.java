//2022112454 멀티미디어공학 백지은

package pack;

import java.util.Scanner;

public class CTest {
	
	private static Point getPoint(Scanner oInDev) {
		int x, y;
		System.out.print("x값을 입력하세요 : ");
		x = oInDev.nextInt();
		System.out.print("y값을 입력하세요 : ");
		y = oInDev.nextInt();
		
		Point oPoint = new Point(x,y);
		return oPoint;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point oPoint1, oPoint2;
		CRectangle oRect;
		boolean bFlag;
		String sRectIngo;
		
		Scanner oInDev;
		oInDev = new Scanner (System.in);
		
		oPoint1 = getPoint(oInDev);
		oPoint2 = getPoint(oInDev);
		
		oRect = new CRectangle(oPoint1, oPoint2);
		
		bFlag = oRect.isRectangle();
		sRectIngo = oRect.getRectangleInfo();
		
		if(bFlag==true) {
			System.out.println(sRectIngo + "의 둘레 : " + oRect.getAround());
			System.out.println(sRectIngo + "의 면적 : " + oRect.getArea());
		}
		else {
			System.out.println(sRectIngo + "은 사각형이 아닙니다.");
		}

		oInDev.close();
	}

}
