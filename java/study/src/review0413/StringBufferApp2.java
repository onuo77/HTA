package review0413;

public class StringBufferApp2 {

	public static void main(String[] args) {
		String name1 = "김유신";
		String name2 = "강감찬";
		String name3 = "이순신";
		StringBuffer sb = new StringBuffer();
		//.append() String 참조변수 입력
		sb.append(name1)
		  .append(",")
		  .append(name2)
		  .append(",")
		  .append(name3);
		//.toString() 출력
		System.out.println(sb.toString());
	}
}
