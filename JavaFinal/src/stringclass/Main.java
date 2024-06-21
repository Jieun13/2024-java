package stringclass;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

public static void main(String[] args) {
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		String strInput;
		String editText="", addText="", replaceText="";
		int index = -1, delIndex = -1;
		
		System.out.print(">> ");
		strInput = oInDev.nextLine();
		StringBuffer sb = new StringBuffer(strInput);
		
		while(true) {
			System.out.print("명령 : ");
			editText = oInDev.nextLine();
			
			if(editText.equals("stop")) break;
			
			StringTokenizer st = new StringTokenizer(editText, "!");
			replaceText = st.nextToken();
			
			delIndex = editText.indexOf("!");
			addText = editText.substring(delIndex+1);
			
			index = sb.indexOf(replaceText);
			if(index==-1) {
				System.out.println("해당 문자열이 없습니다.");
			}
			else {
				sb.replace(index, (index+replaceText.length()), addText);
			}
			System.out.println(sb);
		}
		
		oInDev.close();
	}

}
