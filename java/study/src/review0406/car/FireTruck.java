package review0406.car;

public class FireTruck extends Car{

	private int water;

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}
	
	public void suppressFire() {
		System.out.println("Fire suppression");
	}

}
