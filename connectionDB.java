

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connectionDB {
    public static void main(String[] args) {
        String sql = "SELECT email FROM userinfo";
        String url = "jdbc:mysql://localhost:3306/delivery";
        String username = "root";
        String password = "sanjay007";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while (rs.next()) 
             {
                String email = rs.getString("email");
                System.out.println("Email: " + email);
            }
        } 
        catch(SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
