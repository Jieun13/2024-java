//2022112454 멀티미디어소프트웨어공학 백지은
package my_lib;

import exam_lib.Measurable;
import exam_lib.Point;

public class Circle implements Measurable {
	
	private int iRadius;
	private Point oPoint;
	
	public Circle() {
		oPoint = new Point();
		iRadius = 0;
	}
	
	public Circle(int x, int y, int r) {
		oPoint = new Point(x,y);
		iRadius = r;
	}

	@Override
	public double getAround() {
		double dAround;
		dAround = iRadius * 2 * 3.14;
		return dAround;
	}

	@Override
	public double getArea() {
		double dArea;
		dArea = 3.14 * iRadius * iRadius;
		return dArea;
	}
}