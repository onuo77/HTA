package review0324;

public class exam08 {
	
	public static void main(String[] args) {
		
		//8. for문 
		//1~10까지 출력하기
		for (int i=1; i<=10; i++) {
			System.out.printf(i+"\t");
		}
		
		System.out.println("\n");
		
		//구구단 2단 출력하기
		int dan = 2;
		for (int i=1; i<10; i++) {
			System.out.println(dan + "x" + i + "=" + (dan*i));
		}
		
		//합계 구하기 (1~100 / 1001~2000)
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("\n1~100 합계 : " + sum);
		
		int sum2 = 0;
		for(int i=1001; i<=2000; i++) {
			sum2 += i;
		}
		System.out.println("\n1001~2000 합계 : " + sum2);
	} 
}
