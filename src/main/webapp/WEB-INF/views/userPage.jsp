<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Userpage</title>

 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>

<Header>
<div class="container-fluid" style="background-color: yellowgreen">
        <div class="card-header bg-transparent border-danger">
           <Div Class="Logo"><h1>Welcome to Sporty Shoes</h1></Div>
    <Div Class="Menu">
        <A Href=""><Ion-Icon Name="Close" Class="Close"></Ion-Icon></A>
        <Ul>
            <Li><A Href="#" Class="Under">HOME</A></Li>
            <Li><A Href="#" Class="Under">SHOP</A></Li>
            <Li><A Href="#" Class="Under">OUR PRODUCTS</A></Li>
            <Li><A Href="#" Class="Under">CONTACT US</A></Li>
            <Li><A Href="#" Class="Under">ABOUT US</A></Li>
        </Ul>
    </Div>
        </div>
   </div>
   <br>
   <form action="" method="post">

    <label for="name">Search Here For Any Shoes Brand</label>
    <input type="text" id="query" name="query" placeholder="Brand Name">

</form>
<br>

<div class="container-fluid"  style="background-color: black">
	<div class="card">
        <div class="card-body">
            <h1>Nike Sports Shoes<br>
            Price: 3000/-<br>
            Color: black
            </h1>
        </div>
        </div>
</div>
<div class="container-fluid"  style="background-color: red">
<div class="card">
        <div class="card-body">
            <h1>Adidas Casual Shoes<br>
            Price: 2000/-<br>
            Color: red
            </h1>
        </div>
    </div>
</div>

</div>
   <!--Typeahead Script-->
   <script type="text/javascript">
    $(document).ready(
        function(){ 
        	var name=['Nike','Adidas','Puma','Wrogn'];
            $('#query').typeahead({source:name})
        }
    )

</script>

           
               
                  
    <div class="card-footer bg-transparent border-danger text-center">
         <h1><span class="badge badge-warning">We are available on all Social Media Platforms</span></h1>
    </div>
    
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</body>

</html>