package review0413;

public class ObjectApp2 {

	public static void main(String[] args) {
		Person p1 = new Person(10, "홍길동", "hong@gmail.com");
		Person p2 = new Person(20, "김유신", "kimyoushint@naver.com");
		//String toString()
		String value1 = p1.toString();
		System.out.println(value1);
		
		String value2 = p2.toString();
		System.out.println(value2);
	}
}
