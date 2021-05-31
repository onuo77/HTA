<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// registerform.jsp에서 register.jsp로 제출한 폼 입력값을 조회한다.
	
	
	////////////// 입력값 누락 체크
	// 요청파라미터값으로 전달받은 사용자정보에 누락된 정보가 있으면 입력폼을 다시 요청하게 한다.
	
	
	// SAMPLE_USERS 테이블에 대한 CRUD 기능이 구현된 UserDao객체를 획득한다.
	
	////////////// 아이디 중복 체크 
	// 요청파라미터값으로 전달받은 id가 이미 사용중인 아이디라면 입력폼을 다시 요청하게 한다.
	
	// 비밀번호를 암호화하기
	
	
	// User객체를 생성해서 사용자정보를 저장한다.
	
	
	// 사용자 정보를 데이터베이스에 저장합니다.
	
	
	// 브라우저에게 재요청 URL을 응답으로 보낸다.

%>