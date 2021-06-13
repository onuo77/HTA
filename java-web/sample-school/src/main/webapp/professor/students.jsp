<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.sample.school.dto.CourseRegisteredStudentDto"%>
<%@page import="java.util.List"%>
<%@page import="com.sample.school.dao.RegistrationDao"%>
<%@page import="com.sample.school.vo.Course"%>
<%@page import="com.sample.school.dao.CourseDao"%>
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
		과정번호에 해당하는 상세정보와 해당과정에 등록한 학생목록을 출력한다.
	*/
%>
<div class="container">
	<% String navItem = "pfCourses"; %>
	<%@ include file="../common/header.jsp" %>
	<%
		if(loginedUser == null) {
			response.sendRedirect("/sample-school/loginForm.jsp");
			return;
		}
		
		int courseNo = Integer.parseInt(request.getParameter("courseNo"));
		CourseDao courseDao = CourseDao.getInstance();
		Course course = courseDao.getCourseByNo(courseNo);
	%>
	<main>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<h4>수강생 리스트</h4>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<table class="table table-bordered">
						<colgroup>
							<col width="12%">
							<col width="38%">
							<col width="12%">
							<col width="38%">
						</colgroup>
						<tr>
							<th>과정번호</th>
							<td><%=course.getNo() %></td>
							<th>타입</th>
							<td><%=course.getType() %></td>
						</tr>
						<tr>
							<th>과정명</th>
							<td><%=course.getName() %></td>
							<th>신청/정원</th>
							<td><%=course.getRegisteredCount() %>/<%=course.getQuota() %></td>
						</tr>
						<tr>
							<th>강의장</th>
							<td><%=course.getRoom() %></td>
							<th>건물명</th>
							<td><%=course.getBuilding() %></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<table class="table">
						<colgroup>
							<col width="10%">
							<col width="10%">
							<col width="10%">
							<col width="20%">
							<col width="10%">
							<col width="10%">
							<col width="10%">
							<col width="10%">
							<col width="10%">
						</colgroup>
						<thead>
							<tr>
								<th>학생번호</th>
								<th>학생명</th>
								<th>학년</th>
								<th>학과명</th>
								<th>등록상태</th>
								<th>수료여부</th>
								<th>점수</th>
								<th>성적</th>
								<th>신청일</th>
							</tr>
						</thead>
						<tbody>
						<%
							RegistrationDao regiDao = RegistrationDao.getInstance();
							List<CourseRegisteredStudentDto> students = regiDao.getRegisteredStudentsByCourseNo(courseNo);
							SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");
							if(students.isEmpty()){
						%>
							<tr class="text-center">
								<td colspan="9">수강생이 존재하지 않습니다.</td>
							</tr>
						<%		
							}else{
								for(CourseRegisteredStudentDto student : students){
						%> 
							<tr>
								<td><%=student.getId() %></td>
								<td><%=student.getName() %></td>
								<td><%=student.getGrade() %></td>
								<td><%=student.getDepartmentName() %></td>
								<td><%=student.getCourseStatus() %></td>
								<td><%=student.getCoursePassed() %></td>
								<td><%=student.getCourseScore() %></td>
								<td><%=student.getCourseGrade()==null?"":"" %></td>
								<td><%=dateformat.format(student.getCreatedDate())%></td>
							</tr>
						<%
								}
							}
						%>
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