package review0406.game;

public class Unit {
	
	private String name;
	private int life;
	
	//getter,setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	
	//공격기능(상대방의 생명력을 1감소시킨다.)
	public void attack() {
		System.out.println("상대방의 생명력을 1감소시킨다.");
	}
	//수비기능(상대방의 공격을 방어한다.)
	public void defence() {
		System.out.println("상대방의 공격을 방어한다.");
	}
	//이동기능(1칸 이동한다.)
	public void move() {
		System.out.println("1칸 이동한다.");
	}
}
