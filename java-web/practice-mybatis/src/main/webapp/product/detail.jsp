<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<title>상품몰</title>
 	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<%

	// list.jsp에서 "detail.jsp?no=상품번호&page=페이지번호"의 형식으로 요청할 때 전달된 요청파라미터값 조회하기
	
	
	// SAMPLE_PRODUCTS테이블에 대한 CRUD기능이 구현된 ProductDao객체 획득하기

	// ProductDao객체의 getProductByNo(상품번호)를 실행해서 상품정보를 조회한다.

%>
	<header>
		
	</header>
	<main>
		<div class="row mb-3"> <!-- mb-3은 아래쪽 여백을 3만큼 설정한다. -->
			<div class="col-12">
				<h3 class="border p-3 bg-light">상품 상세정보</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-12">
				<table class="table table-bordered">
					<colgroup>
						<col width="15%">
						<col width="35%">
						<col width="15%">
						<col width="35%">
					</colgroup>
					<tr>
						<th class="bg-light">상품번호</th><td> </td>
						<th class="bg-light">등록일</th><td></td>
					</tr>
					<tr>
						<th class="bg-light">제품명</th><td></td>
						<th class="bg-light">카테고리</th><td></td>
					</tr>
					<tr>
						<th class="bg-light">할인 가격</th><td><strong class="text-danger"></strong></td>
						<th class="bg-light">가격</th><td></td>
					</tr>
					<tr>
						<th class="bg-light">재고수량</th><td></td>
						<th class="bg-light">품절여부</th><td><strong class="text-primary"></strong></td>
					</tr>
				</table>
			</div>
		</div>
		<div>
			<a href="modifyform.jsp?no=" class="btn btn-warning">수정</a>
			<a href="remove.jsp?no=" class="btn btn-danger">삭제</a>
			<a href="list.jsp?page=" class="btn btn-primary float-right">목록</a>
		</div>
	</main>
</div>
</body>
</html>