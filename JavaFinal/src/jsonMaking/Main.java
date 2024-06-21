package jsonMaking;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

public static void main(String[] args) {
		
		String query;
		String jsonKey[] = new String [100];
		String jsonValue[] = new String [100];
		int cnt = 0;
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		while(true) {
			query = oInDev.nextLine();
			
			if(query.equals("exit")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(query, ":");
			jsonKey[cnt] = st.nextToken().trim();
			jsonValue[cnt] = st.nextToken(":").trim();
			cnt++;
		}
		
		StringBuffer json = new StringBuffer();
		json.append("JSON Output {\n");
		for(int i=0; i<cnt; i++) {
			json.append("   " + jsonKey[i] + " : ");
			try {
				Integer v = Integer.parseInt(jsonValue[i]);
				json.append(v);
				json.append('\n');
			}
			catch (NumberFormatException ex){
				json.append('"' + jsonValue[i] + '"' + '\n');
			}
		}
		json.append("}");
		
		System.out.println(json);
		
		oInDev.close();
	}

}
