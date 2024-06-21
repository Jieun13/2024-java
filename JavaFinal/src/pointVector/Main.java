package pointVector;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	private static Point setPoint(Scanner oInDev) {
		int x = 0, y = 0;
		
		System.out.print("점의 좌표를 입력하세요 : ");
		try {
			x = oInDev.nextInt();
			y = oInDev.nextInt();
		}
		catch(InputMismatchException ex){
			System.out.println("입력값이 유효하지 않습니다. 다시 입력해주세요.");
			String str = oInDev.nextLine();
			System.out.print("점의 좌표를 입력하세요 : ");
		}
		
		Point oPoint = new Point(x, y);
		return oPoint;
	}

	public static void main(String[] args) {
		
		Point oPoint1, oPoint2, oPoint3, oPoint4;
		boolean bFlag;
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);

		Vector<Point> pointV = new Vector<Point>();
		
		
		oPoint1 = setPoint(oInDev);
		oPoint2 = setPoint(oInDev);
		oPoint3 = setPoint(oInDev);
		oPoint4 = setPoint(oInDev);
		
		pointV.add(oPoint1);
		pointV.add(oPoint2);
		pointV.add(oPoint3);
		pointV.add(oPoint4);
		
		Iterator<Point> it = pointV.iterator();
		
		while(true) {
			bFlag = it.hasNext();
			if (bFlag == false) {
				break;
			}
			String str = it.next().toString();
			System.out.print(str + " ");
		}
		
		oInDev.close();
	}

}
