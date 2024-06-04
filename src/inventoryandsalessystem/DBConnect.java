/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventoryandsalessystem;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;


/**
 *
 * @author thasi
 */
public class DBConnect {
    private Statement stmt=null;
    private Connection con;
    public DBConnect()
    {
        
    }
    public void connectToDB() throws SQLException, ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection(  
             "jdbc:mysql://localhost:3306/inventorysystem","root",""); 
            System.out.println("Connected Database successfully...");
            java.sql.Statement stmt= con.createStatement();
            
            ResultSet rs=stmt.executeQuery("select * from login");  
            while(rs.next())  
            System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
             
            
            
        }catch(SQLException se){System.out.println(se.getMessage()); }
    }
    public void disconnectFromDB()
    {
        try{
            if(stmt!= null){stmt.close();}
            if(con!= null){con.close();}
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"unable to close connection..");
        }
    }
 
    public ResultSet getDatafromDB(String query){
        ResultSet rs=null;
        try{
           java.sql.Statement stmt=con.createStatement();
           rs=stmt.executeQuery(query);
           ResultSetMetaData rsmd=rs.getMetaData();
           
           return rs;
        }
        catch(SQLException e){return rs; }
    }
    public boolean insertDataToDB(String query)
    {
        try{
            java.sql.Statement stmt =con.createStatement();
            stmt.executeUpdate(query);
            return true;
            
        }
        catch(SQLException ex){
           return false; 
        }
    }
    
}
