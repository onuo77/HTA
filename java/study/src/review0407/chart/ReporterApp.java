package review0407.chart;

public class ReporterApp {

	public static void main(String[] args) {
		//BasicChart 객체 생성
		//BasicChart 참조변수 setTitle 설정
		BasicChart bc = new BasicChart();
		bc.setTitle("기본차트");

		//LineChart 객체 생성
		//LineChart 참조변수 setTitle 설정
		LineChart lc = new LineChart();
		lc.setTitle("라인차트");
		
		//Reporter 객체 생성
		//Reporter 참조변수 setChart 설정
		Reporter rp = new Reporter();
		rp.setChart(lc); //bc, lc값에 따라 결과값이 달라진다.
		
		//Reporter 참조변수 createReport() 메소드 실행
		rp.createReport();
	}
}
