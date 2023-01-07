
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    
    public Connection connectDB() throws ClassNotFoundException {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/livraria?user=root&password=";
            conn = DriverManager.getConnection(url);}
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"erro de conexão\n"+erro);
        }
        return conn;
    }
}
