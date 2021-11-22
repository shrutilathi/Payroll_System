import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conn {
    
    public Connection c;
    public Statement s;
    
    public conn() 
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            s=c.createStatement();
        } 
        catch(Exception e){
            e.printStackTrace();
        }
    }
     public static void main(String[] args)
    {
        new conn();
    }
}
