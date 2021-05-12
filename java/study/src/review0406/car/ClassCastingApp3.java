package review0406.car;

public class ClassCastingApp3 {

	public static void main(String[] args) {
		//Car타입의 참조변수 carList로 배열 객체생성 (5)
		Car[] carList = new Car[5];
		
		carList[0] = new Panzer();
		carList[1] = new Car();
		carList[2] = new PoliceCar();
		carList[3] = new FireTruck();
		carList[4] = new Panzer();

		//향상된 for문을 사용해서 배열에 저장된 다양한 Car객체를 순서대로 조회해서
		// Car객체면 운전기능, 정지기능 실행해보기 (instanceof 사용)
		for (Car car : carList) {
			System.out.println(car);
			System.out.println(car instanceof Car);
			System.out.println(car instanceof FireTruck);
			System.out.println(car instanceof PoliceCar);
			System.out.println(car instanceof Panzer);
		}

		// PoliceCar객체면 운전기능, 정지기능, 순찰기능 실행해보기
		// FireTruck객체면 운전기능, 정지기능, 화재진압기능 실행해보기
		// Panzer객체면 운전기능, 정지기능, 순찰기능, 무기발사기능 실행해보기
		
		for (Car car : carList) {
			System.out.println();
			System.out.println("### car참조변수가 참조하는 객체 주요 기능 확인");
			car.drive();
			car.stop();
			
			if(car instanceof FireTruck) {
				FireTruck x = (FireTruck) car;
				x.suppressFire();
			}
			
			if(car instanceof PoliceCar) {
				PoliceCar x = (PoliceCar) car;
				x.patrol();
			}
			
			if(car instanceof Panzer) {
				Panzer x = (Panzer) car;
				x.fireWeapon();
			}
		}
	}
}
