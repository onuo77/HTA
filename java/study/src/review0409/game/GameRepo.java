package review0409.game;

public class GameRepo {
	//은닉화 Game배열 생성(5)
	private Game[] games = new Game[5];
	//기본 생성자 안에 배열 초기화
	public GameRepo() {
		games[0] = new Game("월요일게임",1);
		games[1] = new Game("화요일게임",0);
		games[2] = new Game("수요일게임",1);
		games[3] = new Game("목요일게임",0);
		games[4] = new Game("금요일게임",1);
	}

	Stats getStats() {
		return new GameStats();
	}
	//은닉화 내부클래스 GameStats impl Stats 생성
	private class GameStats implements Stats{
		@Override
		public int total() {
			int totalScore = 0;
			for (Game game : games) {
				totalScore += game.getWin();
			}
			return totalScore;
		}
		
		@Override
		public int average() {
			int average = total()*100/games.length;
			return average;
		}
	}
	
	//override total
	//override average

	
	//GameStats을 Stats으로 반환하는 getStats 메소드 생성
}
