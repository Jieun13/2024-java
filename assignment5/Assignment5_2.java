package ass;

public class Assignment5_2 {

	public static void main(String[] args) {
		// TODO 원의 반지름을 입력 받아 원의 둘레, 넓이, 구의 부피를 구하는 3개의 메소드를 작성하시오
		
		double dAround, dArea, dVolume;
		boolean setSuccess = false;
		
		Circle circle = new Circle();
		
		setSuccess = circle.setRadius();
		
		if(setSuccess==true) {
			dAround = circle.getAround();
			dArea = circle.getArea();
			dVolume = circle.getVolume();
			
			System.out.println("원의 둘레는 " + dAround);
			System.out.println("원의 면적은 " + dArea);
			System.out.println("원의 부피는 " + dVolume);
		}
		else {
			System.out.println("반지름 입력에 실패했습니다.");
		}
	}
}
