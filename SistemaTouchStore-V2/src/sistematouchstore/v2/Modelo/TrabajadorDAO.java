package sistematouchstore.v2.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author ALBERTO
 */
public class TrabajadorDAO implements DAO <String,Trabajador>{
   private final String SQLINSERT ="INSERT INTO usuario (nombre,user,pass) VALUES (?,?,?)";   
   private final String SQLUPDATE="UPDATE usuario SET nombre = ?, user = ?, pass =? WHERE user = ?";
   private final String SQLDELETE="";
   private final String SQLSEARCH="SELECT nombre,user FROM usuario WHERE user = ?";
   private Connection con;
   private PreparedStatement pps;
   private ResultSet rs;

   @Override
    public boolean insert(Trabajador o) {
        try{
            con = new ConectionDb().getConection();
            pps = con.prepareStatement(SQLINSERT);
            pps.setString(1,o.getNombre());
            pps.setString(2,o.getUser());
            pps.setString(3,o.getPass());
            pps.executeUpdate();
       }catch(SQLException e){System.out.println(e);} 
        
        finally{closeConection();}    
    }

    @Override
    public boolean update(Trabajador o) {
       try{
           con = new ConectionDb().getConection();
           pps = con.prepareStatement(SQLUPDATE);
           pps.setString(1,o.getNombre());
           pps.setString(2,o.getUser());
           pps.setString(3,o.getPass());
           pps.setString(4,o.getUser());
           pps.executeUpdate();
       }catch(SQLException e){}
       
       finally{closeConection();}
    }

    @Override
    public boolean delate(Trabajador o) {
        
    }

    @Override
    public Trabajador obtenerPorUser(String S) {
       Trabajador t = null;
        try{
            con = new ConectionDb().getConection();
            pps = con.prepareStatement(SQLSEARCH);
            pps.setString(1, S);
            rs = pps.executeQuery();
            while(rs.next()){
                t = new Trabajador();
                t.setNombre(rs.getString("nombre"));
            }
        }catch(SQLException e){}
        
        finally{closeConection();}
        
        return t;
    }
    
    private void closeConection(){
        try{
            if(rs!=null)
                rs.close();
            if(pps!=null)
                pps.close();
            if(con!=null)
                con.close();
        }catch(SQLException e){}
    }
   
}
