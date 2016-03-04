<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Learning Boostrap</title>

<!-- Bootstrap -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<!-- <link rel="stylesheet" href="css/user-info.css"> -->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<style>
img {
	width: 200px;
	height: 200px;
}

.user-info {
	margin-top: 40px;
}
</style>
</head>
<body>
	<!-- <h1>Hello, world!</h1> -->
	<div class="container">
		<div class="row">
			<h2>User Profile</h2>



		</div>

		<div class="row">
			<div class="col-md-4">

				<img src="${user.avtUrl}" alt="">
			</div>



			<div class="col-md-8 user-info">
				<p>Username: ${user.name}</p>
				<p>User ID: ${user.id}</p>
				<p>Full name: ${user.fullName}</p>
				<p>Location: ${user.location}</p>
				<p>More infomation: ${user.url}
			</div>


		</div>

	</div>


















	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="http://code.jquery.com/jquery-2.2.1.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>