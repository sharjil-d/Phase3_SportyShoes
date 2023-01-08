<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Admin</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<!--Bundle  Script from bootstrap-->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

<!--Typeahead cript from cdnjs.com-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-3-typeahead/4.0.2/bootstrap3-typeahead.min.js" integrity="sha512-HWlJyU4ut5HkEj0QsK/IxBCY55n5ZpskyjVlAoV9Z7XQwwkqXoYdCIC93/htL3Gu5H3R4an/S0h2NXfbZk3g7w==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</head>
<body>
<h1>Welcome Admin</h1>

    
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <a href="#" class="navbar-brand">Sportyshoes</a>


        <ul class="navbar-nav">
            <li class="nav-item">
                <a href="http://localhost:8080/sportyshoes.project/ManageProducts" class="nav-link">Manage Products</a>
            </li>

            <li class="nav-item">
                <a href="http://localhost:8080/sportyshoes.project/SearchUsers" class="nav-link">Search Users</a>
            </li>
             <li class="nav-item">
                <a href="http://localhost:8080/sportyshoes.project/Reports" class="nav-link">Purchase Reports</a>
            </li>
             </ul>

    </nav>
            <h1>Most selling shoes brand:</h1>
<div class="container">
        <div class="progress mb-3">
            <div class="progress-bar bg-success" style="width: 40%;">
            Nike 40%
            </div>
        </div>

        <div class="progress mb-3">
            <div class="progress-bar bg-danger" style="width: 10%;">
            Adidas 10%
            </div>
        </div>
        <div class="progress mb-3">
            <div class="progress-bar bg-success" style="width: 50%;">
            Others 50%
            </div>
        </div>
</body>
</html>