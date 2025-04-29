import java.time.LocalDate;
import java.util.ArrayList;

public class Funcion {
    private LocalDate fecha;
    private Pelicula pelicula;
    private ArrayList<Entrada> entradas;

    public Funcion(LocalDate fecha, Pelicula pelicula) {
        this.fecha = fecha;
        this.pelicula = pelicula;
        this.entradas = new ArrayList<>();
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }
    public void setEntradas(ArrayList<Entrada> entradas) {
        this.entradas = entradas;
    }

}
