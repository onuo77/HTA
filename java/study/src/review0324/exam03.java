package review0324;

import java.util.Scanner;

public class exam03 {
	/*
	 * 3. Scanner / 논리연산자,비교연산자 
	 * 고객이름, 고객등급(1,2,3 중 하나다), 누적구매횟수, 당일총구매금액을 입력받는다.
	 * 고객이름, 고객등급, 누적구매횟수, 당일총구매금액, 적립포인트, 사은품지급여부를 출력한다.
	 * 적립포인트는 1등급고객의 경우 당일구매금액의 3%고, 나머지는 1%다.
	 * 사은품지급여부는 등급이 1등급이거나, 누적구매횟수가 5회이상이거나, 당일총구매금액이 30만원이상이면
	 * 사은품 지급 대상이다.(사은품 지급 여부는 "지급대상임", "지급대상이아님"으로 출력한다.)
	 * 
	 * 적립포인트와 사은품지급여부를 계산할 때는 조건식 ? 값1 : 값2;
	 * 조건 연산자의 조건식은 true/false가 최종연산결과로 나오는 비교연산자, 논리연산자를 사용한다.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("고객이름을 입력하세요");
		String customerName = sc.next();
		
		System.out.println("고객등급을 입력하세요");
		int grade = sc.nextInt();
		
		System.out.println("누적구매횟수를 입력하세요");
		int totalOrderCount = sc.nextInt();
		
		System.out.println("당일총구매금액을 입력하세요");
		int todayTotalPrice = sc.nextInt();
		
		int point = (int) (grade == 1 ? todayTotalPrice*0.03 : todayTotalPrice*0.01);
		String gift = grade == 1 || totalOrderCount >= 5 || todayTotalPrice >= 300000 ? "지급대상임" : "지급대상아님";
		
		System.out.println("========================");
		System.out.println("고객이름 : " + customerName);
		System.out.println("고객등급 : " + grade);
		System.out.println("누적구매횟수 : " + totalOrderCount);
		System.out.println("당일총구매금액 : " + todayTotalPrice);
		System.out.println("적립포인트 : " + point);
		System.out.println("사은품 지급여부 : " + gift);
		System.out.println("========================");
		
	}
	
}
