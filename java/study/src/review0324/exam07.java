package review0324;

import java.util.Scanner;

public class exam07 {
	
	public static void main(String[] args) {
		/*
		7. Scanner / if문 / 중첩 if문 / else if문
		 * 고객명, 고객등급, 총구매금액을 입력받는다.
		 * 고객명, 고객등급, 총구매금액, 적립포인트, 보너스포인트를 출력한다.
		 * 
		 * 등급별 적립포인트는 1등급은 5%, 2등급은 3%, 3등급은 1%다.
		 * 보너스포인트 지급기준 
		 *       1등급은 300만원 초과한 부분에 대해서 10% 추가포인트 지급
		 *       2등급은 150만원 초과한 부분에 대해서 5% 추가포인트 지급
		 *       3등급은 100만원 초과한 부분에 대해서 3% 추가포인트 지급  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//고객정보 입력받기
		System.out.println("고객명을 입력하세요");
		String customerName = sc.next();
		
		System.out.println("고객등급을 입력하세요");
		int grade = sc.nextInt();
		
		System.out.println("총구매금액을 입력하세요");
		int totalOrderPrice = sc.nextInt();
		
		int point = 0;
		int bonusPoint = 0;
		//등급별 포인트 적립
		if(grade == 1) {
			if(totalOrderPrice>3000000) {
				bonusPoint = (int) ((totalOrderPrice-3000000)*0.1);
				point = bonusPoint + 150000;
			}else {
				point = (int) (totalOrderPrice * 0.05);
			}			
		}else if(grade == 2) {
			if(totalOrderPrice>1500000) {
				bonusPoint = (int) ((totalOrderPrice-1500000)*0.05);
				point = bonusPoint + 45000;
			}else {
				point = (int) (totalOrderPrice * 0.03);
			}			
		}else if(grade == 3) {
			if(totalOrderPrice > 1000000) {
				bonusPoint = (int) ((totalOrderPrice - 1000000)*0.03);
				point = bonusPoint + 30000;
			}else {
				point = (int) (totalOrderPrice * 0.01);
			}
		}
		
		System.out.println("========================");
		System.out.println("고객명 : " + customerName);
		System.out.println("고객등급 : " + grade);
		System.out.println("총구매금액 : " + totalOrderPrice);
		System.out.println("적립포인트 : " + point);
		System.out.println("보너스포인트 : " + bonusPoint);
		System.out.println("========================");
	}
}
