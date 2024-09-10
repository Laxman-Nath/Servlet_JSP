<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of patients</title>
<%@ include file="../bootstrap.css"%>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header">
						<h1>Patients list</h1>
						<h2>${msg }</h2>
					</div>
					<div class="card-body">
						<table class="table table-dark">
							<thead>
								<tr>
									<th>S.N</th>
									<th>Name</th>
									<th>Present Address</th>
									<th>Communication Address</th>
									<th>DOB</th>
									<th>Martial Status</th>
									<th>Other Details</th>
									<th>Medical history</th>
									<th>Phone</th>
									<th>Gender</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="p" items="${ patients}" varStatus="status">
									<tr>
										<td>${status.count}</td>
										<td>${p.name}</td>
										<td>${p.presentAddress }</td>
										<td>${p.communicationAddress}</td>
										<td>${p.DOB }</td>
										<td>${p.martialStatus }</td>
										<td>${p.otherDetails}</td>
										<td>${p.medicalHistory}</td>
										<td>${p.phone }</td>
										<td>${p.gender }</td>
										
										<td><a href="EditPatientServlet?id=${p.id }">Edit</a> <a
											href="DeletePatientServlet?id=${p.id }">Delete</a></td>

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