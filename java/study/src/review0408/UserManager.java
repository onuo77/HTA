package review0408;

public class UserManager {
	//사용자정보 등록/삭제/변경/조회 기능을 제공하는 객체에 대한 표준(인터페이스)사용
	
	//private UserRepository 참조할 참조변수
	private UserRepo ur;
	//기본생성자
	public UserManager() {	}
	//기본생성자 UserRepository 매개변수
	public UserManager(UserRepo ur) {
		super();
		this.ur = ur;
	}
	//setter 생성
	public void setUr(UserRepo ur) {
		this.ur = ur;
	}

	//새 사용자 등록하기 (매개변수 id, name)
	public void addNewUser(String id, String name) {
		User savedUser = ur.getUserById(id);
		if(savedUser != null) {
			System.out.println("동일한 아이디로 가입한 사용자가 이미 존재합니다.");
			return;
		}
		
		User user = new User(id,name);
		ur.saveUser(user);
		System.out.println("###신규 사용자 등록이 완료되었습니다.");
	}
	//사용자 정보 삭제하기 (매개변수 id)
	public void deleteUser(String id) {
		User savedUser = ur.getUserById(id);
		if(savedUser == null) {
			System.out.println("지정된 아이디의 사용자가 존재하지 않습니다.");
			return;
		}
		
		ur.deleteUser(id);
		System.out.println("###["+id+"]아이디 사용자가 삭제되었습니다.");
	}
	//사용자 정보 조회하기 (매개변수 id)
	public User getUserById(String id) {
		User savedUser = ur.getUserById(id);
		return savedUser;
	}
	//사용자 정보 변경하기 (매개변수 user)
	public void updateUser(User user) {
		User savedUser = ur.getUserById(user.getId());
		if(savedUser == null) {
			System.out.println("지정된 아이디의 사용자가 존재하지 않습니다.");
			return;
		}
		
		ur.updateUser(user);
		System.out.println("###["+user.getId()+"]아이디 사용자의 정보가 변경되었습니다. ");
	}
}
