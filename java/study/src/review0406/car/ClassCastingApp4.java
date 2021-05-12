package review0406.car;

public class ClassCastingApp4 {

	public static void main(String[] args) {

		//Car타입의 참조변수 car1로 Car객체 생성
		Car car1 = new Car();
		//FireTruck타입의 참조변수 car2로 FireTruck객체 생성
		FireTruck car2 = new FireTruck();
		//PoliceCar타입의 참조변수 car3로 PoliceCar객체 생성
		PoliceCar car3 = new PoliceCar();
		//Panzer타입의 참조변수 car4로 Panzer객체 생성
		Panzer car4 = new Panzer();
		
		//### drive/stop 기능 테스트 하기
		testDriveAndStop(car1);
		testDriveAndStop(car2);
		testDriveAndStop(car3);
		testDriveAndStop(car4);
		//### 순찰기능 테스트 하기
		testPatrol(car3);
		testPatrol(car4);
		//### 무기발사 기능 테스트 하기
		testFireWeapon(car4);
	}

	//testDriveAndStop 메소드(매개변수 Car car)
	public static void testDriveAndStop(Car car) {
		car.drive();
		car.stop();
	}
	//testPatrol(PoliceCar car)
	public static void testPatrol(PoliceCar car) {
		car.patrol();
	}
	//testFireWeapon(Panzer car)
	public static void testFireWeapon(Panzer car) {
		car.fireWeapon();
	}
}
