<%@page import="java.util.List"%>
<%@page import="com.sample.school.dao.RegistrationDao"%>
<%@page import="com.sample.school.dto.CourseRegisteredStudentDto"%>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" >
	<title>학사관리 시스템</title>
</head>
<body>
<%
	/*
		로그인된 학생이 수강신청한 모든 과정을 조회해서 출력한다.
		
		1. 세션에서 로그인된 학생정보를 조회한다.
		2. 로그인된 학생정보가 존재하지 않으면 로그인 페이지로 보낸다.
		3. 로그인된 학생의 학생번호로 수강등록한 모든 과정을 조회해서 출력한다.
	*/
%>
<div class="container">
	<% String navItem = "myList";%>
	<%@ include file="../common/header.jsp" %>
	<%
		if(loginedUser == null){
			response.sendRedirect("/sample-school/loginForm.jsp");
			return;
		}
		RegistrationDao regiDao = RegistrationDao.getInstance();
		List<CourseRegisteredStudentDto> loginedUserCourses = regiDao.getRegisteredStudentsByStudentId(loginedUser.getId());	
	%>
	<main>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<h4>나의 수강내역</h4>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<table class="table">
						<colgroup>
							<col width="10%">
							<col width="*">
							<col width="10%">
							<col width="10%">
							<col width="15%">
							<col width="10%">
						</colgroup>
						<thead>
							<tr>
								<th>과정번호</th>
								<th>과정명</th>
								<th>과정타입</th>
								<th>년도/학기</th>
								<th>성적</th>
								<th>이수여부</th>
								<th>상태</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
						<%
							if(loginedUserCourses.isEmpty()){
						%>
							<tr class="text-center">
								<td colspan="8">신청한 수강내역이 존재하지 않습니다.</td>
							</tr>
						<%
							}else{
								for(CourseRegisteredStudentDto item : loginedUserCourses){
						%>
							<tr>
								<td><%=item.getCourseNo() %></td>
								<td><%=item.getName() %></td>
								<td><%=item.getType() %></td>
								<td><%=item.getYear() %>/<%=item.getTerm() %></td>
								<td><%=item.getCourseScore() %></td>
								<td><%=item.getCoursePassed() %></td>
								<td><span class="badge <%="신청".equals(item.getCourseStatus())?"bg-info":"bg-secondary"%>"><%=item.getCourseStatus() %></span></td>
								<td>
								<%
									if("신청".equals(item.getCourseStatus())){
								%>
									<a href="cancelCourse.jsp?no=<%=item.getCourseNo() %>" class="btn btn-warning btn-sm">수강철회</a>
								<%
									}	
								%>
								</td>
							</tr>
						<% }}%>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</main>
	<footer class="footer mt-auto py-3 bg-light">
  		<div class="container">
    		<span class="text-muted">중앙HTA 학원</span>
  		</div>
	</footer>
</div>    
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>