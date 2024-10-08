<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Area</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid" style="margin-top: 150px;">
		<div class="row">
			<div class="col-md-5 offset-md-4">
				<div class="card">
					<div class="card-header bg-black">
						<h1 class="text-center text-danger ">Calculate Area</h1>
					</div>
					<div class="card-body text-center">
						<form action="AreaServlet" method="post">
							<div class="mb-2">
								<label class="">Length</label><input class="form-control"
									type="number" name="length" required>
							</div>
							<div class="mb-2">
								<label class="">Breadth</label><input class="form-control"
									type="number" name="breadth" required>
							</div>
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
</html>