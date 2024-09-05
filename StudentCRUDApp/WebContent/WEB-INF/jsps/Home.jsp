<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="st" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

tr {
  border-bottom: 1px solid #ddd;
}
</style>
</head>
<body>
	<h1 style="color: white;background: black;text-align: center;"><st:message code="home.header1"/>  </h1>
	<div style="text-align: right;">
		<a href="?locale=en_US">English</a>
		<a href="?locale=fr_FR">Français</a>
	</div>
	<div>
		<h4><a href="toRegisterView"><st:message code="home.hyperlink1"/></a></h4>
	</div>
	
	<div>
		<table >
			<tr>
				<th><st:message code="home.name"/></th>
				<th><st:message code="home.email"/></th>
				<th><st:message code="home.dob"/></th>
				<th><st:message code="home.gender"/></th>
				<th><st:message code="home.address.street"/></th>
				<th><st:message code="home.address.city"/></th>
				<th><st:message code="home.address.pin"/></th>
				
			</tr>
			<c:forEach items="${list}" var="bean">
				<tr>
					<th> ${bean.name} </th>
					<th> ${bean.email} </th>
					<th> ${bean.dob} </th>
					<th> ${bean.gender} </th>
					<th> ${bean.address.street} </th>
					<th> ${bean.address.city} </th>
					<th> ${bean.address.pinCode} </th>
					<th> <a href="toUpdateSuccess?id=${bean.id}">Update</a> </th>
					<th> <a href="toDeleteSuccess?id=${bean.id}">Delete</a> </th>
					
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>