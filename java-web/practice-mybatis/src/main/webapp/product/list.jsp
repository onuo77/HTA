<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>상품몰</title>
</head>
<body>
<div class="container">
	<%
		
	
		// 한 페이지당 표시할 행의 갯수
	
		// 요청 파라미터에서 페이지번호 조회하기
		
		// 조회구간 계산하기
		
		// Map객체를 생성해서 조회구간정보를 담기

		// SAMPLE_PRODUCTS 테이블에 대한 CRUD 기능이 구현된 ProductDao객체를 획득한다.

		// ProductDao객체의 getAllProducts()를 실행해서 전체 상품정보를 획득한다.
		//List<Product> products = productDao.getAllProducts();
		// ProductDao객체의 getProducts(조회조건)를 실행해서 조회조건에 해당하는 데이터를 조회한다.
		
		// ProductDao객체의 getRowsCount()를 실행해서 전체 상품정보갯수를 조회한다.

		// 전체 페이지 갯수 계산
	%>
	
	<div class="row mb-3">
		<div class="col-12">
			<h3 class="border p-3 bg-light">
				상품 목록
				<a href="form.jsp" class="btn btn-primary float-right">상품추가</a>
			</h3>
			<%-- <div>
				<dl>
					<dt>요청파라미터</dt><dd></dd>
					<dt>페이지번호</dt><dd></dd>
					<dt>조회시작번호</dt><dd></dd>
					<dt>조회종료번호</dt><dd></dd>
					<dt>전체 데이터 갯수</dt><dd></dd>
					<dt>전체 페이지 갯수</dt><dd></dd>
				</dl>
			</div> --%>
		</div>
	</div>
	<div class="row mb-3">
		<div class="col-12">
			<div class="card">
				<div class="card-body pb-0">
					<table class="table">
						<colgroup>
							<col width="10%" />
							<col width="*" />
							<col width="15%" />
							<col width="13%" />
							<col width="15%" />
							<col width="13%" />
						</colgroup>
						<thead>
							<tr>
								<th>순번</th>
								<th>이름</th>
								<th>제조회사</th>
								<th class="text-right">가격</th>
								<th class="text-right">할인가격</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
						
							<tr>
								<td colspan="5" class="text-center">상품이 존재하지 않습니다.</td>
							</tr>						

							<tr>
								<td></td>
								<td><a href="detail.jsp?no="></a></td>
								<td></td>
								<td class="text-right"><del></del> </td>
								<td class="text-right"><strong class="text-danger"></strong> </td>
								<td>
									<a href="../cart/add.jsp?no=" class="btn btn-outline-primary btn-sm">장바구니 담기</a>
								</td>
							</tr>

							</tbody>
					</table>
				</div>
				<div class="card-body">
					<nav>
  						<ul class="pagination justify-content-center">
    						<li class="page-item "><a class="page-link" href="list.jsp?page=">이전</a></li>

    						<li class="page-item "><a class="page-link" href="list.jsp?page="></a></li>
    							
    						<li class="page-item "><a class="page-link" href="list.jsp?page=">다음</a></li>
  						</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>