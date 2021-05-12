package review0330;

public class Banking {
	
	Acc[] accArr = new Acc[5];
	int savePosition = 0;
	
	//신규계좌 개설(등록) 기능
	// 등록기능 -> 반환값 없음
	// 매개변수 : 계좌번호, 사용자명, 최초잔액, 비밀번호
	void insertAcc(int accNo, String accName, int balance, int accPw) {
		System.out.println("계좌번호 : " + accNo);
		System.out.println("사용자명 : " + accName);
		System.out.println("최초잔액 : " + balance);
		System.out.println("비밀번호 : " + accPw);
		
		Acc acc = new Acc();
		acc.accNo = accNo;
		acc.accName = accName;
		acc.balance = balance;
		acc.accPw = accPw;
		
		accArr[savePosition] = acc;
		savePosition++;
		System.out.println("### 신규계좌개설 완료 ###");
		System.out.println();
	}
	
	//계좌정보 조회 기능
	// 반환값 : 있음(Account 객체) <- 조회기능
	// 매개변수 : 계좌번호, 비밀번호
	Acc getAccByNo(int accNo, int accPw) {
		
		Acc seachedAcc = null;
		for(Acc aa : accArr) {
			if(aa.accNo == accNo && aa.accPw == accPw) {
				seachedAcc = aa;
				break;
			}
		}
		return seachedAcc;
	}
}
