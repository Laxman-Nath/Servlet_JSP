<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit doctor</title>
<%@include file="../bootstrap.css"%>
</head>
<body style="background-color: rgb(27, 31, 25);">
	<section class="vh-100">
		<div class="container py-5 h-100">
			<div class="row justify-content-center align-items-center h-100">
				<div class="col-12 col-lg-9 col-xl-7">
					<div class="card shadow-2-strong" style="border-radius: 15px;">
						<div class="card-body p-4 p-md-5 text-center"
							style="background-color: rgb(250, 17, 242);">
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5 text-center">Doctor
								Edit form Form</h3>
							<h3>${msg }</h3>
							<form action="EditDoctorServlet" method="post">
								<input type="hidden" name="id" value="${doctor.id }">
								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<input type="text" name="name" value="${doctor.name }"
												class="form-control form-control-lg" /> <label
												class="form-label"> Name</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<input type="email" name="email" value="${doctor.email }"
												class="form-control form-control-lg" /> <label
												class="form-label">Email</label>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 d-flex align-items-center">

										<div class="form-outline">
											<input type="text" name="specialization"
												value="${doctor.specialization }"
												class="form-control form-control-lg" /> <label
												class="form-label">Specialization</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<h6 class="mb-2 pb-1">Gender:</h6>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio" name="gender"
												value="female"
												<c:if test="${doctor.gender == 'female'}">checked</c:if> />
											<label class="form-check-label">Female</label>
										</div>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio" name="gender"
												value="male"
												<c:if test="${doctor.gender== 'male' }">checked</c:if> /> <label
												class="form-check-label">Male</label>
										</div>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio" name="gender"
												value="other"
												<c:if test="${doctor.gender =='other' }">checked</c:if> />
											<label class="form-check-label">Other</label>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 pb-2">

										<div class="form-outline">
											<textarea class="form-control form-control-lg" name="address"
												rows="3">${doctor.address }</textarea>
											<label class="form-label">Address</label>
										</div>

									</div>
									<div class="col-md-6 mb-4 pb-2">

										<div class="form-outline">
											<textarea class="form-control form-control-lg" name="note"
												rows="3">${doctor.note }</textarea>
											<label class="form-label">Note</label>
										</div>

									</div>

								</div>

								<div class="row">
									<div class="col-md-6 mb-4 pb-2">

										<div data-mdb-input-init class="form-outline">
											<input type="number" name="phone"
												class="form-control form-control-lg"
												value="${doctor.phone }" /> <label class="form-label">Mobile</label>
										</div>

									</div>
								</div>

								<div class="mt-4 pt-2">
									<input data-mdb-ripple-init class="btn btn-primary btn-lg"
										type="submit" value="Update" />
								</div>

							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
</html>