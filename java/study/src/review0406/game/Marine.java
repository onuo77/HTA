package review0406.game;

public class Marine extends Unit{
	//attack Override (원거리 적을 공격한다.)
	@Override
	public void attack() {
		System.out.println("원거리 적을 공격한다.");
	}
}
