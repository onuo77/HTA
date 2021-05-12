package review0409.event;

public class NotificationApp {

	public static void main(String[] args) {
		
		EventNotification event = new EventNotification();
		OrderNotification order = new OrderNotification();
		
		GoogleMail gmail = new GoogleMail();
		KakaoTalk katalk = new KakaoTalk();
		Line line = new Line();
		Instagram insta = new Instagram();
		Facebook facebook = new Facebook();
		
		//EventNotification객체에 Mail, Messenger, SNS 구현객체의 주소값 전달하기
		event.setMail(gmail);
		event.setMessenger(line);
		event.setSns(insta);
		//OrderNotification객체에 Mail, Messenger 구현객체의 주소값 전달하기
		order.setMail(gmail);
		order.setMessenger(line);
		
		//이벤트 안내 보내기
		event.notice("xx홈쇼핑", "홍길동 고객님", "할인안내", "50% 할인 이벤트");
		//주문내역 보내기
		order.noticeOrderInfo("판매자", "구매알림", "xx상품이 구매되었습니다.");
	}
}
