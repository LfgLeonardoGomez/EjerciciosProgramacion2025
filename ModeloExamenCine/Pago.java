public class Pago {
    private double monto;
    private FormaDePago formaDePago;

    public Pago(double monto, FormaDePago formaDePago) {
        this.monto = monto;
        this.formaDePago = formaDePago;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public FormaDePago getFormaDePago() {
        return formaDePago;
    }
    public void setFormaDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }
}
