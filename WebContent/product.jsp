<%@page import="java.util.List"%>
<%@page import="com.model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% List<Product> pL=(List)request.getAttribute("products");
%>
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
<div >
<a href="add"><button type="button" class="btn btn-secondar">Add Product</button></a>
</div>
<table class="table table-borderless">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Category</th>
      <th scope="col">Rating</th>
      <th scope="col"></th>
      <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
  <% for(int i=0;i<pL.size();i++){ %>
    <tr>
      <th scope="row"><%=pL.get(i).getName()%></th>
      <td><%=pL.get(i).getCategory()%></td>
      <td>4.5</td>
      <td><a href="view?id=<%= pL.get(i).getId() %>">View</a></td>
      <td><a href="">Block</a></td>
      <td><a href="delete?id=<%= pL.get(i).getId() %>">Remove</a></td>
    </tr><%} %>
  </tbody>
</table>

</div>

</div>
</body>
</html>