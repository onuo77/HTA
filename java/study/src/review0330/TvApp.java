package review0330;

public class TvApp {
	
	public static void main(String[] args) {
		//Tv 객체 생성하기
		Tv tv = new Tv();
		
		//Tv객체의 전원 켜기
		tv.on();
		
		//Tv객체의 현재 채널번호 조회하기
		tv.channelInfo();
		
		//Tv객체의 채널을 하나 증가시키기
		tv.channelUp();
		tv.channelInfo();
		
		//Tv객체의 채널을 24번으로 변경하기
		tv.changeChannel(24);
		tv.channelInfo();
	}
}
