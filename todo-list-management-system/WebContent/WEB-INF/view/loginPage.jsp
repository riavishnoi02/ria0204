<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Login Page</title>
</head>
<body>

	<h2>Please enter your credentials</h2>

	<form:form action="saveLoginPage" modelAttribute="Users"
			method="POST">

			<table>
				<tbody>
					<tr>
						<td><label>User Name :</label></td>
						<td><form:input path="userName" /></td>
					</tr>
					<%-- <tr>
						<td><label>Password :</label></td>
						<td><form:input path="password" /></td>
					</tr> --%>
					<tr>
						<td><label>Password :</label></td>
						<td><input type="password" /></td>
					</tr>
					<!-- <tr>
						<td><label>Admin login :</label></td>
						<td><input type="checkbox" name="isAdmin" /></td>
					</tr> -->
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value = "save" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>

</body>
</html>