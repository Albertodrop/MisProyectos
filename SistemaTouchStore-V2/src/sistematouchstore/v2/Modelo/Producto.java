package sistematouchstore.v2.Modelo;

/**
 *
 * @author ALBERTO
 */
public class Producto {

    private String categoria, nombre, descripcion, codigo;
    private double precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(String categoria, String nombre, String descripcion, String codigo, double precio, int cantidad) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
