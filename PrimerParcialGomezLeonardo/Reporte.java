import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Reporte {
    private int idReporte;
    private String detalles;
    private LocalDate fechaEmision;
    private ArrayList<Incidente> listaDeIncidentes;

    public Reporte(int idReporte, String detalles, LocalDate fechaEmision) {
        this.idReporte = idReporte;
        this.detalles = detalles;
        this.fechaEmision = fechaEmision;
        this.listaDeIncidentes = new ArrayList<>();
    }
    public int getIdReporte() {
        return idReporte;
    }
    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }
    public String getDetalles() {
        return detalles;
    }
    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    public LocalDate getFechaEmision() {
        return fechaEmision;
    }
    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    public ArrayList<Incidente> getListaDeIncidentes() {
        return listaDeIncidentes;
    }
    public void setListaDeIncidentes(ArrayList<Incidente> listaDeIncidentes) {
        this.listaDeIncidentes = listaDeIncidentes;
    }
}
