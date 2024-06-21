package pack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCafe {
	
	private static int getChoice(Scanner oInDev) {
		int iChoice = 0;
		
		System.out.println();
		System.out.println("*** 공부하기 시른 사람의 카페 ***");
		
		System.out.println("1. 아메리카노 1500원");
		System.out.println("2. 카페라떼 3000원");
		System.out.println("3. 딸기 요거트 스무디 5000원");
		System.out.println("4. 아이스 바닐라 라떼 4500원");
		System.out.println("5. 총 매출 출력");
		System.out.println("6. 프로그램 종료");
		
		try {
			System.out.print("메뉴를 입력하세요 : ");
			iChoice = oInDev.nextInt();
			
		}
		catch (InputMismatchException ex) {
			System.out.println("잘못된 입력값입니다.");
			String tmp = oInDev.next();
		}
		
		return iChoice;
	}

	public static void main(String[] args) {
		// TODO 에스프레소 1500 등 메뉴 4개, 무슨 커피 드릴까요? -> 메뉴 선ㅌ책 -> ~~~ 나왔습니아 ->총 매출 정산-> 20만원 이상 판매하면 끝
		
		int iMenuChoice;
		int iPrice, iSumPrice;
		String iMenu;
		int iCnt;
		
		Scanner oInDev;
		oInDev =  new Scanner (System.in);
		
		iSumPrice = 0;
		iCnt = 0;
		
		while(true) {
			iPrice = 0;
			iMenu = "No Choice";
			
			while(true) {
				iMenuChoice = getChoice(oInDev);
				if(iMenuChoice != 0) {
					break;
				}
			}
			
			if(iMenuChoice == 6) {
				System.out.println();
				System.out.println(" *** 프로그램을 종료합니다. ***");
				break;
			}
			if(iMenuChoice == 5) {
				System.out.println("총 매출을 출력합니다.");
				System.out.println("오늘 판매량은 " + iCnt + "잔이고 " + iSumPrice + "원 벌었습니다.");
			}
			switch(iMenuChoice) {
			case 1 : 
				iMenu = "아메리카노";
				iPrice = 1500;
				break;
			case 2 : 
				iMenu = "카페라떼";
				iPrice = 3000;
				break;
			case 3 : 
				iMenu = "딸기 요거트 스무디";
				iPrice = 5000;
				break;
			case 4 : 
				iMenu = "아이스 바닐라 라떼";
				iPrice = 4500;
				break;
			case 5 : 
				break;
			default : 
				System.out.println(">>> 잘못된 입력값입니다.");
				break;
			}
			iSumPrice = iSumPrice + iPrice;
			iCnt++;
			
			if(iPrice != 0) {
				System.out.println(" >>> " + iMenu + " 1잔 나왔습니다. " + iPrice + "원 입니다.");
			}
			
			if(iSumPrice>=50000) {
				System.out.println("오늘 5만원 이상을 팔아 영업을 종료합니다. 금일 매출액 : " + iSumPrice + "원");
				break;
			}	
		}
		oInDev.close();
	}
}