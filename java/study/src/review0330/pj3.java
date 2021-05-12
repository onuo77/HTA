package review0330;

public class pj3 {
//	숫자 12345가 있다.
//	1 + 2 + 3 + 4 + 5 ------> 15
//	ex) 65486516 숫자일 경우에도 무조건 합이 나와야함
//	%연산자를 사용해야 됨
	public static void main(String[] args) {
		
		int num = 23543;
		int sum = 0;
		
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("합 : " + sum);
	}
}
