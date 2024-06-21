package shapeMaking;

import java.util.Scanner;

public class Main {

	private static void getInput(Scanner oInDev, Shape oShape) {
		int radius, width, height;
		
		if(oShape instanceof Circle) {
			System.out.print("원의 반지름 입력 : ");
			radius = oInDev.nextInt();
			((Circle) oShape).setCircle(radius);
		}
		else if(oShape instanceof Rectangle) {
			System.out.print("직사각형의 밑변과 높이 입력 : ");
			width = oInDev.nextInt();
			height = oInDev.nextInt();
			((Rectangle) oShape).setRectangle(width, height);
		}
		else if(oShape instanceof Triangle) {
			System.out.print("삼각형의 밑변과 높이 입력 : ");
			width = oInDev.nextInt();
			height = oInDev.nextInt();
			((Triangle) oShape).setTriangle(width, height);
		}
		else {
			System.out.print("Error");
		}
	}
	
	private static void getArea(Shape oShape) {
		if(oShape instanceof Circle) {
			System.out.print("원");
		}
		else if(oShape instanceof Rectangle) {
			System.out.print("직사각형");
		}
		else if(oShape instanceof Triangle) {
			System.out.print("삼각형");
		}
		System.out.println("의 면적 : " + oShape.calculateArea());
		System.out.println();
	}

	public static void main(String[] args) {
		
		Shape oShape = null;
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		oShape = new Circle();
		getInput(oInDev, oShape);
		getArea(oShape);
		
		oShape = new Rectangle();
		getInput(oInDev, oShape);
		getArea(oShape);
		
		oShape = new Triangle();
		getInput(oInDev, oShape);
		getArea(oShape);
		
		oInDev.close();
	}

}
