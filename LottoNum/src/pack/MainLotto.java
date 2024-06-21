package pack;

public class MainLotto {
	
	public static void prnArray(int iArray[]){
		int iIndex;
		
		for(iIndex=0; iIndex<iArray.length; iIndex++) {
			System.out.print(iArray[iIndex] + " ");		//정렬된 배열의 원소들을 출력
		}
	}
	
	public static void sortSelection(int iArray[]){
		int i, j;
		int iMinValue, iMinIndex;
		int iStartIndex;
		
		for(i=0; i<6; i++) {					//배열의 크기만큼 반복
			iMinValue= iArray[i];
			iMinIndex = i;
			
			iStartIndex = i+1;
			
			for(j=iStartIndex; j<iArray.length; j++) {				//j=i+1부터 마지막까지 루프를 돌면서
				if (iMinValue> iArray[j]) {			//저장된 iMinValue값보다 더 작은 수를 발견하면
					iMinValue= iArray[j];			//해당 값을 iMinValue에 다시 저장
					iMinIndex = j;						//최솟값이 몇 번째 원소에 있는지 인덱스 저장
				}
			}										//루프가 끝나면 iMinValue에는 정렬되지 않은 수 중 최솟값이 들어있을 것임
			iArray[iMinIndex] = iArray[i];				//i번째 원소에 iMinValue값을 저장
			iArray[i] = iMinValue;			//iMinValue값이 들어있던 자리에는 iValue1값을 저장해서 서로의 위치 뒤바꿈
		}
	}

	public static void main(String[] args) {
		// TODO 로또 번호 6개를 중복 없이 0~46 사이로 생성해라
		
		int i, j, iNum;
		int iLottoCnt;
		int iArray[];
		
		iArray = new int[6];
		iLottoCnt = 0;
		
		for(j=0; j<6; j++) {
			iNum = (int)(Math.random()*45) + 1;
			
			for(i=0; i<iLottoCnt; i++) {
				if(iArray[i]==iNum) {
					System.out.println(i + "에서 " + iNum + " 중복");
					break;
				}
			}
			if(i==iLottoCnt) {
				iArray[iLottoCnt] = iNum;
				iLottoCnt++;
			}
		}
		
		sortSelection(iArray);
		prnArray(iArray);

	}

}
