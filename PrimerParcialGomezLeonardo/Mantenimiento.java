import java.time.LocalDate;
import java.util.Date;

public class Mantenimiento {
    private LocalDate fecha;
    private String observacion;

    public Mantenimiento(LocalDate fecha, String observacion) {
        this.fecha = fecha;
        this.observacion = observacion;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
