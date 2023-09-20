<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
	private String str = "선언문"; // 선언부 안에서 선언되었으므로 jsp 페이지 전체에서 인식 됨
	private String getStr() { // 메소드 정의
		str += "테스트입니다";
		return str;
	}
%>

<h1><%=getStr() %></h1> <%-- 메소드 선언 --%>