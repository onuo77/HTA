package review0406.game;

public class GameApp {

	public static void main(String[] args) {

		//Marine 객체 생성
		Marine m = new Marine();
		//Firebat 객체 생성
		Firebat f = new Firebat();
		//Ghost 객체 생성
		Ghost g = new Ghost();
		//BattleCruiser 객체 생성
		BattleCruiser bc = new BattleCruiser();
		
		//### Marine객체의 이동하기/공격하기
		m.move();
		m.attack();
		//### Firebat객체의 이동하기/공격하기
		f.move();
		f.attack();
		//### Ghost객체의 이동하기/공격하기
		g.move();
		g.attack();
		//### BattleCruiser객체의 이동하기/공격하기
		bc.move();
		bc.attack();

	}

}
