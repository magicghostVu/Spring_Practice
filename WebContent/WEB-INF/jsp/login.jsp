<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Learning Boostrap</title>

    <!-- Bootstrap -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">   

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <!-- <h1>Hello, world!</h1> -->
    <div class="container">



    	<div class="row">
    		<div class="col-md-4 col-md-offset-4">
    		<h2 class="text-center">Login page</h2>
				<form action="">
					<div class="form-group">
						<label class="control-label" for="">User name</label>
						<input type="text" class="form-control">

					</div>
					<div class="form-group">
						<label class="control-label" for="">Password</label>
						<input type="text" class="form-control">


					</div>

					
					<div class="row">
						<button class="btn btn-default col-md-offset-3">Login</button>
						<a href="https://github.com/login/oauth/authorize?scope=user:email&client_id=${clientId}" class="col-md-offset-1">Login with GitHub</a>

					</div>
					

				</form>
				


    	</div>

    	</div>
    	
	

    </div>
	
	
















    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://code.jquery.com/jquery-2.2.1.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  </body>
</html>