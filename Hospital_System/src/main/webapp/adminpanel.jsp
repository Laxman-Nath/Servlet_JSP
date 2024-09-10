<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<%@ include file="bootstrap.css"%>
<link href="style.css" rel="stylesheet">
</head>
<body style="background-color: black;">
	<div class="container-fluid" style="margin-top: 100px;">
		<div class="row">
			<div class="col-md-12">
				<div class="card" style="background-color: rgb(223, 223, 232);">
					<div class="card-header">
						<h2 class="text-center text-danger">Welcome</h2>
					</div>
					<div class="card-body text-center">
						<div class="row" style="margin-left: 180px;">
							<div class="col-md-3 p-2 m-3 ">
								<div class="card bg-black text-white">
									<a href="DoctorServlet" class="text-decoration-none item">
										<div class="card-body text-center">
											<div>
												<i class="fa solid fa-plus fa-4x "></i>
											</div>
											<h4>Add doctor</h4>
										</div>
									</a>
								</div>
							</div>
							<div class="col-md-3 p-2 m-3">
								<div class="card bg-black text-white">
									<a href="ViewDoctorsServlet" class="text-decoration-none item">
										<div class="card-body text-center">
											<div>
												<i class="fa-solid fa-user-doctor fa-4x"></i>
											</div>
											<h4>View Doctors</h4>
										</div>
									</a>
								</div>
							</div>
							<div class="col-md-3 p-2 m-3">
								<div class="card bg-black">
									<a href="PatientServlet" class="text-decoration-none item">
										<div class="card-body text-center">
											<div>
												<i class="fa solid fa-plus fa-4x "></i>
											</div>
											<h4>Add Patient</h4>
										</div>
									</a>
								</div>

							</div>
							<div class="col-md-3 p-2 m-3">
								<div class="card bg-black text-white">
									<a href="ViewPatientsServlet" class="text-decoration-none item">
										<div class="card-body text-center">
											<div>
												<i class="fa-solid fa-bed-pulse fa-4x"></i>
											</div>
											<h4>View Patients</h4>
										</div>
									</a>
								</div>
							</div>
							<div class="col-md-3 p-2 m-3">
								<div class="card bg-black">
									<a href="AppointmentServlet" class="text-decoration-none item">
										<div class="card-body text-center">
											<div>
												<i class="fa solid fa-plus fa-4x "></i>
											</div>
											<h4>Add Appointment</h4>
										</div>
									</a>
								</div>

							</div>
							<div class="col-md-3 p-2 m-3">
								<div class="card bg-black text-white">
									<a href="ViewAppointmentsServlet"
										class="text-decoration-none item">
										<div class="card-body text-center">
											<div>
												<i class="fa-regular fa-calendar-check fa-4x"></i>
											</div>
											<h4>View Appointment</h4>
										</div>
									</a>
								</div>
							</div>
							<div class="col-md-3 p-2 m-3">
								<div class="card bg-black">
									<a href="SpecializationServlet" class="text-decoration-none item">
										<div class="card-body text-center">
											<div>
												<i class="fa solid fa-plus fa-4x "></i>
											</div>
											<h4>Add Specialization</h4>
										</div>
									</a>
								</div>

							</div>





							<div class="col-md-3 p-2 m-3">
								<div class="card bg-black text-white">
									<a href="ViewSpecializationsServlet"
										class="text-decoration-none item">
										<div class="card-body text-center">
											<div>
												<i class="fa-regular fa-calendar-check fa-4x"></i>
											</div>
											<h4>View Specialization</h4>
										</div>
									</a>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
</body>
</html>