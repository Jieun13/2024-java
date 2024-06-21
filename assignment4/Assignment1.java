import java.util.Scanner;

public class Assignment1 {
	
	public static void prnArray(int iArray[]){				//정렬된 배열의 원소들을 출력하는 함수
		int iIndex;
		
		for(iIndex=0; iIndex<iArray.length; iIndex++) {
			System.out.print(iArray[iIndex] + " ");		
		}
		System.out.println();
	}

	@SuppressWarnings("resource")//oInDev를 close 해주었는데 계속 경고가 떠서 실행파일 생성을 위해 삽입함.
	public static void main(String[] args) {
		// TODO 배열의 크기, 배열의 원소를 입력 받고 Bubble Sort를 구현하여 정렬하시오
		
		int iSize;
		int iArray[];
		int i, j;
		int iNextValue;
		int iCnt, iEndIndex;
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");		//배열 크기 입력
		iSize = oInDev.nextInt();
		
		iArray = new int [iSize];						//배열 선언
		
		System.out.print("배열의 원소를 입력하세요 : ");		//배열 입력
		for(i=0; i<iSize; i++) {
			iArray[i] = oInDev.nextInt();
		}
		
		iCnt = iSize - 1;
		
		for(i=0; i<iCnt; i++) {
			iEndIndex = iCnt - i;
			
			for(j=0; j<iEndIndex; j++) {
				iNextValue = iArray[j+1];
				
				if(iArray[j]>iNextValue) {
					iNextValue = iArray[j];
					iArray[j] = iArray[j+1];
					iArray[j+1] = iNextValue;
				}
			}	
		}

		System.out.print("정렬된 배열 : ");
		prnArray(iArray);
		oInDev.close();
	}
}