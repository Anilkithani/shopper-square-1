/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Model.Product;
import java.sql.*;

public class CartItemDao {
    private Connection con;
    public CartItemDao(){
        
    }
    public void addProduct(Product prod){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:XE","hr","hr");
            PreparedStatement ps;
            ps = con.prepareStatement("insert into cart_item select p_id,p_name,p_price,p_quantity from E_product values(?,?,?,?)");
            ps.setString(1, prod.getProductid());
            System.out.println("conneted");
            ps.setString(2, prod.getProductname());
            ps.setDouble(3, prod.getPrice());
            ps.setInt(4, prod.getQuantity());
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
}
