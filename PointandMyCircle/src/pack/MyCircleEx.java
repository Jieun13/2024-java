package pack;

import java.util.Scanner;

public class MyCircleEx {
	
	private static boolean isOverlap(MyCircle c1, MyCircle c2) {
		boolean bResult = false;
		int a, b;
		double c;
		int sumRadius; 
		
		a = (c1.getCenterX() - c2.getCenterX()) * (c1.getCenterX() - c2.getCenterX());
		b = (c1.getCenterY() - c2.getCenterY()) * (c1.getCenterY() - c2.getCenterY());
		c = Math.sqrt(a+b);
		
		sumRadius = c1.getRadius() + c2.getRadius();
		
		if(sumRadius>c) {
			bResult = true;
		}
		else {
			bResult = false;
		}
		return bResult;
	}
	
	private static MyCircle setMyCircle(Scanner oInDev) { 	//클래스도 리턴 타입으로 들어갈 수 있다
		MyCircle oCircle;
		int iRadius;
		int x, y;
		
		System.out.print("원점의 x좌표, y좌표, 반지름 길이를 입력하세요 : ");
		x = oInDev.nextInt();
		y = oInDev.nextInt();
		iRadius = oInDev.nextInt();
		
		oCircle = new MyCircle(x,y,iRadius);
		
		return oCircle;
	}

	public static void main(String[] args) {	//c1, c2 -> oCircle로 바꾸기
		// TODO Auto-generated method stub

		boolean bOverlap = false;
		Scanner oInDev;
		oInDev = new Scanner (System.in);
		
		MyCircle oCircle1, oCircle2;
		
		oCircle1 = setMyCircle(oInDev);
		oCircle2 = setMyCircle(oInDev);
		
		System.out.print(oCircle1.getpCenter() + " 좌표의 반지름 " + oCircle1.getRadius() + "인 원과 ");
		System.out.print(oCircle2.getpCenter() + " 좌표의 반지름 " + oCircle2.getRadius() + "인 원은 ");
		
		bOverlap = isOverlap(oCircle1, oCircle2);
		
		if(bOverlap==true) {
			System.out.println("겹침");
		}
		else {
			System.out.println("겹치지 않음");
		}
		
		oInDev.close();
	}
}