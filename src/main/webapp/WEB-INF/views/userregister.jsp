<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration page</title>
</head>
<body>


<div class="container" style="background-color:red">
        <h1>Registration Form</h1>
        <div class="row">
            <div class="col-md-6 mb-3">
                <form action="<%= request.getContextPath()%>/UserRegisteration" method="post">

                    <!--Email-->
                    <div class="form-group">
                        <label for="fname">First name:</label>
                        <input type="text" name="fname" placeholder="Enter Your firstname" >
                    </div>
                    <div class="form-group">
                        <label for="Lastname">Last name:</label>
                        <input type="text" name="lname" placeholder="Enter Your lastname" >
                    </div>
                    <div class="form-group">
                        <label for="email">Email Id:</label>
                        <input type="text" name="email" placeholder="Enter Your Email" >
                    </div>

                    <!--Password-->

                    <div class="form-group">
                        <label for="password">Password:</label>
                        <input type="password" name="password" placeholder="Enter Your Password" >
                    </div>

                    <div class="form-group">
                        
                        <input type="submit" value="Login">
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>