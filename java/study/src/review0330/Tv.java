package review0330;

public class Tv {
	
	// channel = 10, power 멤버변수 생성
	int channel = 5;
	boolean power;
	
	//tv를 켠다. 
	//power의 값을 true로 설정한다. 
	//변경작업-반환타입 : void
	void on() {
		power = true;
		System.out.println("현재전원상태 : " + power);
	}

	//tv를 끈다. 
	//power의 값을 false로 설정한다. 
	//변경작업-반환타입 : void
	void off() {
		power = false;
		System.out.println("현재전원상태 : " + power);
	}
	
	//채널숫자를 1 감소시킨다. 
	//변경작업-반환타입 : void
	void channelDown() {
		channel--;
	}
	
	//채널숫자를 1 증가시킨다. 
	//변경작업-반환타입 : void
	void channelUp() {
		channel++;
	}

	//**채널로 변경한다. 
	//변경작업-반환타입 : void
	//매개변수-채널번호
	void changeChannel(int chNo) {
		channel = chNo;
	}

	//현재 시청중인 채널번호를 조회한다. 
	//조회작업-반환타입 : 채널번호(int정수)
	//매개변수-필요없음
	int channelInfo() {
		System.out.println("현재채널 : " + channel);
		return channel;
	}
}
