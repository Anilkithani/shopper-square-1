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
 <style>
       #googleMap {
        height: 500px;
        width: 50%;
       float: right;
       padding-top: 25px;
       }
   
 </style>
  </head>
  
  <body>
     
      <div class="container-fluid">
  
        <%@include file="Include_Page/menubar.jsp" %>
        
        
        <div id="googleMap" style="height: 400px; width: 50%;"> </div>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAMHiSguhjFpzzTBlqxtqRaMzjdE26jB5I&callback=initMap"></script>
<script>
var myCenter = new google.maps.LatLng(19.085015, 72.908476);

function initialize() {
var mapProp = {
  center:myCenter,
  zoom:15,
  scrollwheel:false,
  draggable:false,
  mapTypeId:google.maps.MapTypeId.ROADMAP
  };

var map = new google.maps.Map(document.getElementById("googleMap"),mapProp);

var marker = new google.maps.Marker({
  position:myCenter,
  });

marker.setMap(map);
}

google.maps.event.addDomListener(window, 'load', initialize);
</script>

      
   
<div class="container" >
     <div class="col-md-4 col-md-4 col-md-4">
   <form id="contact_form" action="feedback.jsp" method="POST" >
      	
	<div class="row"><br/>
		<label for="name">Your Name:</label><br />
                <input  type="text" value="" size="30" placeholder="Faiz Khan" required/><br />
	</div>
	<div class="row">
		<label for="email">Your Email:</label><br />
                <input type="text" value="" size="30" placeholder="iamfaizkhan11@gmail.com" required/><br />
	</div>
	<div class="row">
		<label for="message">Your Message:</label><br />
                <textarea id="message" class="input" name="message" rows="5" cols="30" placeholder="This is best Shopping site" required></textarea><br />
	</div>
	 <button type="submit" class="Register-user">Send</button>
     </form>
    </div>

</div>
<br/><br/>
  
  <div class="row">
    <div class="col-sm-5">
      <p>Contact us and we'll get back to you within 24 hours.</p>
      <p><span class="glyphicon glyphicon-map-marker"></span> Mumbai, US</p>
      <p><span class="glyphicon glyphicon-phone"></span> +91 8976818432</p>
      <p><span class="glyphicon glyphicon-envelope"></span> iamfaizkhan11@gmail.com</p>
    </div>
    <div class="col-sm-7 slideanim">
</div>
  </div></div>
<%@include file="Include_Page/Footer.jsp" %>
</body>
</html>