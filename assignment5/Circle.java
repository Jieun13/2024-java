package ass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {
	
	public int iRadius;
	final double PI;
	
	public Circle() {	//생성자 메소드 (멤버변수의 초기화)
		iRadius = 0;
		PI = 3.14;
	}
	
	public boolean setRadius() {	//반지름을 입력 받아 iRadius 필드에 저장하고 제대로 저장되었다면 true 반
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요 : ");
		try {
			iRadius = oInDev.nextInt();
			oInDev.close();
			return true;
		}
		catch(InputMismatchException ex) {
			System.out.println("정수형 숫자를 입력하세요.");
			return false;
		}
	}
	
	public double getArea () {	//원의 면적 계산 메소드
		return PI * iRadius * iRadius;
	}
	
	public double getAround() {	//원의 둘레 계산 메소드
		return PI * iRadius * 2;
	}
	
	public double getVolume() {	//구의 부피 계산 메소드
		return 4/3 * PI * iRadius * iRadius * iRadius;
	}

}
