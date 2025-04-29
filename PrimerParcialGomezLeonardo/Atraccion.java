import java.util.ArrayList;

public class Atraccion {
    private String nombre;
    private int capacidad;
    private int tiempoDuracion;
    private TipoDeAtraccion tipoDeAtraccion;
    private int visitanteEnCola;
    private ArrayList<AtraccionTecnico> listaDeTecnicos;
    private ArrayList<Horario> listaDeHorarios;
    private ArrayList<Mantenimiento> listaDeMantenimientos;

    public Atraccion(String nombre, int capacidad, int tiempoDuracion, TipoDeAtraccion tipoDeAtraccion) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tiempoDuracion = tiempoDuracion;
        this.tipoDeAtraccion = tipoDeAtraccion;
        this.visitanteEnCola = 0;
        this.listaDeTecnicos = new ArrayList<>();
        this.listaDeHorarios = new ArrayList<>();
        this.listaDeMantenimientos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public TipoDeAtraccion getTipoDeAtraccion() {
        return tipoDeAtraccion;
    }

    public void setTipoDeAtraccion(TipoDeAtraccion tipoDeAtraccion) {
        this.tipoDeAtraccion = tipoDeAtraccion;
    }

    public int getVisitanteEnCola() {
        return visitanteEnCola;
    }

    public void setVisitanteEnCola(int visitanteEnCola) {
        this.visitanteEnCola = visitanteEnCola;
    }

    public ArrayList<AtraccionTecnico> getListaDeTecnicos() {
        return listaDeTecnicos;
    }

    public void setListaDeTecnicos(ArrayList<AtraccionTecnico> listaDeTecnicos) {
        this.listaDeTecnicos = listaDeTecnicos;
    }

    public ArrayList<Horario> getListaDeHorarios() {
        return listaDeHorarios;
    }

    public void setListaDeHorarios(ArrayList<Horario> listaDeHorarios) {
        this.listaDeHorarios = listaDeHorarios;
    }

    public ArrayList<Mantenimiento> getListaDeMantenimientos() {
        return listaDeMantenimientos;
    }

    public void setListaDeMantenimientos(ArrayList<Mantenimiento> listaDeMantenimientos) {
        this.listaDeMantenimientos = listaDeMantenimientos;
    }

    public int calcularTiempoDeEspera() {
        return (visitanteEnCola / capacidad) * tiempoDuracion;
    }
}
