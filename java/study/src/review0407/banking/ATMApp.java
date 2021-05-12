package review0407.banking;

import java.util.Scanner;

public class ATMApp {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//ATM 객체생성
		ATM a = new ATM();
		
		//Deposit 객체생성
		Deposit d = new Deposit();
		
		//Transfer 객체생성
		Transfer t = new Transfer();
		
		//1.입금 2.이체 3.종료 while문 생성
		//메뉴번호 입력받기
		//메뉴번호에 따라 출력하기
		//입금작업
		//이체작업
		//종료
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.입금 2.이체 0.종료");
			System.out.println("-----------------------------------");
			
			int menuNo = sc.nextInt();
			
			if(menuNo == 1) {
				System.out.println("[입금]");
				a.setBanking(d);
				a.runBanking();
				
			}else if(menuNo == 2){
				System.out.println("[이체]");
				a.setBanking(t);
				a.runBanking();
				
			}else if(menuNo == 0){
				System.out.println("[종료]");
				break;
			}
			
		}

	}
	
}
