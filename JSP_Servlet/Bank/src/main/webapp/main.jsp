<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KOSTA_BANK</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
</head>
<body>
<% String ipage = (String)request.getAttribute("page"); %>
<% pageContext.include("header.jsp"); %>

<div>
<%
	if(ipage!=null) { // page라는 이름의 속성값을 ipage에 대입하여 page가 존재하는 경우
		pageContext.include(ipage + ".jsp"); // 해당 페이지를 포함한다
	}
%>
<h3 style="text-align:center; margin-top: 200px">KOSTA BANK MAIN</h3>

</div>

</body>
</html>