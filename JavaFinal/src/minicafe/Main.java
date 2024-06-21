package minicafe;

import java.util.Scanner;

public class Main {
	
	private static void printMenu(String sMenuName[], int iMenuPrice[]) {
		System.out.println("--------< 카페 메뉴 >--------");
		for(int i=0; i<sMenuName.length; i++) {
			int iListNo = i+1;
			System.out.println(iListNo +". "+ sMenuName[i] + "\t" + iMenuPrice[i] + "원");
		}
		System.out.println("---------------------------");
		System.out.print("무슨 커피 드릴까요? : ");
	}

	public static void main(String[] args) {
		
		Scanner oInDev;
		int iMenuChoice, iPrice, iIndex;
		int iTotalSell;
		String sMenu;
		String sMenuName[] = {"에스프레소", "아메리카노", "카푸치노", "카페라떼", "초코라떼"};
		int iMenuPrice[] = {1500, 2000, 3000, 3500, 4000};
				
		oInDev = new Scanner(System.in);
		iTotalSell = 0;
		
		while(true) {
			printMenu(sMenuName, iMenuPrice);
			iMenuChoice = oInDev.nextInt();
			
			if (iMenuChoice==0) {
				break;
			}
			else if((iMenuChoice>sMenuName.length) || (iMenuChoice<0)) {
				iPrice = 0;
				sMenu = "N/A";
				System.out.println("없는 메뉴입니다.");
			}
			else {
				iIndex = iMenuChoice-1;
				iPrice = iMenuPrice[iIndex];
				sMenu = sMenuName[iIndex];
				System.out.println(sMenu + " 1잔 " + iPrice + "원");
				iTotalSell = iTotalSell + iPrice;
			}
			
		}
		
		System.out.println("총 매출 = " + iTotalSell + "원");
		oInDev.close();

	}

}