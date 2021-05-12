package review0324;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		//1. Scanner / 조건연산자 ( 조건식 ? 값1 : 값2; )
		// 이름, 국어, 영어, 수학점수를 입력받아서 총점, 평균을 계산하고 , 계산된 결과를 화면에 출력한다.
		// 평균이 90점 이상이면 장학금 지급 대상이 된다.		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요"); 
		String studentName = sc.next();
		
		System.out.println("국어점수를 입력하세요");
		int kor = sc.nextInt();
		
		System.out.println("영어점수를 입력하세요");
		int eng = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		int math = sc.nextInt();
		
		int totalScore = kor + eng + math;
		int average = totalScore/3;
		
		System.out.println("=====================");
		System.out.println("이름 : " + studentName);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		
		String result = average >= 90 ? "장학금 지급" : "장학금 미지급";
		System.out.println(result);
		System.out.println("=====================");
	}

}
