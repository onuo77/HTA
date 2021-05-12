package review0413;

public class ObjectApp1 {

	public static void main(String[] args) {
		Person p1 = new Person(10, "홍길동", "hong@gmail.com");
		Person p2 = new Person(10, "홍길동", "hong@gmail.com");
		Person p3 = p1;
		Person p4 = p2;
				
		//boolean equals(Object obj) 메소드
		//p1이 참조하는 객체와 p2가 참조하는 객체가 같은 객체인가? 
		boolean value1 = p1.equals(p2);
		System.out.println(value1);
		//p2이 참조하는 객체와 p1가 참조하는 객체가 같은 객체인가? 
		boolean value2 = p2.equals(p1);
		System.out.println(value2);

		//p1이 참조하는 객체와 p3가 참조하는 객체가 같은 객체인가?
		boolean value3 = p1.equals(p3);
		System.out.println(value3);
		//p2이 참조하는 객체와 p4가 참조하는 객체가 같은 객체인가?
		boolean value4 = p2.equals(p4);
		System.out.println(value4);
	}
}
