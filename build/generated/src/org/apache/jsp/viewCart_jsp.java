package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Product;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public final class viewCart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Include_Page/Header.jsp");
    _jspx_dependants.add("/Include_Page/menubar.jsp");
    _jspx_dependants.add("/Include_Page/Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Shopper Square</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Shopper_Square</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"./Assets/css/bootstrap.css\" >\n");
      out.write("    <link rel=\"stylesheet\" href=\"./Assets/css/Main.css\">\n");
      out.write("    <script src=\"./Assets/js/jquery-3.1.1.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"./Assets/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"nav navbar-inverse\">\n");
      out.write("\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("            <span class=\"icon-bar\"></span>    \n");
      out.write("            <span class=\"icon-bar\"></span>  \n");
      out.write("            <span class=\"icon-bar\"></span>      \n");
      out.write("        </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\">Shopper Square<br/><span class=\"aa\">Your Shopping Zone</span></a>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNav\">\n");
      out.write("        <ul class=\"nav navbar-nav \">\n");
      out.write("            <li ><a href=\"index.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"Electronics.jsp\">Electronics</a></li>\n");
      out.write("            <li><a href=\"Footwear.jsp\">Footwear</a></li>\n");
      out.write("            <li><a href=\"#\">Home&Furniture</a></li>\n");
      out.write("            <li><a href=\"#\">Clothing</a></li>\n");
      out.write("            <li><a href=\"#\">Contact</a></li>\n");
      out.write("            <li><a href=\"#\">About Us</a></li>\n");
      out.write("        </ul>   \n");
      out.write("       \n");
      out.write("      \n");
      out.write("        <div class=\"input-group navbar-header\">\n");
      out.write("            \n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Product Search here...\">\n");
      out.write("            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-search\"></span> </span>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            ");
if(session.getAttribute("username")==null){  
      out.write("\n");
      out.write("            <li><a href=\"Register.jsp\"><span class=\"glyphicon glyphicon-user\"></span>Sign Up</a></li>\n");
      out.write("            <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span>Log in</a></li>\n");
      out.write("            ");
}  else{   
      out.write("\n");
      out.write("                 <li><a href=\"Logout\"><span class=\"glyphicon glyphicon-log-out\"></span>Log out</a></li>\n");
      out.write("                 <li><a href=\"Profile.jsp\"><span class=\"glyphicon glyphicon-usert\"></span>Update Profile</a></li>\n");
      out.write("                    ");
}                 
      out.write("\n");
      out.write("            <li><a href=\"viewCart.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\"></span>View cart</a></li>\n");
      out.write("        </ul>  \n");
      out.write("\n");
      out.write("    </div>    \n");
      out.write("</nav>");
      out.write(" \n");
      out.write("        \n");
      out.write("        <br/><br/>\n");
      out.write("        \n");
      out.write("        <h2 align=\"center\"><u>Your Shopping Cart</u></h2><br/><br/>\n");
      out.write("        <br/>\n");
      out.write("       <a href=\"Electronics.jsp\"><font size=\"10%\" />Continue Shopping</a><br/><br/>\n");
      out.write("        <table align=\"center\" cellpadding=\"20\" cellspacing=\"20\" border=\"3\">\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                 <th>P Id</th>\n");
      out.write("                  <th>P Name</th>\n");
      out.write("                   <th>P Price</th>\n");
      out.write("                    <th>P Quantity</th>\n");
      out.write("                     <th>Sub Total</th>\n");
      out.write("                     <th colspan=\"2\">Option</th>\n");
      out.write("            </tr>  \n");
      out.write("        ");
   
          try {
                                     Class.forName("oracle.jdbc.OracleDriver");
                                     Connection con;
                                     con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
                                        
                                Statement st ;
                                       ResultSet rs; 
                                   st =  con.createStatement();
                                   rs = st.executeQuery("select * from cart_item");
                                    while(rs.next()){
        
        
                                    
        
        
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("                       <tr>\n");
      out.write("                           \n");
      out.write("                           <td>");
      out.print(rs.getString("p_id"));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString("p_name"));
      out.write("</td>\n");
      out.write("                              <td>");
      out.print(rs.getString("p_price"));
      out.write("</td>\n");
      out.write("                              <td>");
      out.print(rs.getString("p_quantity"));
      out.write("</td>\n");
      out.write("                              ");
      out.write("\n");
      out.write("                              <td><a href=\"CartController?pid=delete&userId=\"");
      out.print(rs.getString("p_id"));
      out.write(">Delete</a></td>\n");
      out.write("                       </tr>        \n");
      out.write("                   \n");
      out.write("        </table>\n");
      out.write("   <br/><br/><br/>\n");
      out.write("     ");
 }
      out.write("\n");
      out.write("      ");
  }catch(SQLException e){
  e.printStackTrace();
}
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("         <title>Shopper_Square</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"./Assets/css/bootstrap.css\" >\n");
      out.write("   <link rel=\"stylesheet\" href=\"./Assets/css/Main.css\">\n");
      out.write("   <script src=\"./Assets/js/jquery-3.1.1.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"./Assets/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"col-md-12 text-center\">\n");
      out.write("                <h3 class=\"text-uppercase\">Shopper Square</h3>  \n");
      out.write("                <p class=\"monospaced\">\n");
      out.write("                    &copy;2016 Shopper Square Inc. \n");
      out.write("                    <span class=\"text-uppercase\">ALL RIGHTS RESERVED</span></p></div>\n");
      out.write("                    \n");
      out.write("                        <ul class=\" Social\">\n");
      out.write("                        <li><a href=\"www.facebook.com\"><img src=\"image/other/fb.png\" alt=\"\" height=\"40px;\" width=\"40px;\"></a></li>\n");
      out.write("                        <li><a href=\"www.twitter.com\"><img src=\"image/other/tw.png\" alt=\"\" height=\"40px;\" width=\"40px;\"></a></li>\n");
      out.write("                        </ul>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("                 \n");
      out.write("            \n");
      out.write("   \n");
      out.write("        \n");
      out.write("       </body></html>");
      out.write(" \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
