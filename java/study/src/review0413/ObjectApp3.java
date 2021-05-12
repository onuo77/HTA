package review0413;

public class ObjectApp3 {

	public static void main(String[] args) {
		Person p1 = new Person(10, "홍길동", "hong@gmail.com");
		Person p2 = new Person(20, "김유신", "kimyoushint@naver.com");
		Person p3 = new Person(20, "김유신", "kimyoushint@naver.com");
		//p1참조변수가 참조하는 객체의 해시코드 
		int value1 = p1.hashCode();
		System.out.println(value1);
		//p2참조변수가 참조하는 객체의 해시코드 
		int value2 = p2.hashCode();
		System.out.println(value2);
		//p3참조변수가 참조하는 객체의 해시코드 
		int value3 = p3.hashCode();
		System.out.println(value3);
	}
}
