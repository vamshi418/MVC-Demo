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
<url:url value="processStudentData" var="url"></url:url>
<form:form action="${url }" modelAttribute="student">
<table>
<tr>
<td><label for="name">Enter the name:</label></td>
<td><form:input path="name"></form:input></td>
</tr>
<tr>
<td><label for="department">Enter the department:</label></td>
<td><form:input path="department"></form:input>
</td>
</tr>

<tr>
<td><label for="mark1">Enter the mark1 of the student:</label></td>
<td><form:input path="mark1"></form:input>
</td>
</tr>

<tr>
<td><label for="mark2">Enter the mark2 of the student:</label></td>
<td><form:input path="mark2"></form:input>
</td>
</tr>

<tr><td><input type="submit" value="submit"></td></tr>
</table>

</form:form>
</body>
</html> 