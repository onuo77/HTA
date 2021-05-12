package review0414;

public class WrapperApp3 {

	public static void main(String[] args) {
		//문자열 실수로 변환하기
		String value1 = "150000";
		String value2 = "3";
		String value3 = "0.01";
		//value의 문자열들을 int와 double형으로 바꾸기 (price, amount, savePointRate)
		int price = Integer.parseInt(value1);
		int amount = Integer.parseInt(value2);
		double savePointRate = Double.parseDouble(value3);
		//price와 amount로 합 구하기
		int total = price * amount;
		//총합으로 포인트계산하기
		int point = (int)(total * savePointRate); 
		//출력
		System.out.println("총계 :" + total);
		System.out.println("포인트 :" + point);
	}
}
