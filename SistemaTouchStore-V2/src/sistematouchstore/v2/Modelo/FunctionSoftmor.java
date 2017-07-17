package sistematouchstore.v2.Modelo;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author ALBERTO
 */
public class FunctionSoftmor {

    public FunctionSoftmor() {

    }
    // Metodos para la personalizacion de botones

    /**
     *
     * @param btn Boton al que se le aplicara la personalizacion Requiere como
     * parametro un boton
     *
     */
    public void parensButton(JButton[] btn) {
        for (JButton btn1 : btn) {
            btn1.setForeground(Color.red);
            btn1.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));

        }

    }

    // Metodos para la personalizacion de campos de textos
    public void parensFields() {

    }

    /**
     *
     * @param txt Recibe el arreglo de JTextField
     * @param max Recibe lalongitud maxima de caracteres que se podran
     * introducir en el mismo
     */
    // Metodo que limita la longitud de letras introducidas en un campo de texto
    public void limitLetter(JTextField[] txt, int max) {
        for (JTextField txt1 : txt) {
            txt1.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    String nombre = txt1.getText();
                    if (nombre.length() >= max) {
                        txt1.setToolTipText("La longitud de caracteres no esta permitida");
                        evt.consume();
                    }
                }
            });
        }
    }

    /**
     *
     * @param txt Recibe el arreglo de JTextField
     *
     */
    // Metodo que limita la longitud a 20 letras introducidas en un campo de texto
    public void limitLetter(JTextField[] txt) {
        for (JTextField txt1 : txt) {
            txt1.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    String nombre = txt1.getText();
                    if (nombre.length() >= 20) {
                        txt1.setToolTipText("La longitud de caracteres no esta permitida");
                        evt.consume();
                    }
                }
            });
        }
    }

    private Connection con;
    private PreparedStatement pps;
    private ResultSet rs;

    /**
     *
     * @param nameCampo Recibe el nombre del objto a buscar
     * @param nameTable Recibe el nombre de la tabla en donde va a buscar
     * @param nameAtributo Recibe el nombre del atributo de la tabla a buscar
     * @return retorna un true en caso de que el objeto sea encontrado Metodo
     * que sirve para la busqueda de un registro en una tabla
     */
    public boolean isSearchString(String nameCampo, String nameTable, String nameAtributo) {
        final String SQLSEACRH = "SELECT " + nameAtributo + " FROM " + nameTable + " WHERE " + nameAtributo + " = ?";
        String encontrado = "";
        try {
            openConnection(SQLSEACRH);
            pps.setString(1, nameCampo);
            rs = pps.executeQuery();
            while (rs.next()) {
                encontrado = rs.getString(nameAtributo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FunctionSoftmor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
        return encontrado.equals(nameCampo);
    }

    public boolean isSearchInt(int nameCampo, String nameTable, String nameAtributo) {
        final String SQLSEACRH = "SELECT " + nameAtributo + " FROM " + nameTable + " WHERE " + nameAtributo + " = ?";
        int encontrado = 0;
        try {
            openConnection(SQLSEACRH);
            pps.setInt(1, nameCampo);
            rs = pps.executeQuery();
            while (rs.next()) {
                encontrado = rs.getInt(nameAtributo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FunctionSoftmor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
        return encontrado == nameCampo;
    }

    private void openConnection(String sql) {
        try {
            con = new ConectionDb().getConection();
            pps = con.prepareStatement(sql);
        } catch (SQLException ex) {

        }
    }

    private void closeConnection() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pps != null) {
                pps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {

        }

    }

}
