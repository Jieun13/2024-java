package gStackandQueue;

import java.util.NoSuchElementException;
import java.util.Vector;

public class Queue<T> {
	
private Vector<T> oQueue;
	
	public Queue() {
		oQueue = new Vector<T>();
	}
	
	public void enqueue(T oItem) {
		oQueue.addLast(oItem);
	}
	
	public T dequeue() {
		T tRes;
		try {
			tRes = oQueue.removeFirst();
		}
		catch(NoSuchElementException ex) {
			tRes = null;
		}
		return tRes;
	}

}
