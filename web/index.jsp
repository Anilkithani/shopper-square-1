<%-- 
    Document   : index
    Created on : 10-Oct-2016, 15:53:37
    Author     : Faiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
         <title>Shopper_Square</title>
    <%@include file="Include_Page/Header.jsp" %>
    
  </head>
  <body>
     
      <%@include file="Include_Page/menubar.jsp" %>
     
       <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
</head>
<body>

<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
      <li data-target="#myCarousel" data-slide-to="5"></li>
      <li data-target="#myCarousel" data-slide-to="6"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
          <img src="image/Electronic/e1.jpeg" alt="" style="width:800px; height:450px;"/>
      </div>

      <div class="item">
        <img src="image/Electronic/e5.jpeg" alt="" style="width:800px; height:450px;"/>
      </div>
    
      <div class="item">
        <img src="image/furniture/f1.jpeg" alt="" style="width:800px; height:450px;"/>
      </div>

      <div class="item">
        <img src="image/furniture/f2.jpeg" alt="" style="width:800px; height:450px;"/>
      </div>
         <div class="item">
        <img src="image/Clothing/c1.jpeg" alt="" style="width:800px; height:450px;"/>
      </div>
         <div class="item">
        <img src="image/Clothing/c2.jpeg" alt="" style="width:800px; height:450px;"/>
      </div>
         <div class="item">
        <img src="image/footwear/fw2.jpg" alt="" style="width:800px; height:450px;"/>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div><br/><br/>
  <h2 style="color: purple"><i><u>Latest Product</u></i></h2>
  <br/>
  <div class="row">
      <div class="col-sm-4 col-lg-4 col-md-4">
          <div class="thumbnail">
              <img src="./image/Electronic/e5.jpeg" height="300px;" width="150px;">   
              <div class="caption">
                  <h4 class="pull-right">Rs 35000</h4> 
                  <a href="#"> <h4> Camera</h4></a>
              </div>
          </div>
      </div>   
      
       <div class="col-sm-4 col-lg-4 col-md-4">
          <div class="thumbnail">
              <img src="./image/footwear/fw2.jpg" height="100px;" width="150px;">   
              <div class="caption">
                  <h4 class="pull-right">Rs 1500</h4> 
                  <a href="#"> <h4>Leather Shoes</h4></a>
              </div>
          </div>
      </div>   
       <div class="col-sm-4 col-lg-4 col-md-4">
          <div class="thumbnail">
              <img src="./image/furniture/f1.jpeg" height="210px;" width="150px;">   
              <div class="caption">
                  <h4 class="pull-right">Rs 15700</h4> 
                  <a href="#"> <h4>Couch</h4></a>
              </div>
          </div>
      </div>   
      
      
  </div>
</div>

     
  <%@include file="Include_Page/Footer.jsp" %>
  </body>
</html>
