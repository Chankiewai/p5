package p5;

import java.sql.*;

class Main 
{  
       public static void main(String args[]) 
       {  
       try  
       { 
            // Load the SQLServerDriver class, build the 
            // connection string, and get a connection 

            String connectionUrl = "jdbc:sqlserver://CHANWAI\\SQLEXPRESS;databaseName=p5;integratedSecurity=true";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
 
            
            Connection con = DriverManager.getConnection(connectionUrl); 
            System.out.println("Connected.");

            // Create and execute an SQL statement that returns some data.  
            String SQL = "SELECT * FROM Reiziger";  
            Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.  
            while (rs.next())  
            {  
               System.out.println(rs.getString(1) + " " + rs.getString(2));  
            }

       }  
       catch(Exception e)  
       { 
            System.out.println(e.getMessage()); 
            System.exit(0);  
       } 
    } 
}