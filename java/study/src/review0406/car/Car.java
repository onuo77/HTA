package review0406.car;

public class Car {
	private String color;
	//getter,setter 생성

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//drive 메소드 (Driving)
	public void drive() {
		System.out.println("Driving");
	}
	//stop 메소드(Stop!)
	public void stop() {
		System.out.println("stop");
	}
}
