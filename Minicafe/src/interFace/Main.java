package interFace;

public class Main {

	public static void main(String[] args) {
		
		Circle oCircle;
		oCircle = new Circle();
		
		oCircle.setShape(5);
		System.out.println("원의 넓이는 " + oCircle.getArea());
	}

}
