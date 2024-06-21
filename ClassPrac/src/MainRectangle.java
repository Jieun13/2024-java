public class MainRectangle {

	public static void main(String[] args) {
		// TODO Rectangle 클래스 실행 결과를 확인할 메인 클래스
		
		Rectangle oRect1;
		oRect1 = new Rectangle(3,5);
		
		System.out.println("width : " + oRect1.iWidth);
		System.out.println("Height : " + oRect1.iHeight);
		System.out.println();
		
		System.out.println("Area : " +oRect1.getArea());
		System.out.println("Round : " +oRect1.getRound());
		System.out.println();
		
		System.out.println("is Square? : " +oRect1.isSquare());
		
		if(oRect1.isSquare()) {
			System.out.println("정사각형");
		}
		else {
			System.out.println("직사각형");
		}
	}

}
