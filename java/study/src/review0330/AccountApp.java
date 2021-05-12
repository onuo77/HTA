package review0330;

public class AccountApp {
	
	public static void main(String[] args) {
//        Account2객체를 생성한다.
		Account acc = new Account();
		
//        생성된 Account2객체의 멤버변수에 예금주, 비밀번호, 잔액정보를 저장한다.
		acc.accName = "홍길동";
		acc.accPW = 1234;
		acc.balance = 10000;
		
//        생성된 Account2객체의 계좌정보 출력기능을 실행해서 화면에 예금주, 잔액을 출력한다.
		acc.displayInfo();	//10000
		
//        생성된 Account2객체의 입금기능을 실행한다.
		acc.deposit(20000);	//+20000
		
//        생성된 Account2객체의 계좌정보 출력기능을 실행해서 화면에 예금주, 잔액을 출력한다.
		acc.displayInfo();	//30000
		
//        생성된 Account2객체의 출금기능을 실행한다.
		acc.withdraw(5000, 1111);	//error
//        생성된 Account2객체의 계좌정보 출력기능을 실행해서 화면에 예금주, 잔액을 출력한다.
		acc.displayInfo();	//30000
		
		acc.withdraw(10000, 1234);	//-10000
		acc.displayInfo();	//20000
	}
}
