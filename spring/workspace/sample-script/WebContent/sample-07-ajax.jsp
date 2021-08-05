<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1>ajax 연습</h1>

<div>
	<button id="btn-1">버튼1</button>
	<button id="btn-2">버튼2</button>
	<button id="btn-3">버튼3</button>
</div>

<div id="box">
	<p id="box-name"></p>
	<p id="box-maker"></p>
	<p id="box-category"></p>
	<p id="box-price"></p>
	<p id="box-discountPrice"></p>
</div>

<script type="text/javascript">
//jQuery Ajax
	$('#btn-1').click(function(){
		//$.get(url, param, function(data){}, dataType)
		$.get("/spring-mvc/product/detail/json",{no:31}, function(x){
			//x -> {no:31, name:"아이폰13", maker:"애플", price:, discountPrice:}
			$("#box-name").text(x.name);
			$("#box-maker").text(x.maker);
			$("#box-category").text(x.category);
			$("#box-price").text(x.price);
			$("#box-discountPrice").text(x.discountPrice);
		},"json");
	})
	$('#btn-2').click(function(){
		//$.getJSON(url, param, function(data){})
		$.getJSON("/spring-mvc/product/detail/json", {no:32}, function(y){
			$("#box-name").text(y.name);
			$("#box-maker").text(y.maker);
			$("#box-category").text(y.category);
			$("#box-price").text(y.price);
			$("#box-discountPrice").text(y.discountPrice);
		});
	})
	$('#btn-3').click(function(){
		//$.ajax(옵션객체);
		$.ajax({
			type:"GET",
			url:"/spring-mvc/product/detail/json",
			data:{no:33},
			dataType:'json',
			success:function(product){
				$("#box-name").text(product.name);
				$("#box-maker").text(product.maker);
				$("#box-category").text(product.category);
				$("#box-price").text(product.price);
				$("#box-discountPrice").text(product.discountPrice);
			}
		});
	})
</script>
</body>
</html>