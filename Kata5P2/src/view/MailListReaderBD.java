package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

public class MailListReaderBD {
    public List<Mail> read() {
        List<Mail> arr = new ArrayList<Mail>();
        String sql = "SELECT * FROM EMAIL";
        
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:Kata5.db");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                arr.add(new Mail(rs.getString("Mail")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return arr;
    }

    public MailListReaderBD() {
    }    
}
