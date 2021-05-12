package review0409.event;

public class Line implements Messenger{

	@Override
	public void send(String to, String from, String text) {
		System.out.println("### 라인");
		System.out.println("--------------------------");
		System.out.println("보내는 사람 : " + from);
		System.out.println("받는 사람 : " + to);
		System.out.println("내용 : " + text);
	}
}
