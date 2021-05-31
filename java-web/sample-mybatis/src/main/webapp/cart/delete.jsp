<%@page import="jakarta.websocket.SendResult"%>
<%@page import="com.sample.vo.CartItem"%>
<%@page import="com.sample.dao.CartItemDao"%>
<%@page import="com.sample.util.CommonUtils"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.sample.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*
	장바구니 아이템 삭제하기
	- 장바구니 목록에서 삭제버튼을 클릭하면 해당 아이템이 삭제된다.
		list.jsp에서 delete.jsp로 아이템 번호를 전달
		링크를 delete.jsp?no=12
	
	- 로그인 되지 않은 사용자는 삭제를 실행할 수 없다.
		delete.jsp에서 세션에서 사용자정보를 조회하고,
		사용자정보가 존재하지 않으면 로그인폼을 재요청하게 한다.
	
	- 당사자의 장바구니에 저장된 아이템만 삭제할 수 있다.
		전달받은 아이템번호로 아이템정보를 조회한다.
		아이템의 사용자아이디와 로그인한 사람의 사용자아이디가 다르면
		삭제작업을 수행하지 않고, 리스트를 재요청하게 한다.
		같은 경우에는 삭제 작업을 수행한다.
	
	- 삭제가 완료되면 장바구니 목록이 다시 나와야 한다.
	*/

	//로그인 여부 체크하기
	User sessionSavedUser = (User) session.getAttribute("LOGINED_USER_INFO");
	if(sessionSavedUser == null){
		String encodedText = URLEncoder.encode("장바구니 아이템삭제", "utf-8");
		response.sendRedirect("../user/loginform.jsp?fail=deny&job=" + encodedText);
		return;		
	}
	
	//요청파라미터에서 아이템번호를 조회한다.
	int itemNo = CommonUtils.stringToInt(request.getParameter("no"));
	
	//SAMPLE_CART_ITEMS 테이블에 대한 CRUD기능이 구현된 CartItemDao 객체를 획득한다.
	CartItemDao cartItemDao = CartItemDao.getInstance();
	//아이템 번호에 해당하는 아이템정보를 조회하기
	CartItem cartItem = cartItemDao.getCartItemByNo(itemNo);
	
	//아이템정보가 조회되지 않으면
	if(cartItem == null){
		response.sendRedirect("list.jsp?fail=invalid");
		return;
	}
	
	// 아이템을 등록한 사람의 아이디와 로그인한 사용자의 아이디가 동일하지 않으면
	if(!cartItem.getUserId().equals(sessionSavedUser.getId())){
		response.sendRedirect("list.jsp?fail=deny");
		return;
	}
	
	//아이템번호에 해당하는 아이템정보를 삭제한다. 
	cartItemDao.deleteCartItem(itemNo);
	
	//브라우저에게 목록페이지를 재요청하는 URL을 보낸다.
	response.sendRedirect("list.jsp");

%>