
package sistematouchstore.v2.Controlador;

import javax.swing.JOptionPane;
import sistematouchstore.v2.Modelo.FunctionSoftmor;
import sistematouchstore.v2.Modelo.Trabajador;
import sistematouchstore.v2.Modelo.TrabajadorDAO;


/**
 *
 * @author ALBERTO
 */
public class UsuariosControler  {
     FunctionSoftmor softmor = new FunctionSoftmor();
   
     
    // Metodo que inserta en la base de datos un empleado 
    public boolean isert(Trabajador t){
        boolean continuar = false;
        TrabajadorDAO userDao = new TrabajadorDAO();
        
        if(t.getNombre().equals("") || t.getUser().equals("") || t.getPass().equals(""))
            JOptionPane.showMessageDialog(null,"Todos los campos son requeridos","MENSAJE DE ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        else if(softmor.isSearch(t.getNombre(), "usuario", "nombre"))
            JOptionPane.showMessageDialog(null, "El usuario ya existe");
        else{
                userDao.insert(t);
                JOptionPane.showMessageDialog(null,"Registro correcto");
                continuar= true;
        }
        return continuar;
    }
    // Metodo que busca un empleado de acuerdo a userName
     public Trabajador search(Trabajador t){
        TrabajadorDAO userDao = new TrabajadorDAO();
        
        if(t.getUser().equals(""))
            JOptionPane.showMessageDialog(null,"El campo es obligatorio para la busqueda","MENSAJE DE ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        else{
                if(userDao.obtenerPorUser(t.getUser())!=null)
                    t = userDao.obtenerPorUser(t.getUser());
                else
                    JOptionPane.showMessageDialog(null,"El usuario no existe");
        }
        return t;
    }
         
}
    
    

