import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Entrada {
    private LocalDate fecha;
    private LocalTime hora;

    public Entrada(LocalDate fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
