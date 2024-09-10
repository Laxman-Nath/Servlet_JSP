<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
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
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5 text-center">Login Form</h3>
							<h2>${msg}</h2>
							<form action="LoginServlet" method="post">


								<div class="form-outline">
									<input type="text" name="name"
										class="form-control form-control-lg"> <label
										class="form-label">Name</label>
								</div>





								<div class="form-outline ">
									<input type="password" name="password"
										class="form-control form-control-lg" /> <label
										class="form-label">Password</label>


								</div>





								<div class="mt-4 pt-2">
									<input data-mdb-ripple-init class="btn btn-primary btn-lg"
										type="submit" value="Login" />
								</div>
								<div style="margin-top: 20px; color: red; font-size: 24px;"">
									<span>Don't have an account?<a href="register.jsp"
										class="text-decoration-none text-success">Create</a></span>
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