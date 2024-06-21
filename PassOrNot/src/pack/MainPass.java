package pack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPass {
	
	public static boolean isPass(int iGrade, int iScore) {
		boolean bPass = false;
		
		if (iScore >= 60) {
			if(iGrade == 4) {
				if(iScore >= 70) {
					bPass = true;
				}
				else {
					bPass = false;
				}
			}
			else {
				bPass = true;
			}
		}
		
		if(iGrade==4) {
			if(iScore>=70) {
				bPass = true;
			}
			else {
				bPass = false;
			}
		}
		else {
			if(iScore>=60) {
				bPass = true;
			}
			else {
				bPass = false;
			}
		}
		
		return bPass;
	}

	public static void main(String[] args) {
		// TODO 점수와 학년을 입력 받아 60점 이상이면 합격, 미만이면 불합격을 출력하라. 
		//		단, 4학년은 70점 이상이어야 합격.
		
		int iGrade, iScore;
		boolean bPass = false;
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		iGrade = 0;
		iScore = 0;
				
		try {
			System.out.print("학년 : ");
			iGrade = oInDev.nextInt();
			
			System.out.print("성적 : ");
			iScore = oInDev.nextInt();
			
			bPass = isPass(iGrade, iScore);
		}
		catch(InputMismatchException ex) {
			System.out.println("잘못된 입력값입니다.");
		}
		
		if(bPass == true) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		oInDev.close();
	}

}
