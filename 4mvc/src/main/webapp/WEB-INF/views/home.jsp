<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<h3>Index : 현재 프로젝트의 요청 URL 테스트</h3>
<hr>
<a href="./">현재 프로젝트 경로(컨텍스트)의 url은 http://localhost:8085/app/</a> <br>
<h5>url과 view파일의 설정테스트</h5>
<a href="test">http://localhost:8085/app/test</a><br>
<a href="hello">http://localhost:8085/app/hello</a><br>
<a href="spring">http://localhost:8085/app/spring</a><br>
<h5>파라미터 테스트</h5>
<a href="search?name=모모&age=22">http://localhost:8085/app/search?name=홍길동&age=23</a><br>
<a href="search?name=모모">http://localhost:8085/app/search?name=홍길동</a><br>
<h5>모델객체를 이용한 파라미터 데이터(폼 양식의 데이터) 전달</h5>
클래스를 정의하고 모델객체로 사용
<a href="order">http://localhost:8085/app/order</a><br>
클래스 정의 없이 Map을 모델객체로 사용 
<a href="map?idx=23&cnt=44&title=momo&page=11">
http://localhost:8085/app/map?idx=23&cnt=44&title=momo&page=11</a><br>
<h5>Model 객체 테스트</h5>
<a href="model">http://localhost:8085/app/test/model</a> <br>
<a href="redirect">http://localhost:8085/app/test/redirect</a>
<h5>@ModelAttribute 테스트</h5>
<a href="modelAttr?idx=101">http://localhost:8085/app/modelAttr?idx=101</a> <br>
<a href="orderForm2">
http://localhost:8085/app/orderForm2</a>
</body>
</html>
