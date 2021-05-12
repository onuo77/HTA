package review0324;

import java.util.Scanner;

public class exam06 {
	
	public static void main(String[] args) {
	
		/*
		 * 6. Scanner / if문 / 중첩 if문
		 * 학생이름, 전자계산기, 데이터베이스, 알고리즘 점수를 입력받는다.
		 * 학생이름, 각 과목점수, 총점, 평균, 합격여부를 출력한다.
		 * 평균이 60점 이상이면 합격이다.
		 * 한 과목이라도 40점 미만인 경우는 불합격이다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//학생이름, 과목점수 입력받기
		System.out.println("학생이름을 입력하세요");
		String studentName = sc.next();
		
		System.out.println("전자계산기 점수를 입력하세요");
		int ec = sc.nextInt();
		
		System.out.println("데이터베이스 점수를 입력하세요");
		int db = sc.nextInt();
		
		System.out.println("알고리즘 점수를 입력하세요");
		int al = sc.nextInt();
		
		// 총점, 평균
		int totalScore = ec + db + al;
		int average = totalScore/3;
		
				
		// 정보출력
		System.out.println("======================");
		System.out.println("학생이름 : " + studentName);
		System.out.println("전자계산기 점수 : " + ec);
		System.out.println("데이터베이스 점수 : " + db);
		System.out.println("알고리즘 점수 : " + al);
		System.out.println("총점 : " + totalScore);		
		System.out.println("평균 : " + average);		
		
		//합격여부
		if(average >= 60) {
			if(ec < 40 || db < 40 || al < 40) {
				System.out.println("불합격(과락)");
			}else {
				System.out.println("합격");
			}
		}else {
			System.out.println("불합격");
		}
		System.out.println("======================");
	}
}
