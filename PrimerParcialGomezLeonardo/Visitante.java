import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Visitante {
    private String nombre;
    private int dni;
    private int edad;
    private ArrayList<Entrada> listaDeEntradas;
    private Ticket ticket;

    public Visitante(String nombre, int dni, int edad) {
        this.ticket = ticket;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.listaDeEntradas = new ArrayList<>();
        listaDeEntradas.add(new Entrada(LocalDate.now(), LocalTime.now()));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Entrada> getListaDeEntradas() {
        return listaDeEntradas;
    }

    public void setListaDeEntradas(ArrayList<Entrada> listaDeEntradas) {
        this.listaDeEntradas = listaDeEntradas;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
