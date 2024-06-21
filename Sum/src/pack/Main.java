package pack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	private static int getInput(Scanner oInDev) {
		int iNum = 0;
		
		try {
			System.out.print(">> ");
			iNum = oInDev.nextInt();
			
		}
		catch (InputMismatchException ex) {
			System.out.println("잘못된 입력값입니다.");
			String tmp = oInDev.next();
		}
		
		return iNum;
	}

	public static void main(String[] args) {
		// TODO 정수 두 개를 입력 받고 그 합을 출력하는 프로그램을 작성하라 단, 0이 두 개 입력되면 종료되고 그 전까지는 무한히 반복된다. 
		
		Scanner oInDev;
		oInDev = new Scanner (System.in);
		
		while(true) {
			int iInputNum1, iInputNum2;
			int iSum = 0;
			
			iInputNum1 = getInput(oInDev);
			iInputNum2 = getInput(oInDev);
			
			if((iInputNum1==0)&&(iInputNum2==0)) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				iSum = iInputNum1 + iInputNum2;
				System.out.println("두 정수의 합은 " + iSum);
			}
		}
		
		oInDev.close();
	}
}