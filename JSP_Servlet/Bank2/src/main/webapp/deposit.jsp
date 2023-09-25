<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
#label {
	text-align: center;
	padding-right: 10px;
}
p {
	text-align: center;
	margin: 20px 0 10px 0;
}
form {
    border: 1px solid gray;
    width: 300px;
    margin: 0 auto;
    padding: 20px;
}
</style>
<jsp:include page="header.jsp"/>

<div class="container">
	<h3>입금</h3>
	<form action="deposit" method="post">
		<table>
			<tr>
				<td id="label">계좌번호</td>
				<td><input type="text" name="id" id="id"></td>
			</tr>
			<tr>
				<td id="label">입금액</td>
				<td><input type="text" name="money" id="money"></td>
			</tr>
		</table>
		<p><input type="submit" value="입금"></p>
	</form>
</div>