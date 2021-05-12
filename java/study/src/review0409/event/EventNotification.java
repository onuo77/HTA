package review0409.event;

public class EventNotification {

	private Mail mail;
	private Messenger messenger;
	private SNS sns;
	
	public void setMail(Mail mail) {
		this.mail = mail;
	}
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}
	public void setSns(SNS sns) {
		this.sns = sns;
	}
	
	void notice(String from, String to, String title, String content) {
		//메일, 메신저, SNS에 이벤트 내용 발송 및 포스팅하기
		mail.sendMail(from, to, title, content);
		messenger.send(to, from, content);
		sns.post(from, title, content);
	}
}
