package service;

import java.util.ArrayList;
import java.util.List;

import exception.UserException;
import repository.BookRepository;
import repository.OrderRepository;
import repository.UserRepository;
import vo.Book;
import vo.Order;
import vo.User;

public class BookStoreService {

	private BookRepository bookRepository = new BookRepository();
	private UserRepository userRepository = new UserRepository();
	private OrderRepository orderRepository = new OrderRepository();
	
	//로그인 인증을 마친 사용자정보가 저장된다.
	private User loginedUser = null;
	
	/**
	 * 모든 책정보를 반환한다.
	 * 모든 책정보를 조회하는 기능
	 * @return 도서 목록
	 */
	public List<Book> getAllBookList() {
		return bookRepository.getAllBooks();
	}
	
	/**
	 * 지정된 카테고리에 해당하는 책 정보들을 반환한다.
	 * 지정된 카테고리에 해당하는 책 정보들을 조회하는 기능
	 * @param category 조회할 도서 카테고리
	 * @return 도서 목록
	 */
	public List<Book> searchBooksByCategory(String category) {
		return null;
	}
	
	/**
	 * 지정된 책 제목을 포함하고 잇는 책 정보들을 반환한다.
	 * 지정된 책 제목을 포함하고 있는 책 정보들을 조회하는 기능
	 * @param title 조회할 도서 제목
	 * @return 도서 목록
	 */
	public List<Book> searchBooksByTitle(String title) {
		return null;
	}
	
	/**
	 * 지정된 가격범위에 속하는 책 정보들을 반환한다.
	 * 지
	 * @param minPrice 최소 가격
	 * @param maxPrice 최대 가격
	 * @return 도서 목록
	 */
	public List<Book> searchBooksByPrice(int minPrice, int maxPrice) {
		return null;
	}
	
	/**
	 * 지정된 책번호에 해당하는 책정보를 반환한다.
	 * @param no 조회할 책 번호
	 * @return 도서
	 */
	public Book findBook(int no) {
		return null;
	}
	
	/**
	 * 지정된 책번호의 재고를 변경한다.
	 * @param no 책번호
	 * @param stock 변경된 재고량
	 */
	public void updateBookStock(int no, int stock) {
		
	}
	
	/**
	 * 새 사용자정보를 등록하는 기능
	 * @param user 새 사용자
	 */
	public void addNewUser(User user) {
		
	}
	
	/**
	 * 지정된 아이디와 비밀번호로 사용자를 인증하는 기능
	 * @param id 아이디
	 * @param password 비밀번호
	 */
	public void login(String id, String password){
//		전달받은 아이디에 해당하는 사용자정보를 UserRepository객체의 getUserById(아이디)메소드를 이용해서 획득하기
//        사용자정보가 존재하지 않으면 UserException 발생시키기 - 아이디 혹은 비밀번호가 일치하지 않습니다.
//        비밀번호가 일치하지 않으면 UserException 발생시키기 - 아이디 혹은 비밀번호가 일치하지 않습니다.
//        획득한 사용자정보를 BookStoreService의 loginedUser에 저장한다.

		User savedLogin = userRepository.getUserById(id);
		if(savedLogin == null) {
			throw new UserException("아이디 혹은 비밀번호가 일치하지 않습니다.");
		}
		if(!savedLogin.getPassword().equals(password)) {
			throw new UserException("아이디 혹은 비밀번호가 일치하지 않습니다.");
		}
		System.out.println("[안내] 로그인 되었습니다.");
		loginedUser = savedLogin;
	}
	
	/**
	 * 로그인된 사용자 정보를 초기화하는 기능
	 */
	public void logout() {
		
	}
	
	/**
	 * 로그인여부를 반환하는 기능
	 * @return 로그인된 사용자정보가 존재하면 true를 반환한다.
	 */
	public boolean isLogined() {
		boolean isExist = false;
		if(loginedUser != null) {
			isExist = true;
		}
		return isExist;
	}
	
	/**
	 * 지정된 책번호의 책을 수량만큼 주문하는 기능
	 * @param bookNo 책번호
	 * @param amount 주문수량
	 */
	public void orderBook(int bookNo, int amount) {
		
	}
	
	/**
	 * 로그인한 사용자의 주문내역을 조회하는 기능
	 * @return 주문 목록
	 */
	public List<Order> getMyOrderList() {
		return null;
	}
	
	/**
	 * 로그인한 사용자의 상세정보를 조회하는 기능
	 * @return
	 */
	public User getMyInfo() {
		return null;
	}
	
	/**
	 * 모든 정보를 저장하는 기능
	 */
	public void restore() {
		
	}
}

