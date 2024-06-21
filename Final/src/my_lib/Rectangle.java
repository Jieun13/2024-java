//2022112454 멀티미디어소프트웨어공학 백지은
package my_lib;

import exam_lib.Measurable;
import exam_lib.Point;

public class Rectangle implements Measurable{
	
	private Point oPoint1;
	private Point oPoint2;
	
	public Rectangle() {
		oPoint1 = new Point();
		oPoint2 = new Point();
	}
	
	public Rectangle (int x1, int y1, int x2, int y2) {
		oPoint1 = new Point(x1, y1);
		oPoint2 = new Point(x2, y2);
	}
	
	private double getWidth() {
		double dWidth;
		dWidth = oPoint2.getX() - oPoint1.getX();
		if(dWidth<0) {
			dWidth = -1 * dWidth;
		}
		return dWidth;
	}
	
	private double getHeight() {
		double dHeight;
		dHeight = oPoint1.getY() - oPoint2.getY();
		if(dHeight<0) {
			dHeight = -1 * dHeight;
		}
		return dHeight;
	}

	@Override
	public double getAround() {
		double dAround;
		dAround = (getWidth() + getHeight()) * 2;
		return dAround;
	}

	@Override
	public double getArea() {
		double dArea;
		dArea = getWidth() * getHeight();
		return dArea;
	}

}
