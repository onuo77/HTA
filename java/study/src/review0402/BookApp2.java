package review0402;

public class BookApp2 {
	
	public static void main(String[] args) {
		//Book book1 객체 생성
		Book book1 = new Book();
		
		//Event event1 객체 생성 (동영상강의 특가)
		Event event1 = new Event("동영상강의 특가", "교재를 구매하시는 분에게는 동영상 강의를 제공합니다.", "4월 1일", "4월 30일", false);
		
		//Event event2 객체 생성 (할인 이벤트)
		Event event2 = new Event("할인 이벤트", "30% 할인", "5월 1일", "5월 31일", true);
		
		//Gift gift1 객체 생성
		Gift gift1 = new Gift("책받침", 500);
		
		// Book객체와 Event객체, Book객체와 Gift객체 연결짓기
		// book1이 참조하는 Book 객체의 event 멤버변수에 event1이 참조하는 Event객체의 주소값을 전달한다.
		book1.setEvent(event1);
		// book1이 참조하는 Book 객체의 gift 멤버변수에 gift1이 참조하는 Gift객체의 주소값을 전달한다.
		book1.setGift(gift1);		
		
		// book1이 참조하는 Book객체에 연결된 Event객체의 주소값 조회하기
		Event e = book1.getEvent();
		System.out.println(e);
		
		// event1, e, book1.getEvent() 주소값이 다 같은지 확인하기
		System.out.println(event1);
		System.out.println(e);
		System.out.println(book1.getEvent());
		
		// book1이 참조하는 Book객체에 연결된 Event객체의 정보를 출력하기 (getDescription)
		System.out.println(e.getDescription());
		System.out.println(book1.getEvent().getDescription());
		
		// book1이 참조하는 Book이 할인이벤트 진행중인지 확인해보기
		if(book1.getEvent().getTitle().contains("동영상")) {
			System.out.println("현재 할인 이벤트를 진행중입니다.");
		}else {
			System.out.println("현재 할인 이벤트가 없습니다.");
		}
		
	}

}
