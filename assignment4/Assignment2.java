import java.util.Scanner;

public class Assignment2 {
	
	public static boolean isNumber (String str) {		//입력값이 숫자인지 확인하는 함수
		for(char c : str.toCharArray()){				//문자열을 char 형태로 바꾸어서 한 글자씩 숫자인지 판별
			if(!Character.isDigit(c)) {					//만약 숫자가 아니라면
				return false;							//false를 리턴
			}
		}
		return true;									//입력된 문자열이 전부 숫자로 이루어져 있다면 true를 리턴
	}

	@SuppressWarnings("resource")//oInDev를 close 해주었는데 계속 경고가 떠서 실행파일 생성을 위해 삽입함.
	public static void main(String[] args) {
		// TODO “q”가 입력되기 전까지 정수 값을 입력받아 54를 더하는 프로그램을 작성하시오.
		
		int iSum;
		int iInputNum;
		String strInput;
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		while(true) {
			iSum = 54;
			
			System.out.print("숫자 입력 (*종료는 q) : ");
			strInput = oInDev.nextLine();					//String으로 입력 받아옴
			
			if(strInput.equals("q")) {						//만약 입력 값이 q라면 프로그램 종료
				System.out.println("main 메소드 종료");
				break;
			}
			else {												//입력 값이 q가 아니면
				if(isNumber(strInput)) {						//문자열이 숫자일 때
					iInputNum = Integer.parseInt(strInput);		//문자열을 정수로 변환
					iSum = iSum + iInputNum;					//변환한 값을 iSum에 더하기
					System.out.println("숫자 + 54 = " + iSum);	//출력
				}
				else {											//입력값이 숫자가 아니라면
					System.out.println("숫자를 입력해주세요.");
				}
			}
		}
	}
}
