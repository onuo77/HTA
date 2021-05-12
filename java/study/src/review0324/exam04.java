package review0324;

import java.util.Scanner;

public class exam04 {
	
	public static void main(String[] args) {
		/*
		 * 4. if ~ else if문
		 * 91점 이상이면 "A", 81점 이상이면 "B", 71점 이상이면 "C"
		 * 61점 이상이면 "D", 60점 이하는 "F"를 출력한다. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		
		if(score>90) {
			System.out.println("A");
		}else if(score>80) {
			System.out.println("B");			
		}else if(score>70){
			System.out.println("C");
		}else if(score>60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}
}
