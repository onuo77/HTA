package review0329;

public class ProductApp {
	
	public static void main(String[] args) {
		//상품정보를 표현하는 객체를 생성하고, 객체의 멤버변수에 적절한 상품정보를 저장한다.
		Product pd = new Product();
		
		pd.no = 1;
		pd.category = "IT/컴퓨터";
		pd.name = "남궁 성";
		pd.maker = "도우 출판";
		pd.price = 25000;
		pd.stock = 1000;
		pd.isSoldOut = false;
		
		//위에서 생성한 상품객체에 저장된 상품정보를 화면에 출력하는 메소드를 실행한다.
		pd.printInfo();
	}
}
