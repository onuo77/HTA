package review0407.banking;

public class Deposit extends AbstractBanking{

	//job override 
	//입금액을 입력받는다
	//금액을 확인한다
	//잔액을 증가시킨다
	//입금결과를 표시한다
	
	@Override
	public void job() {
		System.out.println("입금액을 입력받는다");
		System.out.println("금액을 확인한다");
		System.out.println("잔액을 증가시킨다");
		System.out.println("입금결과를 표시한다");
		System.out.println();
	}
}
