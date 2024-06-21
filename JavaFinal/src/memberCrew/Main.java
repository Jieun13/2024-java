package memberCrew;

import java.util.Scanner;

public class Main {

	private static Member getInput(Scanner oInDev, boolean isCrew) {
		int iId;
		String sName;
		String sDepartment;
		Member oMember;
		
		System.out.println();
		System.out.print("Student ID : ");
		iId = oInDev.nextInt();
		System.out.print("Name : ");
		sName = oInDev.next();
		
		if(isCrew==true) {
			System.out.print("Department : ");
			sDepartment = oInDev.next();
			oMember = new Crew (iId, sName, sDepartment);
		}
		else {
			oMember = new Member(iId, sName);
		}
		return oMember;
	}
	
	private static void print(Member oList[]) {
		for(int i=0; i<oList.length; i++) {
			System.out.println(oList[i].toString());
			System.out.println();
		}
	}
	
	private static void printSameMember(Member mList[], Member cList[]) {
		boolean bFlag = false;
		for(int j=0; j<mList.length; j++) {
			for(int i=0; i<cList.length; i++) {
				if((mList[j].equals(cList[i]))==true) {
					System.out.println("중복 ID : " + mList[j].getId());
					bFlag = true;
				}
			}
		}
		if(bFlag==false) {
			System.out.println("중복 학생 없음");
		}
	}

	public static void main(String[] args) {
		int i;
		int iMemberSize, iCrewSize;
		Member oMemberList[];
		Crew oCrewList[];
		
		Scanner oInDev;
		oInDev = new Scanner (System.in);

		System.out.print("일반 동아리원 수를 입력하시오 : ");
		iMemberSize = oInDev.nextInt();
		System.out.print("집행부 수를 입력하세요 : ");
		iCrewSize = oInDev.nextInt();
		
		oMemberList = new Member [iMemberSize];
		oCrewList = new Crew [iCrewSize];
		
		System.out.println();
		System.out.print("--- Input Member Information ---");
		for(i=0; i<iMemberSize; i++) {
			oMemberList[i] = getInput(oInDev, false);
		}
		
		System.out.println();
		System.out.print("--- Input Crew Information ---");
		for(i=0; i<iCrewSize; i++) {
			oCrewList[i] = (Crew)getInput(oInDev, true);
		}
		
		System.out.println();
		
		System.out.println("--- Member Information ---");
		print(oMemberList);
		
		System.out.println("--- Crew Information ---");
		print(oCrewList);
		
		printSameMember(oMemberList, oCrewList);
		
		oInDev.close();
	}

}