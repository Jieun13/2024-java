package minicafe;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	private static void prnStart() {
		System.out.println("------------------------ ");
		System.out.println("1. 주문 시작");
		System.out.println("2. 매출 조회");
		System.out.println("3. 종료");
		System.out.println("------------------------ ");
		System.out.print("메뉴를 입력하세요 : ");
	}
	
	private static <K, V> void prnMap(HashMap<K, V> menu, String str) {
		Iterator<HashMap.Entry<K, V>> it = menu.entrySet().iterator();
		int cnt = 1;
		System.out.println("------------------------ ");
		while(it.hasNext()) {
			HashMap.Entry<K, V> key = it.next();
			if(key.getKey().equals("stop")) {
				;
			}
			else {
				System.out.println(cnt + ". " + key.getKey() + " " + key.getValue() + str);
				cnt++;
			}
			
		}
		System.out.println("------------------------ ");
	}

	public static void main(String[] args) {
		
		int iSelect;			//시작 화면 행동 선택
		String sMenuSelect;		//메뉴 선택
		int iAmount;
		int totalOrder = 0;		//주문 금액
		int totalSell = 0;		//전체 매출액
		boolean isEnd = false;	//다 골랐는지 여부
		
		HashMap<String, Integer> orderList = new HashMap<String, Integer>();
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		HashMap<String, Integer> menu = new HashMap<String, Integer>();
		
		menu.put("아메리카노", 1500);
		menu.put("카페라떼", 2500);
		menu.put("바나나주스", 3000);
		menu.put("바닐라라떼", 3500);
		menu.put("초코버블티", 4500);
		menu.put("치즈케이크", 5000);
		menu.put("stop", 0);
		
		while(true) {
			prnStart();
			iSelect = oInDev.nextInt();
			
			if(iSelect == 3) {
				System.out.println("프로그램을 종료합니다 ...");
				break;
			}
			
			switch(iSelect) {
			case 1 : 
				while(true) {
					prnMap(menu, "원");
					System.out.print("주문할 메뉴를 입력하세요 (종료는 stop 입력) : ");
					sMenuSelect = oInDev.next();
					if(menu.containsKey(sMenuSelect)==false) {
						System.out.println("해당 메뉴는 없습니다.");
						prnMap(menu, "원");
						System.out.print("주문할 메뉴를 입력하세요 (종료는 stop 입력) : ");
						sMenuSelect = oInDev.next();
					}
					
					if(sMenuSelect.equals("stop")) {
						System.out.print("주문이 완료되었나요?(y/n) : ");
						String str = oInDev.next();
						if(str.equals("y")) {
							break;
						}
						else {
							prnMap(menu, "원");
							System.out.print("주문할 메뉴를 입력하세요 (종료는 stop 입력) : ");
							sMenuSelect = oInDev.next();
						}
					}
					
					System.out.print("수량을 입력하세요 : ");
					iAmount = oInDev.nextInt();
					totalOrder = totalOrder + iAmount * menu.get(sMenuSelect);
					orderList.put(sMenuSelect, iAmount);
					System.out.println(">> " + sMenuSelect + " " + iAmount + "잔");
				}
				totalSell = totalSell + totalOrder;
				System.out.println("주문이 완료되었습니다 ... ");
				System.out.println("주문 내역을 출력합니다.");
				prnMap(orderList, "잔");
				totalOrder = 0;
				orderList.clear();
				break;
				
			case 2 : 
				Calendar now = Calendar.getInstance();
				System.out.println();
				System.out.println("*** 오늘자 매출 조회 *** ");
				System.out.println("날짜 : " + now.getTime());
				System.out.println("매출 금액 : " + totalSell + "원");
				System.out.println();
				
				break;
			default : 
				System.out.println("입력값이 유효하지 않습니다.");
				break;
			}
		}
		
		oInDev.close();

	}

}
