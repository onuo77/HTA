package review0330;

public class ProductApp2 {
	
	public static void main(String[] args) {
		
		//상품정보를 3개 저장하는 배열객체를 생성하기
		Product[] pds = new Product[3];
		
		//상품정보를 담을 수 있는 Product객체 3개 생성하기
		Product p1 = new Product();
		p1.no = 100;
		p1.category = "노트북";
		p1.name = "LG그램";
		p1.maker = "LG";
		p1.price = 1500000;
		p1.stock = 10;
		p1.isSoldOut = true;
		
		Product p2 = new Product();
		p2.no = 200;
		p2.category = "스마트폰";
		p2.name = "갤럭시 노트";
		p2.maker = "삼성";
		p2.price = 1000000;
		p2.stock = 54;
		p2.isSoldOut = false;
		
		Product p3 = new Product();
		p3.no = 300;
		p3.category = "건강보조식품";
		p3.name = "Vitamin D3";
		p3.maker = "California Gold";
		p3.price = 10000;
		p3.stock = 235;
		p3.isSoldOut = true;
		
		//배열의 0번째 칸부터 2번째 칸에 생성된 Product객체를 저장하기
		pds[0] = p1;		
		pds[1] = p2;		
		pds[2] = p3;		

		//### products 배열에 저장된 상품중에서 재고수량이 25개 이상인 상품의 정보만 출력하기
		for(Product p : pds) {
			if(p.stock >= 25) {
				p.printInfo();
			}
		}		
		
		System.out.println("----------------------------");
		
		//### products 배열에 저장된 상품중에서 제품의 가격이 100만원 이상인 상품의 정보만 출력하기
		for(Product p : pds) {
			if(p.price >= 100000) {
				p.printInfo();
			}
		}
		
		System.out.println("----------------------------");
		
		//### products 배열에 저장된 상품중에서 애플에서 제조한 상품정보만 출력하기
		for(Product p : pds) {
			if("삼성".equals(p.maker)) {
				p.printInfo();
			}
		}
	}
}
