//2022112454 멀티미디어공학 백지은

package pack;

import java.util.Scanner;

public class Main {
	
	private static boolean isSameNum(int iArray[], int num, int cnt) {
		boolean bFlag = false;
		int i;
		for(i=0; i<cnt; i++) {
			if(iArray[i]==num) {
				bFlag = true;
				break;
			}
			else {
				bFlag = false;
			}
		}
		return bFlag;
	}
	
	private static int[] getArray(Scanner oInDev) {
		int i, inputNum;
		int cnt = 0;
		int iArray[] = new int [10];
		for(i=0; i<10; i++) {
			System.out.print("배열에 넣을 " + (i+1) + "번째 값을 입력하세요. >> ");
			inputNum = oInDev.nextInt();
			
			if(isSameNum(iArray, inputNum, cnt)==true) {
				System.out.println("값이 중복됩니다. 다른 값을 입력하세요.");
					i--;
			}
			else{
				iArray[i] = inputNum;
				cnt++;
			}
			
		}
		return iArray;
	}
	
	private static void prnArray(int iArray[]) {
		int i;
		System.out.println("배열을 출력합니다.");
		for(i=0; i<10; i++) {
			System.out.print(iArray[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iArray[];
		
		Scanner oInDev;
		oInDev = new Scanner (System.in);
		
		iArray = getArray(oInDev);
		
		prnArray(iArray);
		
		oInDev.close();

	}

}
