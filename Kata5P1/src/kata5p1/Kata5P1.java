package kata5p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import static kata5p1.CrearTabla.createNewTable;

public class Kata5P1 {
    public static void main(String[] args) {
        SelectApp app = new SelectApp();
        app.selectAll();
        createNewTable("EMAIL");
        
        List<String> arr = null;
        try {
            arr = new MailListReader().read("email.txt");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        String sql = "INSERT INTO EMAIL(Mail) values (?)";
        for (String s : arr) {
            try (Connection conn = DriverManager.getConnection("jdbc:sqlite:Kata5.db");
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, s);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        
    }
}
