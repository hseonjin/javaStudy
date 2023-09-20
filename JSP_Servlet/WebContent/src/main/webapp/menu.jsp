<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
String id = (String)session.getAttribute("id"); // 세션 객체 사용, 로그인에 성공하여 세션에 id값이 저장되어 있으면 id, 아니면 null 반환
%>
</head>
<body>
    <% // scriptlet 부분 
    if(id==null) {
    %>
        <a href="login.jsp">로그인</a>
    <% 
    } else {
    %>
        <%=id%> 님 환영합니다
    <% } %>
</body>
</html>