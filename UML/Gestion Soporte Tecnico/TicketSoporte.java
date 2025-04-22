
import java.time.LocalDate;

public class TicketSoporte{
    private static int contador=0;
    private int idTicket;
    private String descripcion;
    private enum Estado {ABIERTO, ENPROCESO, CERRADO};
    private Estado estado;
    private LocalDate fechaCreacion;

     public TicketSoporte(String descripcion) {
        this.descripcion = descripcion;
        this.estado = Estado.ABIERTO;
        this.fechaCreacion = LocalDate.now();
        this.idTicket = ++contador;
       // idTicket++;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    
    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
       @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TicketSoporte{");
        sb.append("idTicket=").append(idTicket);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", estado=").append(estado);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append('}');
        return sb.toString();
    }

    public void cerrarTicket() {
        this.estado = Estado.CERRADO;
    }
    public void mostrarDetalle() {
        System.out.println("------------------------------");
        System.out.println("ID Ticket: " + idTicket);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Estado: " + estado);
        System.out.println("Fecha de creación: " + fechaCreacion);
        System.out.println("------------------------------");
    }
}

