package myapp;

import mylib.MyHashMap;
import mylib.Point;

import java.util.Iterator;

public class Main {
	
	private static <K, V> void prnKeys(MyHashMap<K, V> oMyMap) {
		Iterator<K> itPoint = oMyMap.getKeySave().iterator();
		Iterator<V> itCount = oMyMap.getCount().iterator();
		
		while(itPoint.hasNext()&& itCount.hasNext()) {
			System.out.print("객체 : " + itPoint.next().toString() + " ");
			System.out.print("빈도 수 : " + itCount.next().toString());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		MyHashMap<Point, Integer> oMyMap;
		
		oMyMap = new MyHashMap<Point, Integer>();
		
		Point oPoint1 = new Point(1,0);
		Point oPoint2 = new Point(3,4);
		Point oPoint3 = new Point(2,1);
		
		oMyMap.put(oPoint2, 5);
		oMyMap.put(oPoint3, 3);
		
		prnKeys(oMyMap);
		System.out.println("-----------------------------");
		
		oMyMap.put(oPoint1, 2);
		oMyMap.put(oPoint2, 9);
		oMyMap.remove(oPoint2);
		oMyMap.setCount(oPoint3, 10);
		
		prnKeys(oMyMap);
		System.out.println("-----------------------------");
		
		System.out.println("객체 " + oPoint1.toString() + "의 빈도수 : " + oMyMap.getCount(oPoint1));
		System.out.println("객체 " + oPoint2.toString() + "의 빈도수 : " + oMyMap.getCount(oPoint2));
		System.out.println("객체 " + oPoint3.toString() + "의 빈도수 : " + oMyMap.getCount(oPoint3));
		
	}
}