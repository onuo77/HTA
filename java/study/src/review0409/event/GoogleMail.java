package review0409.event;

public class GoogleMail implements Mail{

	@Override
	public void sendMail(String from, String to, String title, String text) {
		System.out.println("### 구글메일");
		System.out.println("--------------------------");
		System.out.println("보내는 사람 : " + from);
		System.out.println("받는 사람 : " + to);
		System.out.println("제목 : " + title);
		System.out.println("내용 : " + text);
	}
}
