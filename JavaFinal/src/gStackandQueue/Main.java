package gStackandQueue;

public class Main {

	public static void main(String[] args) {
		
		Integer iValue;
		String sStr;
		
		Stack<Integer> oStack = new Stack<Integer>();
		Queue<String> oQueue = new Queue<String>();
		
		int arr1[] = new int[5];
		String arr2[] = new String[5];
		
		arr1[0] = 0; 
		arr2[0] = "one";
		arr1[1] = 1; 
		arr2[1] = "two";
		arr1[2] = 2; 
		arr2[2] = "three";
		arr1[3] = 3; 
		arr2[3] = "four";
		arr1[4] = 4; 
		arr2[4] = "five";
		
		for(int i=0; i<5; i++) {
			oStack.push(arr1[i]);
			oQueue.enqueue(arr2[i]);
		}
		
		while(true) {
			iValue = oStack.pop();
			sStr = oQueue.dequeue();
			
			if(iValue == null || sStr == null) {
				break;
			}
			else {
				System.out.print(iValue + " ");
				System.out.println(sStr);
			}
		}
	}
}