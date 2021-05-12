package review0329;

import java.util.Scanner;

public class review01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String value1 = "홍길동";
		System.out.println("이름을 입력하세요 : ");
		String value2 = sc.next();
		
		// value1변수의 주소값과 value2변수의 주소값을 비교
		System.out.println(value1 == value2);
		
		// value1변수의 문자열과 value2변수의 문자열을 비교
		System.out.println(value1.equals(value2));
		System.out.println(value2.equals(value1));
	}
}
