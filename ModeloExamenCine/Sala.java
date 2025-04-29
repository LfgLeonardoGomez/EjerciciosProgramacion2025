import java.util.ArrayList;

public class Sala {
    private int numeroSala;
    private int capacidad;
    private ArrayList<Funcion> funciones = new ArrayList<>();
    public Sala(int numeroSala, int capacidad) {
        this.numeroSala = numeroSala;
        this.capacidad = capacidad;
    }
    public int getNumeroSala() {
        return numeroSala;
    }
    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }
    public void setFunciones(ArrayList<Funcion> funciones) {
        this.funciones = funciones;
    }
    @Override
    public String toString() {
        return "Sala{" +
                "numeroSala=" + numeroSala +
                ", capacidad=" + capacidad +
                '}'
                + "\nFunciones: " + funciones;
    }
}
