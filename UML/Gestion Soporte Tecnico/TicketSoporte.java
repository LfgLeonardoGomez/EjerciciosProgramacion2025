
import java.time.LocalDate;

public class TicketSoporte{
    private static int contador=0;
    private int idTicket;
    private String descripcion;
    private Estado estado = Estado.ABIERTO;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private Tecnico tecnico;

     public TicketSoporte(String descripcion) {
        this.descripcion = descripcion;
        this.estado = Estado.ABIERTO;
        this.fechaCreacion = LocalDate.now();
        this.idTicket = ++contador;
    }

    
    public TicketSoporte(String descripcion, Usuario usuario) {
        this.descripcion = descripcion;
        this.estado = Estado.ABIERTO;
        this.fechaCreacion = LocalDate.now();
        this.idTicket = ++contador;
        this.usuario = usuario;
    }

    

    public Tecnico getTecnico() {
        return tecnico;
    }


    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public Usuario getUsuario() {
        return usuario;
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
        if(usuario != null) {
            System.out.println("Usuario: " + usuario.getNombre() + " " + usuario.getApellido());
        } else {
            System.out.println("Usuario: No asignado");
        }
        System.out.println("------------------------------");
        if(tecnico != null) {
            System.out.println("Técnico asignado: " + tecnico.getNombre() + " " + tecnico.getApellido() );
        } else {
            System.out.println("Técnico asignado: No asignado");
        }
          System.out.println("------------------------------");
    }

    public void asignarTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
        this.estado = Estado.ENPROCESO;
    }
}

