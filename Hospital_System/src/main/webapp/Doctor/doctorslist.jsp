<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of doctors</title>
<%@ include file="../bootstrap.css"%>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header">
						<h1>Doctors list</h1>
					</div>
					<div class="card-body">
						<table class="table table-dark">
							<thead>
								<tr>
									<th>S.N</th>
									<th>Name</th>
									<th>Address</th>
									<th>Email</th>
									<th>Specialization</th>
									<th>Note</th>
									<th>Phone</th>
									<th>Gender</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="d" items="${ doctors}" varStatus="status">
									<tr>
										<td>${status.count}</td>
										<td>${d.name}</td>
										<td>${d.address }</td>
										<td>${d.email }</td>
										<td>${d.specialization }</td>
										<td>${d.note }</td>
										<td>${d.phone }</td>
										<td>${d.gender }</td>
										<td><a href="EditDoctorServlet?id=${d.id }">Edit</a> <a
											href="DeleteDoctorServlet?id=${d.id }">Delete</a></td>

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