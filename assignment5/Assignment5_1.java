package ass;

import java.util.Scanner;

public class Assignment5_1 {

	public static void main(String[] args) {
		// TODO “q”가 입력되기 전까지 정수 값을 입력받아 54를 더하는 프로그램을 작성하시오. (try-catch문 사용)
		
		int iSum, iInputNum;
		String strInput;
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		while(true) {
			iSum = 54;
			
			System.out.print("숫자 입력 (*종료는 q) : ");
			strInput = oInDev.nextLine();
			
			if(strInput.equals("q")) { 
				System.out.println("main 메소드 종료");
				break;
			}
			else { //입력 값이 q가 아니면
				try {
					iInputNum = Integer.parseInt(strInput);		//문자열을 정수로 변환
					iSum = iSum + iInputNum;					//변환한 값을 iSum에 더하기
					System.out.println("숫자 + 54 = " + iSum);	//출력
				}
				catch(NumberFormatException ex){				//숫자가 아닌 문자열을 숫자로 변환 시도하면
					System.out.println("문자가 아닌 숫자 입력할 것.");
				}
			}
		}
		oInDev.close();
	}

}
