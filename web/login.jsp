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
    </head>
  <body>
      <%@include file="Include_Page/Header.jsp" %>
      <%@include file="Include_Page/menubar.jsp" %>
   
      <form action="LoginServlet" method="Post">
  <div class="container">
   <div class="col-md-4  col-lg-8">
    <label><b>Name</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required><br>
    <label><b>Password</b></label>
    <input type="Password" placeholder="Enter Password" name="psw" required>
        
    <button type="submit">Login</button>
      <button type="reset">Reset</button>
      
    <p>If you are new user <a href="Register.jsp" >Click here</a></p><br/><br/>
   </div>
  </div>
</form>
  

          <%@include file="Include_Page/Footer.jsp" %> 
                        
    </body>
</html>
