<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Patient</title>
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
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5 text-center">Patient
								Registration Form</h3>
							<h2>${success}</h2>
							<form action="PatientServlet" method="post">

								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<input type="text" name="name"
												class="form-control form-control-lg" /> <label
												class="form-label"> Name</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<input type="date" name="dob"
												class="form-control form-control-lg" /> <label
												class="form-label">DOB</label>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 d-flex align-items-center">

										<div class="form-outline">
											<textarea class="form-control form-control-lg"
												name="caddress"></textarea>
											<label class="form-label">Communication address</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<h6 class="mb-2 pb-1">Gender:</h6>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio" name="gender"
												value="female" checked /> <label class="form-check-label">Female</label>
										</div>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio" name="gender"
												value="male" /> <label class="form-check-label">Male</label>
										</div>



									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 pb-2">

										<div class="form-outline">
											<textarea class="form-control form-control-lg"
												name="paddress" rows="3"></textarea>
											<label class="form-label">Present Address</label>
										</div>

									</div>
									<div class="col-md-6 mb-4 pb-2">
										<div class="row">
											<h6 class="mb-2 pb-1">Martial Status:</h6>
											<div class="col-md-3 offset-md-3">

												<div class="form-check form-check-inline">
													<input type="radio" name="mstatus" value="married"
														class="form-check-input"> <label
														class="form-check-label">M</label>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-check form-check-inline">
													<input type="radio" value="unmarried"
														class="form-check-input" name="mstatus"> <label
														class="form-check-label">U</label>
												</div>
											</div>
										</div>
										<div class="row">

											<div class="col-md-3 offset-md-3">

												<div class="form-check form-check-inline">
													<input type="radio" value="divorced" name="mstatus"
														class="form-check-input"> <label
														class="form-check-label">D</label>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-check form-check-inline">
													<input type="radio" value="ls" class="form-check-input"
														name="mstatus"> <label class="form-check-label">LS</label>
												</div>
											</div>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6  pb-2" style="margin-top:34px;">

										<div class="form-outline">
											<input type="number" name="phone"
												class="form-control form-control-lg" /> <label
												class="form-label">Mobile</label>
										</div>

									</div>
										<div class="col-md-6 mb-4 pb-2">

										<div class="form-outline">
											<textarea class="form-control form-control-lg"
												name="odetails" rows="3"></textarea>
											<label class="form-label">Other Details</label>
										</div>

									</div>

								</div>
								<div class="row">
									<div class="col-md-6 mb-4 pb-2">
										<h6>Past medical history</h6>
										<div class="row">
											<div class="col-md-2 offset-md-1">

												<div class="form-check form-check-inline">
													<input type="checkbox" name="phistory" value="anemia"
														class="form-check-input"> <label
														class="form-check-label">Anemia</label>
												</div>

											</div>
											<div class="col-md-2 offset-md-2">

												<div class="form-check form-check-inline">
													<input type="checkbox" name="phistory" value="asthma"
														class="form-check-input"> <label
														class="form-check-label">Asthma</label>
												</div>

											</div>
											<div class="col-md-2 offset-md-2">

												<div class="form-check form-check-inline">
													<input type="checkbox" name="phistory" value="diabetes"
														class="form-check-input"> <label
														class="form-check-label">Diabetes</label>
												</div>

											</div>
											<div class="col-md-2 offset-md-1">

												<div class="form-check form-check-inline">
													<input type="checkbox" name="phistory" value="cancer"
														class="form-check-input"> <label
														class="form-check-label">Cancer</label>
												</div>

											</div>
											<div class="col-md-2 offset-md-2">

												<div class="form-check form-check-inline">
													<input type="checkbox" name="phistory" value="ulcer"
														class="form-check-input"> <label
														class="form-check-label">Ulcer</label>
												</div>

											</div>
											<div class="col-md-2 offset-md-2">

												<div class="form-check form-check-inline">
													<input type="checkbox" name="phistory" value="chickenpox"
														class="form-check-input"> <label
														class="form-check-label">ChickenPox</label>
												</div>

											</div>
											<div class="col-md-12 offset-md-1">

												<div class="form-check form-check-inline d-flex justify-content-center">
													<input type="checkbox"
														class="form-check-input " name="phistory" id="check" style="margin-right:4px;"> <label class="form-label " >Other</label><input
														type="text" name="other" id="input" style="margin-left:12px;" class="form-control" onchange="copyValue()">


												</div>

											</div>
										</div>





									</div>
								</div>


								<div class="mt-4 pt-2">
									<input data-mdb-ripple-init class="btn btn-primary btn-lg"
										type="submit" value="Register" />
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
<script>
function copyValue(){
    let val=document.getElementById("input").value;
    document.getElementById("check").value="";
    document.getElementById("check").value=val;
}
</script>
	
</html>