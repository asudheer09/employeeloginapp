<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib
uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1> Welcome to HCL Employee Login Page </h1>

<form:form name="submitForm" method="POST" action="loginAction">
<div align="center">
<table>
<tr>
<td>User Name</td>
<td><input type="text" name="userName" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Submit" /></td>
</tr>
</table>
</div>
</form:form>