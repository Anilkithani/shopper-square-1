<%-- 
    Document   : Register
    Created on : 13-Oct-2016, 10:18:50
    Author     : Faiz 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>Shopper_Square</title>
      <%@include file="Include_Page/Header.jsp" %>
  <body>
    
      <%@include file="Include_Page/menubar.jsp" %>
   
    
       

      <form action="RegisterUser" method="Post">
  <div class="container">
     <div class="col-md-4  col-lg-8">
    <label><b>User Name</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>
    <br/>
     <label><b>Contact</b></label>
    <input type="text" placeholder="Enter Contact no" name="contact" required>
    <br/>
     <label><b>Address</b></label>
    <input type="text" placeholder="Enter  Address" name="address" required>
    <br/>
    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
    <br/>
    <label><b>Re-Password</b></label>
    <input type="password" placeholder="Enter Re-type Password" name="re-psw" required>
        
    <button type="submit" class="Register-user">Register</button>
     <button type="reset" class="Register-user">Reset</button>
     <p>if you are already register <a href="login.jsp">click here</a></p>
         
     </div>
  </div>

 
</form>

           <%@include file="Include_Page/Footer.jsp" %> 
                        
    </body>
</html>
