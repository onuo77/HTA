package review0414;

public class WrapperApp2 {

	public static void main(String[] args) {
		Integer[] scores = {100, 100, 80, 100, 50, 60, 70, 80, 50, 60};
		//합계저장할 변수 선언
		int sum = 0;
		//향상된 for문에 타입 Integer로 배열의 합계 구하기
		for(Integer score : scores) {
			sum += score;
		}
		System.out.println(sum);
		//합계저장할 변수2 선언
		int sum2 = 0;
		//향상된 for문에 기본형 int로 배열의 합계 구하기
		for(int score : scores) {
			sum2 += score;
		}
		System.out.println(sum2);
	}
}
