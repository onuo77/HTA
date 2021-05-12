package review0409.event;

public class Instagram implements SNS{

	@Override
	public void post(String title, String writer, String content) {
		System.out.println("### 인스타그램");
		System.out.println("--------------------------");
		System.out.println("제목 : " + title);
		System.out.println("글쓴이 : " + writer);
		System.out.println("내용 : " + content);
	}
}
