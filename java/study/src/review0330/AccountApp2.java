package review0330;

public class AccountApp2 {
	
	public static void main(String[] args) {
		
		Account[] accArr = new Account[3];
		Account acc2 = new Account();
		Account acc3 = new Account();
		
		Account acc1 = new Account();
		acc1.accName = "홍길동";
		acc1.accPW = 1234;
		acc1.balance = 13000;
		
		accArr[0] = acc1;
		
		acc1.displayInfo();
	}
}
