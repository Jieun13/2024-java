package pack;

import java.util.Scanner;

public class MainSelction {
	
	public static void sortArray(int iArray[]) {
		int i, j;
		int iMinValue, iMinIndex, iStartIndex;
		
		for(j=0; j<iArray.length-1; j++) {
			
			iMinValue = iArray[j];
			iMinIndex = j;
			iStartIndex = j+1;
			
			//다음으로 오는 수들 중에서 최솟값 찾기
			for(i=iStartIndex; i<iArray.length; i++) {
				if(iArray[i]<iMinValue) {
					iMinValue = iArray[i];
					iMinIndex = i;
				}
			}
			iArray[iMinIndex] = iArray[j];
			iArray[j] = iMinValue;
		}
	}
	
	public static void prnArray(int iArray[]) {
		for(int i=0; i<iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO 배열을 입력 받아 저장하고 오른쪽에 있는 수 중에서 최솟값을 찾아 비교하고 위치 바꿔서 정렬
		int iSize;
		
		Scanner oInDev;
		oInDev = new Scanner (System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		iSize = oInDev.nextInt();
		
		int iArray[] = new int[iSize];

		System.out.print("배열을 입력하세요 : ");
		for(int i=0; i<iArray.length; i++) {
			iArray[i] = oInDev.nextInt();
		}
		
		sortArray(iArray);
		prnArray(iArray);
		
		oInDev.close();
	}
}
