<%-- 
    Document   : 403
    Created on : 13-Oct-2016, 10:25:31
    Author     : Faiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include  file="Include_Page/Header.jsp" %>
            <%@include  file="Include_Page/menubar.jsp" %>
        <div class="container">
        <h2>Sorry, Your Registration/login is failed or Invalid login credentials or Both Password do not match<br></h2>
        <a href="Register.jsp" class="btn btn-lg btn-info">Go to Register</a><br/><br/>
         <a href="login.jsp" class="btn btn-lg btn-info">Go to Login</a>
        </div>
        
            <%@include  file="Include_Page/Footer.jsp" %>
    </body>
</html>
