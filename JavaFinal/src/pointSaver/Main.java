package pointSaver;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

private static void prnHashMap(HashMap<String, Integer> pointMap) {
		
		Iterator<HashMap.Entry<String, Integer>> it = pointMap.entrySet().iterator();
		System.out.println("*** 현재 포인트 적립 내역 ***");
		
		while(it.hasNext()) {
			HashMap.Entry<String, Integer> key = it.next();
		    System.out.println("name : "  + key.getKey() + ", point : " + key.getValue());
		}
	}

	public static void main(String[] args) {
		
		HashMap<String, Integer> pointSaver = new HashMap<String, Integer>();
		
		String name;
		int point = 0;
		boolean bFlag;
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		System.out.println("*** 포인트 관리 프로그램입니다. ***");
		while(true) {
			System.out.print("이름과 포인트 입력 : ");
			while(true) {
				try {
					name = oInDev.next();
					if(name.equals("stop")==true) {
						bFlag = false;
						break;
					}
					point = oInDev.nextInt();
					bFlag = true;
					break;
				}
				catch (InputMismatchException ex) {
					System.out.println("입력값이 유효하지 않습니다. 다시 입력하세요.");
				}
			}
			if(bFlag==false) break;
			
			if(pointSaver.containsKey(name)) {
				Integer currentPoint;
				currentPoint = pointSaver.get(name);
				pointSaver.replace(name, currentPoint, currentPoint+point);
				if(currentPoint+point==0) {
					pointSaver.remove(name);
				}
			}
			else {
				pointSaver.put(name, point);
			}
			prnHashMap(pointSaver);
			System.out.println();
		}
		
		oInDev.close();

	}

}
