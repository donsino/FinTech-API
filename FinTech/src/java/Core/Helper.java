package Core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


class Helper {
    int user_id;
    int Course_ID;
    int paymentID;
    
    public double Entroll(){
    try(Connection conn = getDBConnection()){
            String query = "";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, ""); 
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return rs.getDouble("");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    
  }
    
  //<editor-fold defaultstate="collapsed" desc="DB Connection">
    public Connection getDBConnection() throws ClassNotFoundException,
            SQLException{
        String username = "root";
        String password = "marame123";
        String url = "jdbc:mysql://localhost:3306/fintech?useSSL=false";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }//</editor-fold>  
}
