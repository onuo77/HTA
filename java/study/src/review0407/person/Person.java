package review0407.person;

public class Person {
	//private 멤버변수 name, email, tel 생성
	private String name;
	private String email;
	private String tel;
	
	//Person 기본생성자
	public Person() {	}

	//Person 기본생성자 매개변수 name
	public Person(String name) {
		super();
		this.name = name;
	}

	//Person 기본생성자 매개변수 name, email, tel
	public Person(String name, String email, String tel) {
		super();
		this.name = name;
		this.email = email;
		this.tel = tel;
	}

	//멤버변수 getter 생성
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getTel() {
		return tel;
	}
	
	//displayInfo() 메소드 생성 (이름,이메일,연락처 출력)
	public void displayInfo() {
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
		System.out.println("연락처 : " + tel);
	}
}
