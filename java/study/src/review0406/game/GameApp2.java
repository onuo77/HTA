package review0406.game;

public class GameApp2 {

	public static void main(String[] args) {

		//Unit배열 객체 생성(4)
		Unit[] units = new Unit[4];
		
		//units 배열 안에 Marine, Firebat,Ghost, BattleCruiser 객체 저장
		units[0] = new Marine();
		units[1] = new Firebat();
		units[2] = new Ghost();
		units[3] = new BattleCruiser();
		
		//향상된 for문으로 move(),attack()메소드 출력
		for (Unit unit : units) {
			unit.move();
			unit.attack();
		}
	}

}
