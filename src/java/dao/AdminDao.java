/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Model.Product;
import java.sql.*;
import java.util.*;

public class AdminDao {
    private Connection con;
     public AdminDao(){
         
     }
     public void addProduct(Product prod){
        
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
            PreparedStatement ps;
            ps = con.prepareStatement("insert into E_Product(p_id,p_name,p_category,p_description,p_price,p_quantity) values(?,?,?,?,?,?)");
            ps.setString(1, prod.getProductid());
            ps.setString(2, prod.getProductname());
            ps.setString(3, prod.getCategory());
            ps.setString(4, prod.getDescription());     
            ps.setDouble(5, prod.getPrice());
            ps.setInt(6, prod.getQuantity());
           // System.out.println("sfjhfhbxbbb");
          int i=  ps.executeUpdate();
           
            
        }catch(SQLException |ClassNotFoundException e){
            System.out.println(e);
        }
    }
    public void deleteProduct(String productId){
        try{
             
             Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
             
            PreparedStatement ps = con.prepareStatement("delete from E_product where p_id=?");
        //parameter start with 1
            ps.setString(1, productId);
           ps.executeUpdate();
        }catch(SQLException |ClassNotFoundException e){
            System.out.println(e);
            
        }
    }
public void updateProduct(Product prod){
    try{
         
             Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
             
        
        PreparedStatement ps = con.prepareStatement("update e_product set p_name=?,p_category=?,p_description=?,p_price=?,p_quantity=?"+ " where p_id=?");
ps.setString(1, prod.getProductname());
ps.setString(2, prod.getCategory());
ps.setString(3, prod.getDescription());
ps.setDouble(4, prod.getPrice());
ps.setInt(5, prod.getQuantity());
ps.setString(6, prod.getProductid());
    ps.executeUpdate();
    }catch(SQLException | ClassNotFoundException e){
        System.out.println(e); 
    }
}
     public List<Product> getAllProducts(){
         List<Product> pro = new ArrayList<Product>();
         try {
             
             Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
             
            PreparedStatement ps = con.prepareStatement("select * from E_product");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 Product p = new Product();
                 p.setProductid(rs.getString("p_id"));
                 p.setProductname(rs.getString("p_name"));
                 p.setCategory(rs.getString("p_category"));
                 p.setDescription(rs.getString("p_description"));
                 p.setPrice(rs.getDouble("p_price"));
                 p.setQuantity(rs.getInt("p_quantity"));
                 pro.add(p);
                 
             } 
      
         }catch(SQLException | ClassNotFoundException e){
             System.out.println(e);
             e.getMessage();
         }return  pro;
     }
     public Product getProductById(String productId){
         Product p = new Product();
         try{
             
              
             Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
             
             
             PreparedStatement ps = con.prepareStatement("select * from E_Product where p_id=?");
             ps.setString(1, "productId");
           ResultSet rs =  ps.executeQuery();
             if(rs.next()){
                 p.setProductid(rs.getString("productid"));
                 p.setProductname(rs.getString("productname"));
                 p.setProductname(rs.getString("category"));
                 p.setProductname(rs.getString("description"));
                 p.setPrice(rs.getDouble("price"));
                 p.setQuantity(rs.getInt("quantity"));
                 
             }
             
         }catch(SQLException |ClassNotFoundException  e){
             System.out.println(e);
         }
         return p;
     }
}
