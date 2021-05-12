package review0329;

public class BookApp {

	public static void main(String[] args) {
		
		//book1, book2, book3 객체 생성하기
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		//book1, book2, book3 객체의 속성에 값 저장하기
		book1.title = "자바의 정석";
		book1.author = "남궁 성";
		book1.publisher = "도우 출판";
		book1.price = 25000;
		
		book2.title = "타이탄의 지혜들";
		book2.author = "데이비드 M. 루벤스타인";
		book2.publisher = "토네이도";
		book2.price = 19800;
		
		//객체의 기능(Method) 사용하기
		book1.bookInfo();
		book2.bookInfo();
		book3.bookInfo();

	}


}
