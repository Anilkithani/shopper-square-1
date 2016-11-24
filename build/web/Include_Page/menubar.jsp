



<nav class="nav navbar-inverse">

    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
            <span class="icon-bar"></span>    
            <span class="icon-bar"></span>  
            <span class="icon-bar"></span>      
        </button>
        <a class="navbar-brand" href="index.jsp">Shopper Square<br/><span class="aa">Your Shopping Zone</span></a>
    </div>
 
    <div class="collapse navbar-collapse" id="myNav">
        <ul class="nav navbar-nav ">
            <li ><a href="index.jsp">Home</a></li>
            <li><a href="Electronics.jsp">Electronics</a></li>
            <li><a href="Footwear.jsp">Footwear</a></li>
            <li><a href="furniture.jsp">Home&Furniture</a></li>
            <li><a href="#">Clothing</a></li>
            <li><a href="contact.jsp">Contact</a></li>
            <li><a href="aboutUs.jsp">About Us</a></li>
        </ul>   
     
        <div class="input-group navbar-header">
            <%--  This glyphicon-serch class coming from bootstrap framework for search the product   --%>
            <input type="text" class="form-control" placeholder="Product Search here...">
            <span class="input-group-addon"><span class="glyphicon glyphicon-search"></span> </span>
        </div>
        <ul class="nav navbar-nav navbar-right">
            
            
                         <%-- This is getAttribut method check here user login or not if user not login then show only sign and 
                   login link. and user aready log in then only show logout and update profile link.view cart link show both situation--%>
         
                         
                         
            <%if(session.getAttribute("username")==null){  %>
            <li><a href="Register.jsp"><span class="glyphicon glyphicon-user"></span>Sign Up</a></li>
            <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span>Log in</a></li>
            
           <%--  This All glyphicon class coming from bootstrap framework    --%>
            
            <%}  else{   %>
            
            
                 <li><a href="Logout"><span class="glyphicon glyphicon-log-out"></span>Log out</a></li>
                 <li><a href="Profile.jsp"><span class="glyphicon glyphicon-usert"></span>Update Profile</a></li>
                 <li><a href="viewCart.jsp"><span class="glyphicon glyphicon-shopping-cart"></span>View cart</a></li>
                    <%}                 %>
            
        </ul> 
    </div>    
</nav>