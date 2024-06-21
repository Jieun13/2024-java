package gStackandQueue;

import java.util.NoSuchElementException;
import java.util.Vector;

public class Stack<T> {
	
	private Vector<T> oVector;
	
	public Stack() {
		oVector = new Vector<T>();
	}
	
	public void push(T oItem) {
		oVector.addLast(oItem);
	}
	
	public T pop() {
		T tRes;
		try {
			tRes = oVector.removeLast();
		}
		catch(NoSuchElementException ex) {
			tRes = null;
		}
		return tRes;
	}

}
