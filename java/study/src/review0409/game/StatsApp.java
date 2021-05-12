package review0409.game;

public class StatsApp {
	//main
	public static void main(String[] args) {
		//StudentRepo 객체생성
		StudentRepo sr = new StudentRepo();
		//GameRepo 객체생성
		GameRepo gr = new GameRepo();

		//학생 성적에 대한 총점, 평균을 제공하는 Stats 구현객체 얻기
		Stats stats1 = sr.getStats();
		System.out.println("StudentRepo 출력");
		System.out.println("총점 : " + stats1.total());
		System.out.println("평균 : " + stats1.average());
		
		//게임 기록에 대한 승리횟수, 승률을 제공하는 Stats 구현객체 얻기
		Stats stats2 = gr.getStats();
		System.out.println("GameRepo 출력");
		System.out.println("총점 : " + stats2.total());
		System.out.println("평균 : " + stats2.average());		
	}

}
