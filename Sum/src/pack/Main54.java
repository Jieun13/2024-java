package pack;

import java.util.Scanner;

public class Main54 {
	
	public static boolean isNumber (String str) { 
		boolean bFlag = false;
		for(char c : str.toCharArray()){
			if (!Character.isDigit(c)) { 
				bFlag = false; 
			}
			else {
				bFlag = true;
			}
		}
		return bFlag;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iSum;
		int iInputNum; 
		String strInput;
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		while(true) { 
			iSum = 54;
			System.out.print("숫자 입력 (*종료는 q) : ");
			strInput = oInDev.nextLine(); //String 으로 입력 받아옴
			
			if(strInput.equals("q")) { //만약 입력 값이 q 라면 프로그램 종료 
				System.out.println("main 메소드 종료");
				break;
			}
			/*else { //입력 값이 q 아니면
				if(isNumber(strInput)) { //문자열이 숫자일 때
					iInputNum = Integer.parseInt(strInput); //문자열을 정수로 변환 
					iSum = iSum + iInputNum; //변환한 값을 iSum 에 더하기 
					System.out.println("숫자 + 54 = " + iSum);
				}
				else { //입력값이 숫자가 아니라면
					System.out.println("숫자를 입력해주세요."); 
				}
			}*/
			else {
				try {
					iInputNum = Integer.parseInt(strInput); //문자열을 정수로 변환 iSum = iSum + iInputNum;
					System.out.println("숫자 + 54 = " + iSum);
				}
				catch(NumberFormatException ex){//숫자가 아닌 문자열을 숫자로 변환 시도하면
					System.out.println("문자가 아닌 숫자 입력할 것."); 
				}
			}
		}
		
		oInDev.close();

	}

}
