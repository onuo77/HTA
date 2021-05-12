package review0331;

public class MethodOverloadingSampleApp {
	public static void main(String[] args) {
		//MethodOverloadingSample 객체 생성
		MethodOverloadingSample mos = new MethodOverloadingSample();
		
		//MethodOverloadingSample에서 만들었던 메소드 사용해보기
		mos.ca(10, 11);		
		mos.ca(10.5, 11);		
		mos.ca(10, 11.5);		
		mos.ca(10.54, 11.22);		
		mos.ca(10, 11, 20);		
	}
}
