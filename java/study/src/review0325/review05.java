package review0325;

import java.util.Scanner;

public class review05 {

	public static void main(String[] args) {
		//5. if - else 문/ 내포된 if문 / if ~ else if / while 문 (WhileDemo2.java)
		/*
		   while문을 통한 무한루프
		   결제, 충전, 종료 서비스 구현하기
		   코드 작성 후 주석으로 리뷰 해보기 추천! (어떤 식으로 작동되는지..)
		 */
		Scanner sc = new Scanner(System.in);	// Scanner객체로 입력장치로 입력받기

		int chargeMoney = 10000;	//chargeMoney(저장소)에 충전금액(10000) 설정하기
		while(true) {	// 무한 반복하는 while문 선언

			System.out.println("================"); 	//서비스안내
			System.out.println("1.결제 2.충전 3.종료");
			System.out.println("================");

			System.out.println("서비스를 선택하세요.");	
			int selectNum = sc.nextInt();	//scanner를 통해서 서비스 선택 받기

			if(selectNum == 1) { // 만약 선택한 번호가 1과 같다면
				System.out.println("사용금액을 입력하세요"); 	
				int spendMoney = sc.nextInt();	// 사용자에게 사용금액을 입력받기
				if(spendMoney > chargeMoney) {	// 만약 사용금액이 충전금액보다 크다면
					System.out.println("잔액 부족");	//잔액부족 출력
					System.out.println("");	//Enter
				}else {	//그 외의 경우 (충전금액이 사용금액보다 크다면)
					chargeMoney -= spendMoney; //충전금액에서 사용금액을 빼기
					System.out.println("사용금액 : " + spendMoney); 	//사용금액 출력
					System.out.println("남은금액 : " + chargeMoney);	//충전금액에서 남은 금액출력
					System.out.println("");	//Enter
				}				
			} else if(selectNum == 2) {	//만약 선택한 번호가 2와 같다면
				System.out.println("충전금액을 입력하세요");	
				int charge = sc.nextInt();	//충전할 금액을 사용자에게 입력받기
				chargeMoney += charge;	//기존 충전금액에 사용자에게 입력받은 충전금액 저장하기
				System.out.println("잔액 : " + chargeMoney);	//잔액 출력
				System.out.println("");	//Enter
				
			} else if(selectNum == 3) {	//만약 선택한 번호가 3과 같다면
				System.out.println("=====서비스종료====="); 
				break; // break으로 while 실행문을 종료하기
				
			} else { // 1,2,3 이외의 숫자를 선택했을 경우
				System.out.println("### 서비스오류, 재선택 ###"); //서비스 오류로 재선택 반복
				System.out.println(""); //Enter
			}

		}
	}
}
