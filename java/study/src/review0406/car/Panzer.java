package review0406.car;

public class Panzer extends PoliceCar{

	private String weapon;
	
	
	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}


	public void fireWeapon() {
		System.out.println("Fire a weapon");
	}
}
