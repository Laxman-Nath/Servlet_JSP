<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Specializations</title>
<%@ include file="../bootstrap.css"%>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header">
						<h1>Specializations list</h1>
						<h2>${msg }</h2>
					</div>
					<div class="card-body">
						<table class="table table-dark">
							<thead>
								<tr>
									<th>S.N</th>
									<th>Name</th>
									<th>Code</th>
									<th>Note</th>
									
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="s" items="${ specializations}" varStatus="status">
									<tr>
										<td>${status.count}</td>
										<td>${s.name}</td>
										<td>${s.code }</td>
										<td>${s.note}</td>
										
										
										<td><a href="EditSpecializationServlet?id=${s.id }">Edit</a> <a
											href="DeleteSpecializationServlet?id=${s.id }">Delete</a></td>

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