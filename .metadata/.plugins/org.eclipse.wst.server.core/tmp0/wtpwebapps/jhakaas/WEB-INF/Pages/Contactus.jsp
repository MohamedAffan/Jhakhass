<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="resources/css/signup.css">
</head>
<body style="background-color: white">
	<jsp:include page="navbar.jsp" />
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<section>
					<h1 class="entry-title">
						<span>Contactus</span>
					</h1>
					<hr>
					<form:form action="userreg" modelAttribute="reguser" class="form-horizontal"
						method="post" name="signup" id="signup">

						<div class="form-group">
							<label class="control-label col-sm-3"> Name <span
								class="text-danger">*</span></label>
							<div class="col-md-8 col-sm-9">
								<form:input type="text" class="form-control" name="mem_name"
									id="mem_name" placeholder="Enter your Name here" value="" path="username"></form:input>
							</div>
						</div>
						<%-- <div class="form-group">
							<label class="control-label col-sm-3">Date of Birth <span
								class="text-danger">*</span></label>
							<div class="col-md-8 col-sm-9">
								<form:input type="type" class="form-control" name="mem_name"
									id="mem_name" placeholder="Date of Birth" value="" path="dob"></form:input>
							</div>
						</div> --%>

						<div class="form-group">
							<label class="control-label col-sm-3">Subject <span
								class="text-danger">*</span></label>
							<div class="col-md-5 col-sm-8">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-"></i></span>
									<form:input type="password" class="form-control"
										name="password" id="password"
										placeholder="Choose password (5-15 chars)" value="" path="password"></form:input>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-sm-3">Description <span
								class="text-danger">*</span></label>
							<div class="col-md-5 col-sm-8">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-"></i></span>
									<form:input type="text" class="form-control" name="contactnum"
										id="contactnum" placeholder="Enter your Primary contact no."
										value="" path="contactno"></form:input>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-3">Email ID <span
								class="text-danger">*</span></label>
							<div class="col-md-8 col-sm-9">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-envelope"></i></span>
									<form:input type="email" class="form-control" name="emailid"
										id="emailid" placeholder="Enter your Email ID" value="" path="emailid"></form:input>
								</div>

							</div>
							<div class="container">&nbsp;</div>

							<div class="form-group" style="margin-top: 20">
								<div class="col-xs-offset-3 col-xs-10">
									<button name="Submit" type="submit" value="Sign Up"
										class="btn btn-success">Send Feedback</button>
									
								</div>
							</div>
					</form:form>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>