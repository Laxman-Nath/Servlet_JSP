<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Specialization</title>
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
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5 text-center">Specialization
								Registration Form</h3>
							<h2>${success}</h2>
							<form action="SpecializationServlet" method="post">




								<div class="form-outline">
									<input type="text" name="code"
										class="form-control form-control-lg" /> <label
										class="form-label"> Code</label>
								</div>




								<div class="form-outline">
									<input type="text" name="name"
										class="form-control form-control-lg" /> <label
										class="form-label">Name</label>
								</div>

								<div class="form-outline">
									<textarea class="form-control form-control-lg" name="note"
										rows="3"></textarea>
									<label class="form-label">Note</label>
								</div>




								<div class="mt-4 pt-2">
									<input data-mdb-ripple-init class="btn btn-primary btn-lg"
										type="submit" value="Create" />
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