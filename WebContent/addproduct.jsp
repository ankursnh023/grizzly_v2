<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js /bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
 --><link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Grizzly Store</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Page 1</a></li>
      <li><a href="#">Page 2</a></li>
    </ul>
    <form class="navbar-form navbar-left" action="">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form>
    <form class="navbar-form navbar-right" action="logout">
    <button type="submit" class="btn btn-default" >Logout</button>
    </form>
    
  </div>
</nav>

<!-- profile -->

<div class="container">

<div class="col-md-3">
	
	    <img class="img-fluid" style="height:200px; width:200px" src="https://cdn3.iconfinder.com/data/icons/iconano-web-stuff/512/105-User-512.png"  alt="Profile picture" class="mx-auto d-block mt-4" />

                <h4 class="text mt-5">Ankur Sinha</h4>
                <h4 class="text mt-2">Intern</h4>
                <h4 class="text mt-2">Cognizant, Pune</h4>
	
</div>

<div class="col-md-9">
<div class="form-group row">

<ul class="nav nav-tabs">
  <li class="active"><a data-toggle="tab" href="#product">PRODUCTS</a></li>
  <li><a data-toggle="tab" href="#">VENDORS</a></li>
</ul>
</div>

	<form action="insert" enctype="multipart/form-data" method="post">
	<div class="form-group row">
    <div class="col-sm">
    <label class="col-sm-2 col-form-label">Name</label>
      <input type="text" class="form-control" name="name" placeholder="Enter name" required>
    </div>
  </div>
	
  <div class="form-group row">
    <div class="col-sm">
    <label class="col-sm-2 col-form-label">Category</label>
      <input type="text" class="form-control" name="category" placeholder="Enter Product category" required>
    </div>
  </div>
  
  <div class="form-group row">
    <div class="col-sm">
    <label class="col-sm-2 col-form-label">Description</label>
      <input type="text"  class="form-control" name="description" placeholder="Enter description" required>
    </div>
  </div>
   <div class="form-group row">
    <div class="col-sm">
    <label class="col-sm-2 col-form-label">Price</label>
      <input type="number" step="0.01" class="form-control" name="price" placeholder="Enter price" required>
    </div>
  </div>
  
  <div class="form-group row">
    <div class="col-sm">
    <label class="col-sm-2 col-form-label">Photo</label>
      <input type="file" name="photo">
    </div>
  </div>
  

  <div class="form-group row">
    <div class="col-sm-10 m-4">
      <button type="submit" class="btn btn-primary">Add</button>
    </div>
    
  </div>
  <input type="button" class="btn btn-primary" value="Cancel" onclick="history.back()">
</form>
<!-- <form action="ProductController">
	<div class="row-sm-10">
      <button type="submit" class="btn btn-primary">Cancel</button>
    </div>
</div>
</form> -->
</div>
<form>
  
</form>

</body>
</html>