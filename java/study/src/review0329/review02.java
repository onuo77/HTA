package review0329;

import java.util.Scanner;

public class review02 {
	
	public static void main(String[] args) {
		 String[] name = {"김유신", "강감찬", "이순신", "홍길동", "류관순"};
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("조회할 이름을 입력하세요 : ");
		 
		 String value = sc.next();

		 //입력한 이름이 배열에 존재하는지 확인해보기
		 boolean isExist = false;
		 for(String x : name) {
			 if(x.equals(value)) {
				 isExist = true;
				 break; //★
			 }
		 }
		 System.out.println(isExist);
	}
}
