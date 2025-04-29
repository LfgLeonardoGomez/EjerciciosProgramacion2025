import java.time.LocalDate;

public class Venta {
private LocalDate fecha;
private Cliente cliente;
private Pago pago;
private Funcion funcion;

public Venta(LocalDate fecha, Cliente cliente, Pago pago, Funcion funcion) {
    this.funcion = funcion;
    this.fecha = fecha;
    this.cliente = cliente;
    this.pago = pago;
}
public LocalDate getFecha() {
    return fecha;
}
public void setFecha(LocalDate fecha) {
    this.fecha = fecha;}
public Cliente getCliente() {
    return cliente;}
public void setCliente(Cliente cliente) {
    this.cliente = cliente;}
public Pago getPago() {
    return pago;}
public void setPago(Pago pago) {
    this.pago = pago;
}
public Funcion getFuncion() {
    return funcion;}
public void setFuncion(Funcion funcion) {
    this.funcion = funcion;}
}
