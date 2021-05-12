package review0324;

import java.util.Scanner;

public class exam05 {
	
	public static void main(String[] args) {
		
		/*
		 * 5. Scanner / 중첩 if문  
		 * 내포된 if문 사용하기
		 * 고객명, 고객등급, 총구매금액을 입력받는다.
		 * 고객등급이 1등급인 경우, 총구매금액의 3%를 적립포인트를 지급한다.
		 * 	단, 총구매금액이 100만원을 초과하는 경우, 
		 * 	100만원을 제외한 나머지 금액에 대해서는 5%를 적립한다.
		 * 그 외는 총구매금액에 관계없이 총구매금액의 1%를 적립포인트로 지급한다.
		 * 
		 * 고객명, 고객등급, 총구매금액, 적립포인트를 출력한다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		//고객명,고객등급,총구매금액 입력받기
		System.out.println("고객명을 입력하세요");
		String customerName = sc.next();
		
		System.out.println("고객등급을 입력하세요");
		int grade = sc.nextInt();
		
		System.out.println("총구매금액을 입력하세요");
		int totalOrderPrice = sc.nextInt();
		
		int point = 0;
		int bonusPoint = 0;
		// 고객등급이 1등급인 경우, 적립포인트 3% 지급 (100만원 초과시 초과금액은 5% 적립)
		// 그 외의 금액은 1%적립
		if(grade == 1) {
			if(totalOrderPrice>1000000) {
				bonusPoint = (int) ((totalOrderPrice-1000000)*0.05);
				point = bonusPoint + 30000;
			}else {
				point = (int) (totalOrderPrice * 0.03);
			}
		}else {
			point = (int) (totalOrderPrice * 0.01);
		}
		
		System.out.println("=====================");
		System.out.println("고객명 : " + customerName);
		System.out.println("고객등급 : " + grade);
		System.out.println("총구매금액 : " + totalOrderPrice);
		System.out.println("적립포인트 : " + point);
		System.out.println("보너스포인트 : " + bonusPoint);
	}
}
