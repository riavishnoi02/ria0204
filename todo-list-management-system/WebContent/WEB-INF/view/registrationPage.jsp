<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Registration Page</title>
</head>
<body>

	<h2>Please enter your credentials to Register</h2>

	<form:form action="saveRegistrationForm" modelAttribute="Users"
			method="POST">

			<table>
				<tbody>
					<tr>
						<td><label>User Name :</label></td>
						<td><form:input path="userName" /></td>
					</tr>
					<tr>
						<td><label>Password :</label></td>
						<td><input type="password" /></td>
					</tr>
					<tr>
						<td><label>Confirm Password :</label></td>
						<td><form:input path="password" /></td>
					</tr>
					<!-- <tr>
						<td><label>Admin login :</label></td>
						<td><input type="checkbox" name="isAdmin" /></td>
					</tr> -->
					<tr>
						<td><label></label></td>
						<td><input type="submit" value = "save" class="save" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="button" value = "cancel" onclick="window.location.href=''; return false;" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>

</body>
</html>