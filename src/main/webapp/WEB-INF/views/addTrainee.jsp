<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>add trainee</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">

		<div class="row" style="padding-left: 20px;">
			<br> <br> <br>
			<h3>${msg}</h3>
			<h3>Enter Trainee Details</h3>
		</div>

		<form:form modelAttribute="traineeDetails"
			action="${pageContext.request.contextPath}/addTrainee" method="post">
			<table
				class="table table-bordered table-striped table-hover table-condensed"
				style="width: 98%; height: 100px;">

				<thead style="background-color: #DFDBD7;">

					<tr>
						<th>Trainee ID</th>
						<th>Trainee Name</th>
						<th></th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td><input type="text" class="form-control" name="traineeId"
							placeholder="Trainee ID" required></td>
						<td><input type="text" class="form-control"
							name="traineeName" placeholder="Trainee Name"
							title="please enter Trainee Name" required /></td>

						<td><input class="btn btn-primary"
							style="background-color: #00857D;" type="submit"
							value="Add trainee" style="width: 200px;"></td>
					</tr>

				</tbody>

			</table>

		</form:form>
	</div>
</body>
</html>