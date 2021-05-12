package review0406.car;

public class ClassCastingApp {

	public static void main(String[] args) {
		//Panzer 타입의 참조변수 car1로 Panzer객체 생성
		Panzer car1 = new Panzer();
		//PoliceCar 타입의 참조변수 car2로 Panzer객체 생성
		PoliceCar car2 = new Panzer();
		//Car 타입의 참조변수 car3로 Panzer객체
		Car car3 = new Panzer();

		//### Panzer 타입의 참조변수로 Panzer객체 참조하기
		car1.drive();
		car1.stop();
		car1.fireWeapon();
		
		//### PoliceCar 타입의 참조변수로 Panzer객체 참조하기
		car2.drive();
		car2.stop();
		car2.patrol();
		
		//### Car 타입의 참조변수로 Panzer객체 참조하기
		car3.drive();
		car3.stop();
	}
}
