package review0329;

public class Tv {

	//필드 정의(색상 color / 전원상태 power (on/off) / 채널 channel)
	String color;
	boolean power;
	int channel;
	
	//Tv의 기능(메소드) 생성 (TV를 켜거나 끄는 기능 / TV의 채널을 높이는 기능 / TV의 채널을 낮추는 기능)
	void tvInfo() {
		System.out.println("### TV 정보 ###");
		System.out.println("Tv 색상 : " + color);
		System.out.println("Tv on/off : " + power);
		System.out.println("channel : " + channel);
		System.out.println();
	}  
	
	void tvChannelUp() {
		channel += 1;
		System.out.println("현재 TV 채널 : " + channel);
		System.out.println();
	}
	
	void tvChannelDown() {
		channel -= 1;
		System.out.println("현재 TV 채널 : " + channel);
		System.out.println();
	}
	
	void TvTurnOff() {
		power = !power;
		System.out.println("현재 전원 상태 : " + power);
	}
}
