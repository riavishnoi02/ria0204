<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Page</title>
</head>
<body>
	<h1>Tasks Inventory</h1>

	<input type="button" value="Add Tasks"
		onclick="window.location.href='addTasksToList'; return false;"
		class="add-button" />
	<table>
		<tr>
			<th>Task Name</th>
			<th>Task Target date</th>
			<th>Task Status</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="tempTasks" items="${tasks}">

			<c:url var="updateLink" value="/updateTasksFromList">
				<c:param name="taskId" value="${tempTasks.id }" />
			</c:url>

			<c:url var="deleteLink" value="/deleteTasksFromList">
				<c:param name="taskId" value="${tempTasks.id }" />
			</c:url>
			<tr>
				<td>${tempTasks.taskName}</td>
				<td>${tempTasks.taskTargetDate}</td>
				<td>${tempTasks.taskStatus}</td>
				<td><a href="${updateLink}">Update</a>
				<td><a href="${deleteLink}"
					onclick="if(!(confirm('Are you sure you want to delete this ?')))return false">Delete</a>
			</tr>
		</c:forEach>
	</table>

</body>
</html>