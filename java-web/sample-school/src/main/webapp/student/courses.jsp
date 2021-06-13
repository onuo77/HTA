<%@page import="java.util.ArrayList"%>
<%@page import="com.sample.school.dao.RegistrationDao"%>
<%@page import="com.sample.school.dto.CourseRegisteredStudentDto"%>
<%@page import="com.sample.school.dao.CourseDao"%>
<%@page import="com.sample.school.dto.CourseDto"%>
<%@page import="com.sample.school.vo.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.sample.school.dao.DepartmentDao"%>
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
		학과별 개설과정리스트를 검색하기 위해서 학과정보를 조회해서 출력한다.
		
		1. 모든 학과정보를 조회한다.
		2. 조회된 학과정보로 화면상단 검색폼의 select박스에 option을 출력한다.
		
	
		로그인된 학생이 소속된 학과의 개설과정리스트를 출력한다.
		
		1. 세션에서 로그인된 사용자 정보를 조회한다.
		2. 로그인된 사용자 정보가 존재하지 않으면 로그인페이지로 이동시킨다.
		3. 요청파라미터에서 학과번호를 조회한다.
		4. 조회된 학과번호가 존재하면 해당 학과번호에 해당하는 개설과정목록을 조회한다.
		5. 조회된 학과번호가 존재하지 않으면 로그인된 사용자의 소속 학과번호를 조회한다.
			소속학과번호에 해당하는 개설과정정보를 조회한다.
		6. 조회된 개설과정을 아래의 테이블에 표시한다.
		
	*/
%>
<div class="container">
	<% String navItem = "sCourses"; %>
	<%@ include file="../common/header.jsp" %>
	<%
		//모든학과정보
		DepartmentDao departmentDao =DepartmentDao.getInstance();
		List<Department> department = departmentDao.getAllDepartments();
		
		//로그인되지 않은 사용자 로그인폼으로 이동
		if(loginedUser == null){
			response.sendRedirect("/sample-school/loginForm.jsp");
			return;
		} 
		
		String departmentNo = request.getParameter("departmentNo");
		CourseDao courseDao = CourseDao.getInstance();
	%>
	<main>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<h4>개설과정 현황</h4>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-1 bg-light">
					<form class="p-2" method="get" action="courses.jsp">
						<div class="row my-1">
    						<label for="department-no" class="col-2 col-form-label">학과를 선택하세요</label>
    						<div class="col-9">
      							<select class="form-control" name="departmentNo">
								<%
									for(Department dept : department){ 
										if(departmentNo == null){
								%>
											<option value="<%=dept.getNo()%>"> <%=dept.getName() %></option>
								<% 
										} else{
								%>
									<option value="<%=dept.getNo()%>" <%=dept.getNo()==Integer.parseInt(departmentNo)?"selected":""%>> <%=dept.getName() %></option>
								<%
										}
									}
								%>
								</select>
    						</div>
    						<div class="col-1">
	    						<button class="form-control btn btn-outline-primary">조회</button>
    						</div>
  						</div>
					</form>
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
							<col width="7%">
							<col width="10%">
							<col width="7%">
							<col width="12%">
							<col width="7%">
						</colgroup>
						<thead>
							<tr>
								<th>과정번호</th>
								<th>과정명</th>
								<th>과정타입</th>
								<th>신청/정원</th>								
								<th>강의장</th>
								<th>빌딩</th>
								<th>교수이름</th>
								<th>학과명</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
						<%
							if(departmentNo == null){
								int loginedUserDeptNo = loginedUser.getDepartmentNo();
								List<CourseDto> loginedUserDepts = courseDao.getCoursesByDepartmentNo(loginedUserDeptNo);
								for(CourseDto dept : loginedUserDepts){
						%>
							<tr>
								<td><%=dept.getNo() %></td>
								<td><%=dept.getName() %></td>
								<td><%=dept.getType() %></td>
								<td><%=dept.getRegisteredCount() %>/<%=dept.getQuota() %></td>
								<td><%=dept.getRoom() %></td>
								<td><%=dept.getBuilding() %></td>
								<td><%=dept.getProfessorName() %></td>
								<td><%=dept.getDepartmentName() %></td>
								<td><a href="requestCourse.jsp?courseNo=<%=dept.getNo() %>" class="btn btn-primary btn-sm">신청</a></td>
							</tr>
						<%
								}
							}else{
								List<CourseDto> courseDto = courseDao.getCoursesByDepartmentNo(Integer.parseInt(departmentNo)); 
								for(CourseDto dept : courseDto){
						%>
							<tr>
								<td><%=dept.getNo() %></td>
								<td><%=dept.getName() %></td>
								<td><%=dept.getType() %></td>
								<td><%=dept.getRegisteredCount() %>/<%=dept.getQuota() %></td>
								<td><%=dept.getRoom() %></td>
								<td><%=dept.getBuilding() %></td>
								<td><%=dept.getProfessorName() %></td>
								<td><%=dept.getDepartmentName() %></td>
								<td>
									<a href="requestCourse.jsp?courseNo=<%=dept.getNo() %>" class="btn btn-primary btn-sm">신청</a>
								</td>
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