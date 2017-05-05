<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="url" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	<url:url value="/processPersonDetails" var="url"></url:url>
		<form:form action="${url}"  modelAttribute="personObj">
			<table>
			
			<tr>
					<td><label for="firstname">Enter Firstname</label></td>
					<td><form:input path="firstname"/></td>
				</tr> 
				<tr>
					<td><label for="lastname">Enter lastname</label></td>
					<td><form:input path="lastname"/></td>
				<tr>
					<td><label for="email">Enter Email</label></td>
					<td><form:input path="email"/></td>
				</tr>	
				<tr>
					<td><label for="phone">Enter Phone</label></td>
					<td><form:input path="phone"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="submit"></td>
				</tr>
			</table>
		</form:form>
	</body>
</html>
				</tr>