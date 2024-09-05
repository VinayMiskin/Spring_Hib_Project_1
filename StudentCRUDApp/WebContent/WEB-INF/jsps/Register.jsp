<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="st" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> <st:message code="register.header1"/> </h1>
	
	<div>
		<sf:form action="${action}?id=${sbean.id}" modelAttribute="sbean">
			<table>
				<tr>
					<th><st:message code="register.name"/></th>
					<td><sf:input path="name"/></td>
					<td><sf:errors path="name"/> </td>
				</tr>
				<tr>
					<th><st:message code="register.email"/></th>
					<td><sf:input path="email"/></td>
					<td><sf:errors path="email"/> </td>
				</tr>
				<tr>
					<th><st:message code="register.dob"/></th>
					<td><sf:input path="dob"/></td>
					<td><sf:errors path="dob"/> </td>
				</tr>
				<tr>
					<th><st:message code="register.gender"/></th>
					<td><sf:select path="gender">
						<sf:option value="MALE">MALE</sf:option>
						<sf:option value="FEMALE">FEMALE</sf:option>
					</sf:select> </td>
					<td><sf:errors path="gender"/> </td>
				</tr>
				<tr>
					<th><st:message code="register.address"/></th>
				</tr>
				<tr>
					<th><st:message code="register.address.street"/></th>
					<td><sf:input path="address.street"/></td>
					<td><sf:errors path="address.street"/> </td>
				</tr>
				<tr>
					<th><st:message code="register.address.city"/></th>
					<td><sf:input path="address.city"/></td>
					<td><sf:errors path="address.city"/> </td>
				</tr>
				<tr>
					<th><st:message code="register.address.pin"/></th>
					<td><sf:input path="address.pinCode"/></td>
					<td><sf:errors path="address.pinCode"/> </td>
				</tr>
				<tr>
					<th><st:message code="register.password1"/></th>
					<td><sf:password path="password"/></td>
					<td><sf:errors path="password"/> </td>
				</tr>
				<tr>
					<th><st:message code="register.password2"/></th>
					<td><sf:password path="repassword"/></td>
					<td><sf:errors path="repassword"/> </td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="${sub}"> </td>
				</tr>
			</table>
		</sf:form>
	</div>
</body>
</html>