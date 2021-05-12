package review0407.person;

public class Professor extends Person{
	
	// private 멤버변수 dept, position 생성
	private String dept;
	private String position;

	// 멤버변수 getter 생성
	public String getDept() {
		return dept;
	}
	public String getPosition() {
		return position;
	}

	// 기본생성자 생성
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	// 기본생성자 매개변수 name, mail, tel, dept, position 생성
	public Professor(String name, String email, String tel, String dept, String position) {
		super(name, email, tel);
		this.dept = dept;
		this.position = position;
	}
	
	// displayInfo() override (학과, 직위)
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("학과 : " + dept);
		System.out.println("학위 : " + position);
	}
}
