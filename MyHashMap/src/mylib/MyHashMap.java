package mylib;

import java.util.NoSuchElementException;
import java.util.Vector;

public class MyHashMap <K, V>{
	
	private Vector<K> oKeySave;
	private Vector<V> oCount;

	public MyHashMap() {
		oKeySave = new Vector<K>();
		oCount = new Vector<V>();
	}
	
	public void put(K oItem, V oFre) {
		int index;
		index = getIndex(oItem);
		if(index == -1) {
			oKeySave.addLast(oItem);
			oCount.addLast(oFre);
		}
		else {
			System.out.println(oItem.toString() + "은 이미 저장한 객체입니다. ");
		}
	}
	
	public V getCount(K oItem) {
		V vRes;
		int index = oKeySave.indexOf(oItem);
		if(index == -1) {
			System.out.println(oItem.toString() +" 객체가 없습니다. ");
			vRes = null;
		}
		else {
			vRes = oCount.get(index);
		}
		return vRes;
	}
	
	public V remove (K oItem) {
		V vRes = null;
		int index;
		index = getIndex(oItem);
		if(index==-1) {
			System.out.println(oItem.toString() + " 객체가 없습니다. ");
		}
		else {
			oKeySave.remove(index);
			vRes = oCount.remove(index);
		}
		return vRes;
	}
	
	public void setCount (K oItem, V oNewCnt) {
		int index;
		index = getIndex(oItem);
		if(index == -1) {
			System.out.println(oItem.toString() + " 객체가 없습니다. ");
		}
		else {
			oCount.set(index, oNewCnt);
		}
	}
	
	private int getIndex(K oItem) {
		int index;
		try {
			index = oKeySave.indexOf(oItem);
		}
		catch (NoSuchElementException ex){
			index = -1;
		}
		return index;
	}
	
	public Vector<K> getKeySave() {
		return oKeySave;
	}
	
	public Vector<V> getCount(){
		return oCount;
	}
}