package sistematouchstore.v2.Modelo;

/**
 *
 * @author ALBERTO
 */
public class Cliente extends Persona {

    private String codigo;

    public Cliente(String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
    }

    public Cliente() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;

    }

}
