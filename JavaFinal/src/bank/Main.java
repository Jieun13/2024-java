package bank;

import java.util.Scanner;

public class Main {

	private static void printMenu() {
		System.out.println();
		System.out.println("---------- Menu ---------");
		System.out.println("1. 입금");
		System.out.println("2. 출금 ");
		System.out.println("3. 계좌 조회");
		System.out.println("4. 종료");
		System.out.print("수행할 작업을 선택해주세요 : ");
	}
	
	private static BankAccount makeAccount (Scanner oInDev, int accountChoice) {
		String accountNum;
		double accountBal, rate;
		BankAccount oAccount = null;
		
		System.out.print("계좌 번호를 입력하세요 : ");
		accountNum = oInDev.next();
		System.out.print("초기 금액을 입력하세요 : ");
		accountBal = oInDev.nextDouble();
		
		if(accountChoice==1) {
			oAccount = new BankAccount(accountNum, accountBal);
		}
		else{
			System.out.print("이자율을 입력하세요 (N%일 경우 N만 입력) : ");
			rate = oInDev.nextDouble();
			
			oAccount = new SavingAccount(accountNum, accountBal, rate);
		}
		
		System.out.println("계좌가 생성되었습니다.");
		return oAccount;
	}

	public static void main(String[] args) {
		
		BankAccount oAccount;
		double amount;
		String currency;
		
		Scanner oInDev;
		oInDev = new Scanner (System.in);
		
		System.out.println("생성할 계좌 유형을 선택하세요. 1. 일반 계좌  2. 저축 계좌");
		System.out.print(">> ");
		int accountChoice = oInDev.nextInt();
		
		if(accountChoice==1) {
			oAccount = makeAccount(oInDev, accountChoice);
		}
		else if(accountChoice==2) {
			oAccount = (SavingAccount)makeAccount(oInDev, accountChoice);
		}
		else {
			oAccount = null;
			System.out.println("입력값이 유효하지 않습니다.");
		}
		
		while(true) {
			printMenu();
			int select = oInDev.nextInt();
			System.out.println();
			
			if(select==4 || oAccount==null) {
				System.out.println("프로그램을 종료합니다... ");
				break;
			}
			
			switch(select) 
			{
			case 1 : //입금
				System.out.print("외화인가요? (y/n) : ");
				String isCurrency = oInDev.next();
				
				if(isCurrency.equals("y")) {
					System.out.print("입금할 금액과 단위를 입력하세요 : ");
					amount = oInDev.nextDouble();
					currency = oInDev.next();
					oAccount.deposit(amount, currency);
				}
				else {
					System.out.print("입금할 금액을 입력하세요 : ");
					amount = oInDev.nextDouble();
					oAccount.deposit(amount);
				}
				break;

			case 2 :  //출금
				System.out.print("출금할 금액을 입력하세요 : ");
				amount = oInDev.nextDouble();
				oAccount.withdraw(amount);
				break;
				
			case 3 : //계좌 조회
				System.out.println("계좌를 조회합니다... ");
				System.out.println(oAccount);
				break;
			
			default : 
				System.out.println("입력값이 유효하지 않습니다.");
				break;
			}
			
		}
		
		oInDev.close();
	}

}
