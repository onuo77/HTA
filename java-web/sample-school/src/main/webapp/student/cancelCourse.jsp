<%@page import="com.sample.school.vo.Course"%>
<%@page import="com.sample.school.dao.CourseDao"%>
<%@page import="com.sample.school.vo.Registration"%>
<%@page import="com.sample.school.dto.CourseRegisteredStudentDto"%>
<%@page import="com.sample.school.dao.RegistrationDao"%>
<%@page import="com.sample.school.vo.LoginUser"%>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
	/*
		요청파라미터로 조회된 과정에 대한 수강신청을 철회한다.
		
		1. 세션에서 로그인된 사용자 정보를 조회한다.
		2. 로그인된 사용자가 존재하지 않으면 로그인페이지로 보낸다.
		2. 요청파라미터값을 조회한다.
		3. 로그인된 아이디를 조회한다.
		4. 과정번호로 과정등록정보를 조회한다.
		5. 과정등록정보의 status를 취소로 변경한다.
		6. RegistrationDao의 updateRegistration(과정등록정보)를 실행해서 데이터베이스에 반영한다.
		7. myList.jsp를 재요청하는 URL을 응답으로 보낸다.
	*/
	
	LoginUser loginedUser = (LoginUser) session.getAttribute("LOGINED_USER");
	if(loginedUser == null){
		response.sendRedirect("/sample-school/loginForm.jsp");
		return;		
	}
	
	int no = Integer.parseInt(request.getParameter("no"));
	String id = loginedUser.getId();
	
	RegistrationDao regiDao = RegistrationDao.getInstance();
	CourseRegisteredStudentDto courses = regiDao.getRegisteredStudentsByCourseNo(no);
	courses.setCourseStatus("취소");
	
	regiDao.updateRegistration(courses);
	
	CourseDao courseDao = CourseDao.getInstance();
	Course course = courseDao.getCourseByNo(no);
	
	course.setRegisteredCount(course.getRegisteredCount()-1);
	courseDao.updateCourse(course);
	
	response.sendRedirect("/sample-school/student/myList.jsp");
%>