<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세보기</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/freeboard.css">
</head>
<body>
<h3>우리동네 커뮤니티</h3>
<hr>
 <table style="width:80%;margin:auto;">
 	<tr><td width="20%" class="td1">제목</td>
 		<td width="40%" class="input1">${bean.subject}</td>
 		<td width="20%" class="td1">조회수</td>
 		<td class="input1">${bean.readCount}</td>
 	</tr>
 	<tr><td class="td1">작성자</td>
 		<td class="input1">${bean.name} 
 		<span style="font-size:70%;padding-left: 30px;">(${bean.ip})</span></td>
 		<td class="td1">작성날짜</td>
 		<td class="input1">
 		<%-- <fmt:parseDate pattern="yyyy-MM-dd'T'HH:mm" value="${bean.wdate }" var="wdate"/> --%>
 		<fmt:formatDate value="${bean.wdate }" pattern="yyyy-MM-dd"/>
 		</td>
 	</tr>
 	<tr><td class="td1">내용</td>
 		<td colspan="3" class="input1" style="text-align: left;">
 		<div  style="height: 300px;">
 		<pre>${bean.content }</pre>
 		</div>
 		</td>   
 		<!-- 엔터,탭,기호 등 텍스트 그대로 출력할 때 사용 -->
 	</tr>
 	<tr><td colspan="4">
 		<a class="button" href="">수정</a>
 		<a class="button" href="">삭제</a>
 		<a class="button" href="list?pageNo=${page }">목록</a>
 	</td>
 	</tr>
 	</table>
</body>
</html>