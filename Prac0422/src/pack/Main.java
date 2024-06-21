package pack;

import java.util.Scanner;

public class Main {
	
	private static Classroom setClass(Scanner oInDev) {
		Classroom Class;
		
		int iSize;
		int i;
		int iInputScore; 
		String sInputName;
		
		System.out.print("학생 수를 입력하세요 : ");
		iSize = oInDev.nextInt();
		
		Class = new Classroom(iSize);
		
		for(i=0; i<Class.getSize(); i++) {
			System.out.print("학생 " + i + " 의 이름을 입력하세요 : ");
			sInputName = oInDev.next();
			Class.setName(i, sInputName);
		}
		
		for(i=0; i<Class.getSize(); i++) {
			System.out.print("학생 " + i + " 의 점수를 입력하세요 : ");
			iInputScore = oInDev.nextInt();
			Class.setScore(i, iInputScore);
		}
		
		return Class;
	}

	public static void main(String[] args) {
		// TODO 학생들의 이름과 성적을 출력, 원하는 이름을 입력하면 성적 출력, 성적을 입력하면 그이상의 학생 이름 출력
		int iInputScore; 
		String sInputName;
		int i;
		
		Classroom Class;
		
		Scanner oInDev;
		oInDev = new Scanner (System.in);
		
		Class = setClass(oInDev);
		
		for(i=0; i<Class.getSize(); i++) {
			System.out.print("학생 " + i + '\t');
			Class.prnStudent(i);
		}
		
		System.out.print("학생의 이름을 입력하세요 : ");
		sInputName = oInDev.next();
		if(Class.getStudentScore(sInputName)!=-1) {
			System.out.println(">> " + Class.getStudentScore(sInputName));
		}
		
		System.out.print("학생의 점수를 입력하세요 : ");
		iInputScore = oInDev.nextInt();
		System.out.println(">> " + Class.getStudentName(iInputScore));
		
		oInDev.close();
	}
}
