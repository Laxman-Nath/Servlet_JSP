<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Appointment</title>
<%@ include file="../bootstrap.css"%>
</head>
<body style="background-color: rgb(27, 31, 25);">
	<section class="vh-100">
		<div class="container py-5 h-100">
			<div class="row justify-content-center align-items-center h-100">
				<div class="col-12 col-lg-9 col-xl-7">
					<div class="card shadow-2-strong" style="border-radius: 15px;">
						<div class="card-body p-4 p-md-5 text-center"
							style="background-color: rgb(250, 17, 242);">
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5 text-center">Update
								Appointment</h3>
							<h2>${msg}</h2>
							<form action="EditAppointmentServlet" method="post">
								<input type="hidden" name="id" value="${a.id }">
								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<select class="form-select form-control form-control-lg"
												name="doctor">
												<c:forEach var="d" items="${doctors }">
													<option value="${d.name }"
														<c:if test="${d.name.equals(a.doctor) }">selected</c:if>>${d.name}</option>
												</c:forEach>
											</select> <label class="form-label">Doctor</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div class="form-outline ">
											<input type="Date" name="date" value="${ a.date}"
												class="form-control form-control-lg" /> <label
												class="form-label">Date</label>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 d-flex align-items-center">

										<div class="form-outline">
											<input type="number" name="slots" value="${ a.slots}"
												class="form-control form-control-lg" /> <label
												class="form-label">No of Slots</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">



										<div class="form-outline">
											<textarea class="form-control form-control-lg" name="details"
												rows="3">${a.details }</textarea>
											<label class="form-label">Details</label>
										</div>



									</div>
								</div>

								<div class="row">

									<div class="col-md-6 mb-4 pb-2">

										<div class="form-outline">
											<input type="text" name="fee" value="${a.fee }"
												class="form-control form-control-lg"> <label
												class="form-label">Consultation fee</label>
										</div>

									</div>

								</div>



								<div class="mt-4 pt-2">
									<input data-mdb-ripple-init class="btn btn-primary btn-lg"
										type="submit" value="Add" />
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