package pack;

import java.util.Scanner;

public class MainGetString {

	public static void main(String[] args) {
		// TODO Scanner를 사용해서 String 입력 받기
		
		String sInput1, sInput2;
		
		Scanner oInDev;
		oInDev = new Scanner (System.in);
		

		System.out.print("문자열을 입력하세요 : ");
		sInput2 = oInDev.nextLine();
		System.out.println("nextLine()으로 입력된 문자열은 " + sInput2 + " 입니다.");
		
		System.out.print("문자열을 입력하세요 : ");
		sInput1 = oInDev.nextLine();
		System.out.println("nextLine()으로 입력된 문자열은 " + sInput1 + " 입니다.");
		
		oInDev.close();
	}
}