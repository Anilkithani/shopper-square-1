<%-- 
    Document   : checkOut
    Created on : 21-Nov-2016, 08:40:04
    Author     :Faiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopper Square</title>
        <%@include file="Include_Page/Header.jsp" %>
    </head>
    <body>
        
        <%@include file="Include_Page/menubar.jsp" %>
        
        <div class="container">
            <div class="col-md-4 col-lg-8">
          
            
                <form action="confirm.jsp" method="post">
    <div class="form-container checkout">
      
          
        <h1>Payment Information</h1>
       <!-- end of personal-information -->
      <input  type="text" name="streetaddress" placeholder="Street Address" required/><br/><br/>

      <input  type="text" name="city"  placeholder="City" required/><br/><br/>

      <input type="number" name="zipcode"  placeholder="ZIP code" required/><br/><br/>
      
      <input type="email" name="email" placeholder="Email" required/><br/><br/>
    
      <input type="text" name="first-name" placeholder="First Name" required/><br/><br/>
      
      <input  type="text" name="last-name" placeholder="Surname" required/><br/><br/>
      
      <input  type="number" name="number" placeholder="Card Number" required/><br/><br/>
     
      <input  type="date" name="expiry" placeholder="MM / YY" required/><br/><br/>
        
      <input type="number" name="cvc" placeholder="CCV" required/><br/><br/>
    
    <button type="submit" class="Register-user">Confirm</button>"
   <button type="reset" class="Register-user">Reset</button>
    </div>
  </form>
                  <p>Back to Cart Page <a href="viewCart.jsp">click here</a></p>
            </div></div>
       
   
       
     
     
     
   
        <%@include file="Include_Page/Footer.jsp" %>
    
    </body></html>
        
        
        
        
        
        
        
        
    </body>
</html>
