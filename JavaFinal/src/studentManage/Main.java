package studentManage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	private static void prnMenu() {
		System.out.println("--------------------------");
		System.out.println("1. 전체 학생의 학점 평균 조회");
		System.out.println("2. 학생 정보 등록");
		System.out.println("3. 학생 정보 삭제");
		System.out.println("4. 학생 정보 조회");
		System.out.println("5. 종료");
		System.out.println("--------------------------");
		System.out.print("원하는 메뉴를 선택해주세요 : ");
	}
	
	private static double getAvg(ArrayList<Student> students) {
		Iterator<Student> it = students.iterator();
		double avg, sum = 0.0;
		int cnt = 0;
		
		while(it.hasNext()) {
			sum = sum + it.next().getScoreAvg();
			cnt++;
		}
		avg = sum / cnt;
		return avg;
	}
	
	private static Student addStudent(Scanner oInDev) {
		int id;
		String name, major;
		double scoreAvg;
		
		System.out.print("학번 : ");
		try {
			id = oInDev.nextInt();
		}
		catch(InputMismatchException ex) {
			String str = oInDev.next();
			System.out.println("입력 값이 잘못되었습니다. 다시 입력하세요.");
			System.out.print("학번 : ");
			id = oInDev.nextInt();
		}
		System.out.print("이름 : ");
		name = oInDev.next();
		System.out.print("학과 : ");
		major = oInDev.next();
		System.out.print("학점 평균 : ");
		scoreAvg = oInDev.nextDouble();
		
		Student newStudent = new Student(id, name, major, scoreAvg);
		return newStudent;
	}

	private static void deleteStudent(Scanner oInDev, ArrayList<Student> students) {
		int delId, itNextId;
		boolean bFlag = false;
		Iterator<Student> it = students.iterator();
		
		System.out.print("삭제할 학생의 학번을 입력하세요 : ");
		delId = oInDev.nextInt();
		
		while(it.hasNext()) {
			itNextId = it.next().getId();
			if(itNextId == delId) {
				it.remove();
				bFlag = true;
				break;
			}
		}
		if(bFlag==true) {
			System.out.println("정상적으로 삭제가 완료되었습니다.");
		}
		else {
			System.out.println("해당 학번을 가진 학생 정보가 존재하지 않습니다.");
		}
	}
	
	private static void prnStudent(ArrayList<Student> students) {
		Iterator<Student> it = students.iterator();
		System.out.println(" *** 등록된 학생 정보 조회 *** ");
		
		while(it.hasNext()) {
			String studentInfo = it.next().toString();
		    System.out.println(studentInfo);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int selectMenu;
		boolean bFlag = false;
		ArrayList<Student> students = new ArrayList<Student>();
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		while(true) {
			prnMenu();
			selectMenu = oInDev.nextInt();
			System.out.println();
			
			if(selectMenu==5) {
				System.out.println("종료합니다...");
				break;
			}
			
			switch(selectMenu) {
			case 1 : 
				bFlag = students.isEmpty();
				if(bFlag) {
					System.out.println("학생 정보가 없습니다.");
				}
				else {
					double avg = getAvg(students);
					System.out.println("학생들의 학점 평균은 " + avg + "점 입니다.");
				}
				break;
			case 2 : 
				students.add(addStudent(oInDev));
				break;
			case 3 : 
				deleteStudent(oInDev, students);
				break;
			case 4 : 
				prnStudent(students);
				break;
			default : 
				System.out.println("잘못된 입력값입니다.");
				break;
			}
		}
		oInDev.close();
	}
}
