<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Appointments</title>
<%@ include file="../bootstrap.css"%>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header">
						<h1>Appointments list</h1>
						<h1>${msg }</h1>
					</div>
					<div class="card-body">
						<table class="table table-dark">
							<thead>
								<tr>
									<th>S.N</th>
									<th>Doctor</th>
									<th>Date</th>
									<th>Consultation Fee</th>
									<th>Details</th>
									<th>Slots</th>
									
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="a" items="${appointments}" varStatus="status">
									<tr>
										<td>${status.count}</td>
										<td>${a.doctor}</td>
										<td>${a.date }</td>
										<td>${a.fee }</td>
										<td>${a.details }</td>
										<td>${a.slots }</td>
										
										<td><a href="EditAppointmentServlet?id=${a.id }">Edit</a> <a
											href="DeleteAppointmentServlet?id=${a.id }">Delete</a></td>

									</tr>
								</c:forEach>
							</tbody>

						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>