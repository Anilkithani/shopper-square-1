<%-- 
    Document   : adminAddProduct
    Created on : 15-Nov-2016, 17:40:40
    Author     : Faiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product</title>
          <%@include file="Include_Page/Header.jsp" %>
    </head>
    <body>
      
        <%@include file="Include_Page/menubar.jsp" %>
        
        <h3 color="green">Add New Electronics Product</h3>
        <form action="AdminController" method="post" >
            <div class="container">
                 <div class="col-md-4  col-lg-8">
                 
                <input type="text" placeholder="Enter product id" name="productid" required>
                <br/>
              
                <input type="text" placeholder="Enter Product name" name="productname" required>
                <br/>
             
                <input type="text" placeholder="Enter Product Category" name="category" required>
                <br/>
         
                <input type="text" placeholder="Enter Product Description" name="description" required>
                <br/>
                
                <input type="text" placeholder="Enter Product Price" name="price" required>
                <br/>
                <input type="text" placeholder="Enter Product Quantity" name="quantity" required>
                <button type="submit" name="adminPage" value="" >Add Product</button> 
                <button type="reset" name="adminPage">Reset Detail</button>
             </div>
            </div>
        </form>           
        <a href="admin.jsp">Back to Admin Page</a>
        <%@include file="Include_Page/Footer.jsp" %>
        
    </body>
</html>
