<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>User Page</title>
</head>
<body>

	<h2>Your Tasks till date</h2>

	<table>
		<tr>
			<th>Task Name</th>
			<th>Task start date</th>
		</tr>
		<c:forEach var="tempTasks" items="${tasks}">

			<tr>
				<td>${tempTasks.taskName}</td>
				<td>${tempTasks.taskStartDate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>