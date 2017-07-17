
package sistematouchstore.v2.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ALBERTO
 */
public class ConectionDb {
    private final String URLSERVER="jdbc:mysql://127.0.0.1/";
    private final String DBNAME="prueba";
    private final String USERNAME="root";
    private final String PASSWORD="Samiloko99";
    
    
    public ConectionDb() {
      
    }

    public Connection getConection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URLSERVER+DBNAME, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"No se pudo conectar a la base  de datos");
        }
        return con;
    }
}
