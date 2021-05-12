package review0412;

public class Product {

	//private name, size, price 생성
	private String name;
	private String size;
	private int price;
	
	public Product() {
		super();
	}

	public Product(String name, String size, int price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	public int getPrice() {
		return price;
	}
	
	
	
}
