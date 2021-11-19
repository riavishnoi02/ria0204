<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Admin Add Tasks Page</title>
</head>
<body>

	<h2>Please Add/Update task</h2>

	<form:form action="saveTasks" modelAttribute="tasks" method="POST">
		<form:hidden path="id" />
		<table>
			<tbody>
				<tr>
					<td><label>Task Name :</label></td>
					<td><form:input path="taskName" /></td>
				</tr>
				<tr>
					<td><label>Task Target Date :</label></td>
					<td><form:input path="taskTargetDate" /></td>
					<td>( YYYY-MM-DD )</td>
				</tr>
				<tr>
					<td><label>Task Status :</label></td>
					
					<td><form:radiobutton path="taskStatus" value="Yet To Start" /> Yet To Start <br />
					    <form:radiobutton path="taskStatus" value="In Progress" />  In Progress <br />
					    <form:radiobutton path="taskStatus" value="Completed" />    Completed <br />
						<form:radiobutton path="taskStatus" value="Cancelled" />    Cancelled
					</td>
				</tr>
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="save" class="save" /></td>
				</tr>
				<tr>
					<td><label></label></td>
					<td><input type="button" value="cancel"
						onclick="window.location.href=''; return false;" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>

</body>
</html>