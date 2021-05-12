package review0407.banking;

public class Transfer extends AbstractBanking{
	//job override 
	//이체금액을 입력받는다.
	//수신자 계좌번호를 입력받는다.
	//수신자에게 금액을 이체한다.
	//잔액을 변경한다.
	//이체결과를 화면에 표시한다.
	
	@Override
	public void job() {

		System.out.println("이체금액을 입력받는다.");
		System.out.println("수신자 계좌번호를 입력받는다.");
		System.out.println("수신자에게 금액을 이체한다.");
		System.out.println("잔액을 변경한다.");
		System.out.println("이체결과를 화면에 표시한다.");
		System.out.println();
	}
}
