/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Model.Product;
import java.sql.*;
import java.util.*;

public class ProductDao {
    private Connection con;
     public ProductDao(){
         
     }
     public void addProduct(Product prod){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:XE","hr","hr");
            PreparedStatement ps;
            ps = con.prepareStatement("insert into cart_item select p_id,p_name,p_price,p_quantity from E_product");
           /* ps.setString(1, prod.getProductid());
            ps.setString(2, prod.getProductname());
            ps.setDouble(3, prod.getPrice());
            ps.setInt(4, prod.getQuantity());*/
            ps.executeQuery();
            
            
        }catch(SQLException |ClassNotFoundException e){
            System.out.println(e);
        }
    }
    public void deleteProduct(String productId){
        try{
            PreparedStatement ps = con.prepareStatement("delete from cart_item where p_id=?");
        //parameter start with 1
            ps.setString(1, productId);
           ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
    }
     public List<Product> getAllProducts(){
         List<Product> pro = new ArrayList<Product>();
         try{
             Class.forName("oracle.jdbc.OracleDriver");
             con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
             Statement st;
             st = con.createStatement();
             ResultSet rs = st.executeQuery("select * from E_Product");
             while(rs.next()){
                 Product p = new Product();
                 p.setProductid(rs.getString("productid"));
                 p.setProductname(rs.getString("productname"));
                 p.setPrice(rs.getDouble("price"));
                 p.setQuantity(rs.getInt("quantity"));
                 pro.add(p);
                 
             }
      
         }catch(SQLException |ClassNotFoundException e){
             System.out.println(e);
         }return  pro;
     }
     public Product getProductById(String productId){
         Product p = new Product();
         try{
             PreparedStatement ps = con.prepareStatement("select * from E_Product where p_id=?");
             ps.setString(1, "productId");
           ResultSet rs =  ps.executeQuery();
             if(rs.next()){
                 p.setProductid(rs.getString("productid"));
                 p.setProductname(rs.getString("productname"));
                 p.setPrice(rs.getDouble("price"));
                 p.setQuantity(rs.getInt("quantity"));
                 
             }
             
         }catch(SQLException  e){
             System.out.println(e);
         }
         return p;
     }
}
