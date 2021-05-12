package review0329;

public class Book{
	
	//필드 정의하기(제목, 저자, 출판사, 가격)
	String title;
	String author;
	String publisher;
	int price;
	
	//메소드 정의하기
	void bookInfo() {
		System.out.println("### 책정보 ###");
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price);
		System.out.println();
	}
}
