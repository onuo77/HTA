package review0413;

public class StringBuilderApp {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		//이름,전화번호,이메일,나이,키,몸무게,혈액형,결혼여부 값 추가
		//.toString()으로 출력
		sb.append("홍길동")
		  .append(",")
		  .append("010-1111-2222")
		  .append(",")	  
		  .append("abc@gmail.com")
		  .append(",")
		  .append(53)
		  .append(",")
		  .append(156)
		  .append(",")
		  .append(56)
		  .append(",")
		  .append("a")
		  .append(",")
		  .append(false);
		System.out.println(sb.toString());
	}
}
