package review0402;

public class Gift {
	
	private String name;
	private int price;

	// 기본생성자 정의
	public Gift() {	}
	
	// 모든 멤버변수를 초기화하는 생성자 정의 
	public Gift(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// getter/setter 메소드 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

	
}
