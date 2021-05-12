package review0405.printer;

public class PrinterApp {

	public static void main(String[] args) {

		//### Printer객체 사용하기
		Printer p = new Printer();
		p.print();
		p.refill();
		System.out.println();
		
		//### ColorPrinter객체 사용하기
		ColorPrinter cp = new ColorPrinter();
		cp.print();
		cp.refill();
		System.out.println();
		
		LaserPrinter lp = new LaserPrinter();
		lp.print();
		lp.refill();
		System.out.println();
		
		//### LaserColorPrinter객체 사용하기
		LaserColorPrinter lcp = new LaserColorPrinter();
		lcp.print();
		lcp.refill();
		System.out.println();
	}

}
