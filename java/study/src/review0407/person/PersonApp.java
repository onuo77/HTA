package review0407.person;

public class PersonApp {

	public static void main(String[] args) {
		//Student 객체 생성 후 객체값 입력
		Student s = new Student("홍길동", "hong@gmail.com", "010-2222-2222", 3, "컴퓨터공학과");
		//출력
		s.displayInfo();
		
		//Professor 객체 생성 후 객체값 입력
		Professor p = new Professor("이순신", "lee@gmail.com", "010-2332-2323", "컴퓨터공학과", "이교수");
		//출력
		p.displayInfo();
	}

}
