
package sistematouchstore.v2.Modelo;

/**
 *
 * @author ALBERTO
 */
public class Venta extends Producto {

    

    private int folio_venta;
    private double total;
    private String fechaventa;

    public Venta() {

    }

    public int getFolio_venta() {
        return folio_venta;
    }

    public void setFolio_venta(int folio_venta) {
        this.folio_venta = folio_venta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFechaVenta() {
        return fechaventa;
    }

    public void setFechaVenta(Softmor s) {
        this.fechaventa = s.getFechaActual();
    }

}
