package review0406.car;

public class ClassCastingApp2 {

	public static void main(String[] args) {

		//Car타입의 참조변수 car1로 Car객체 생성
		Car car1 = new Car();
		//Car타입의 참조변수 car2로 PoliceCar 객체 생성
		Car car2 = new PoliceCar();
		//Car타입의 참조변수 car3로 Panzer객체 생성
		Car car3 = new Panzer();

		//### Car타입의 참조변수로 Car객체 참조하기
		car1.drive();
		car1.stop();
		
		//### Car타입의 참조변수로 PoliceCar객체 참조하기
		car2.drive();
		car2.stop();
		((PoliceCar) car2).patrol();
		
		//### Car타입의 참조변수로 Panzer객체 참조하기
		car3.drive();
		car3.stop();
		((PoliceCar) car3).patrol();
		((Panzer) car3).fireWeapon();
	}

}
