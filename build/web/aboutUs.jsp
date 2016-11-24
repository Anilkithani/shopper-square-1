<%-- 
    Document   : aboutUs
    Created on : 20-Nov-2016, 16:12:44
    Author     : Faiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopper Square</title>
         <%@include file="Include_Page/Header.jsp" %>
      <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
   <link rel="stylesheet" href="./Assets/css/bootstrap.css" >
   <link rel="stylesheet" href="./Assets/css/Main.css">
    
    </head>
    <body>
       
          <%@include file="Include_Page/menubar.jsp" %>
          <br/><br/>
          
          <div  class="container-fluid">
              <div id='founder'>   
                  <h3>Founder</h3>  
                  <%-- <img src="image/other/fr1.jpg" alt="Faiz khan" height="400px" width="300px"><BR/>--%>
                    Name: FAIZ KHAN<BR/>AGE:19<BR/>DOB:28/07/1997  </div>
              <div class="row">
                  <div class="col-sm-6">
                      <h2 style="color: red">About the Company</h2> 
                      <h3 style="color:blue"><i><b>Shopper Square's vision is to create India's most reliable and frictionless
                          commerce ecosystem that creates life-changing experiences for buyers and sellers.<br/>
                      
                      In November 2016, Faiz khan , started Shopper Square.com - India's largest online 
                      marketplace, with the widest assortment of 10  plus products across 1 plus diverse categories 
                      from over  national, and international brands and retailers.
                              </b> </i>  </h3>  
                     <br/><br/><br/>
                     <h2 style="color:magenta ">What our customers say</h2><br/><br/>
  <div id="myCarousel" class="carousel slide text-center" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <h4>"This Shopper Square is the best. I am so happy with the result!"<br><span style="font-style:normal;">Khozima nullwala , CEO, NIIT</span></h4>
      </div>
      <div class="item">
        <h4>"Awesome... WOW!!"<br><span style="font-style:normal;">Shoib , hardware, NIIT(GKP)</span></h4>
      </div>
      <div class="item">
        <h4>"Could I... BE any more happy with this Shopping site?"<br><span style="font-style:normal;">Sahil khan, Builder,cityjim </span></h4>
      </div>
    </div>
                
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div></div>   
                  
                  
              </div>
              
              
              
          </div>
          
          
          
          
          
          
            <%@include file="Include_Page/Footer.jsp" %>
    </body>
</html>
