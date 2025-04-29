import java.time.LocalDate;

public class Compra {
    private LocalDate fechaCompra;
    private Proveedor proveedor;
    private Insumo insumo;

    public Compra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
        this.insumo = new Insumo("Insumo", 0.0); // Default insumo
    }
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }   
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public Insumo getInsumo() {
        return insumo;
    }
    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

}
