package review0405.printer;

public class LaserPrinter extends Printer{

	@Override
	public void print() {
		System.out.println("레이저 흑백 출력");
	}
	
	@Override
	public void refill() {
		System.out.println("토너 교체");
	}
}
