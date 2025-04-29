public  class ClienteVip extends Cliente {
    protected String descuento;

    public ClienteVip(String nombre, String apellido, String mail, String descuento) {
        super(nombre, apellido, mail);
        this.descuento = descuento;
    }
    public String getDescuento() {
        return descuento;
    }
    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }
}
