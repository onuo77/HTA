package review0408;


public class UserManagerApp {

	public static void main(String[] args) {

		//UserRepository의 구현객체 생성하기
		UserArrayRepository uar = new UserArrayRepository();

		/*1번째/2번째 방법 본인이 원하는대로 사용*/
		//UserManager객체 생성
		UserManager um = new UserManager();
		//setter 메소드를 이용해서 UserRepository구현객체를 UserManager의 repo변수에 전달하기
		um.setUr(uar);

		System.out.println("### 아이디로 사용자 조회하기");
		User user1 = uar.getUserById("le");
		if(user1 != null) {
			System.out.println(user1.getId() + ", " + user1.getName());
		} else {
			System.out.println("사용자가 존재하지 않습니다.");
		}

		System.out.println("------------------------------------------");

		System.out.println("### 신규 사용자 등록하기");
		um.addNewUser("park", "박혁거세");

		System.out.println("------------------------------------------");

		System.out.println("### 아이디로 사용자 조회하기");
		User user2 = um.getUserById("park");
		System.out.println(user2.getId() + ", " + user2.getName());

		System.out.println("------------------------------------------");

		System.out.println("### 신규 사용자 등록하기");
		um.addNewUser("park", "박혁거세");

		System.out.println("------------------------------------------");

		System.out.println("### 등록된 사용자 삭제하기");
		um.deleteUser("hong");
		um.deleteUser("hong");

		User user3 = um.getUserById("lee");
		System.out.println(user3.getId() + ", " + user3.getName());
		User user4 = um.getUserById("kim");
		System.out.println(user4.getId() + ", " + user4.getName());

	}
}
