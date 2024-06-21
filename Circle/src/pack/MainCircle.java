package pack;

import java.util.Scanner;

public class MainCircle {

	public static void main(String[] args) {
		// TODO 원의 넓이를 구하는 프로그램을 작성하여라
		int iRadius;
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		Circle c1;
		c1 = new Circle(3);
		
		Circle c2;
		c2 = new Circle();
		
		System.out.print("원 2의 반지름을 입력하세요 : ");
		iRadius = oInDev.nextInt();
		c2.setRadius(iRadius);
		
		System.out.println("원 1의 반지름 : "+ c1.getRadius());
		System.out.println("원 1의 넓이 : " + c1.getArea());
		
		System.out.println("원 2의 반지름 : "+ c2.getRadius());
		System.out.println("원 2의 넓이 : " + c2.getArea());
		
		oInDev.close();
	}
}
