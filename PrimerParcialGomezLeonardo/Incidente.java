import java.sql.Date;
import java.time.LocalDate;

public class Incidente {
    private LocalDate fecha;
    private String descripcion;
    private EstadoDeIncidente estado;
    private Atraccion atraccion;
    private Visitante visitante;

    public Incidente(LocalDate fecha, String descripcion, EstadoDeIncidente estado, Atraccion atraccion, Visitante visitante) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.atraccion = atraccion;
        this.visitante = visitante;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public EstadoDeIncidente getEstado() {
        return estado;
    }
    public void setEstado(EstadoDeIncidente estado) {
        this.estado = estado;
    }
    public Atraccion getAtraccion() {
        return atraccion;
    }
    public void setAtraccion(Atraccion atraccion) {
        this.atraccion = atraccion;
    }
    public Visitante getVisitante() {
        return visitante;
    }
    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }
    @Override
    public String toString() {
        return 
                "fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", atraccion=" + atraccion 
                ;
    }
  
}
