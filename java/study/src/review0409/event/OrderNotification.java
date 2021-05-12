package review0409.event;

public class OrderNotification {

	private Mail mail;
	private Messenger messenger;
	
	public void setMail(Mail mail) {
		this.mail = mail;
	}
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}
	
	void noticeOrderInfo(String from, String title, String content) {
		mail.sendMail(from, from, title, content);
		messenger.send(title, from, content);
	}
}
