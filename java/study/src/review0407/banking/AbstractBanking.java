package review0407.banking;

public abstract class AbstractBanking {

	// 모든 뱅킹작업에서 항상 실행하는 전처리 작업 (은행 전산시스템과 연결하기 / 사용자 인증작업 수행하기)
	public void before() {
		System.out.println("은행 전산시스템과 연결하기");
		System.out.println("사용자 인증작업 수행하기");
	}
	
	// 모든 뱅킹작업에서 항상 실행하는 후처리 작업 (은행 전산시스템과 연결해제하기)
	public void after() {
		System.out.println("은행 전산시스템과 연결해제하기");
	}
	
	//실제로 수행하는 작업에 대한 메소드만 설계 - 변하는 부분(job)
	public abstract void job();
	
	//뱅킹작업에 참여하는 모든 메소드를 순서에 맞게 실행해주는 메소드
	public void process() {
		before();
		job();
		after();
	}
}
