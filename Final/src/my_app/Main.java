//2022112454 멀티미디어소프트웨어공학 백지은
package my_app;

import exam_lib.Measurable;
import my_lib.Circle;
import my_lib.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		Measurable oShape;
		oShape = new Circle(3,4,4);
		
		System.out.println("원의 둘레 : " + oShape.getAround());
		System.out.println("원의 넓이 : " + oShape.getArea());
		
		oShape = new Rectangle(2,5,8,9);
		
		System.out.println("사각형의 둘레 : " + oShape.getAround());
		System.out.println("사각형의 넓이 : " + oShape.getArea());

	}

}
