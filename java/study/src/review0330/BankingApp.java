package review0330;

public class BankingApp {
	
	public static void main(String[] args) {
		// 계좌 등록, 조회, 적금, 이체, 예치금액조회, 비밀번호 변경기능을 제공하는 Banking객체 생성하기
		Banking banking = new Banking();
		
		// 신규계좌 등록해보기
		// 번호, 예금주, 최초잔액, 비밀번호를 입력받아서 Banking객체의 신규계좌 개설기능에 전달한다.
		banking.insertAcc(100, "짱구", 10000, 1111);
		banking.insertAcc(200, "철수", 20000, 2222);
		banking.insertAcc(300, "훈이", 30000, 3333);
		banking.insertAcc(400, "유리", 40000, 4444);
		banking.insertAcc(500, "맹구", 50000, 5555);
		
		System.out.println("----------------------");

		// 조회해보기
		// 계좌번호, 비밀번호를 입력받아서 Banking 객체의 조회기능에게 전달해서, 계좌정보를 받아온다.
		Acc result1 = banking.getAccByNo(100, 1111);
		
		if(result1 != null) {
			System.out.println("### 계좌조회 ###");
			System.out.println("계좌번호 : " + result1.accNo);
			System.out.println("현재잔액 : " + result1.balance);
			System.out.println("통장이율 : " + result1.interestRate);
		}else {
			System.out.println("일치하는 계좌정보 없음");
		}

		System.out.println("----------------------");
		
		Acc result2 = banking.getAccByNo(120, 3511);
		
		if(result2 != null) {
			System.out.println("계좌번호 : " + result2.accNo);
			System.out.println("현재잔액 : " + result2.balance);
			System.out.println("통장이율 : " + result2.interestRate);
		}else {
			System.out.println("일치하는 계좌정보 없음");
		}
		
	}
}
