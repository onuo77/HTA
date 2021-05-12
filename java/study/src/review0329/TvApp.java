package review0329;

public class TvApp {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		tv.color = "black";
		tv.power = true;
		tv.channel = 7;
		
		tv.tvInfo();
		tv.tvChannelUp();
		tv.tvChannelDown();
		tv.tvChannelUp();
		tv.tvChannelUp();
		tv.TvTurnOff();
	}
}
