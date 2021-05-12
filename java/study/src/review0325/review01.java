package review0325;

public class review01 {
	
	public static void main(String[] args) {
		// 1. for문에 내포된 if문 (ForDemo2.java)
		// 1 ~ 10사이의 정수 중에서 홀수만 출력하기
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			} 
		}

		// 1 ~ 10사이의 정수 중에서 짝수의 총합을 계산하고, 그 결과를 출력하기
		int evenSum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				evenSum += i;
			}
		}
		System.out.println("\n짝수합 : " + evenSum);

		// 1 ~ 10사이의 정수 중에서 홀수의 총합과 짝수의 총합을 계산하고, 그 결과를 출력하기
		int odd = 0;
		int even = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				even += i;
			}else {
				odd += i;
			}
		}
		System.out.println("\n짝수합 : " + even);
		System.out.println("홀수합 : " + odd);
		
	}
}
