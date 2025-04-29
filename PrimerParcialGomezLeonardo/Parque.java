import java.util.ArrayList;

public class Parque {
    private String nombre, direccion;
    private String horarioApertura, horarioCierre;
    private ArrayList<Atraccion> listaDeAtracciones;

    public Parque(String nombre, String direccion, String horarioApertura, String horarioCierre) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.listaDeAtracciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public ArrayList<Atraccion> getListaDeAtracciones() {
        return listaDeAtracciones;
    }

    public void setListaDeAtracciones(ArrayList<Atraccion> listaDeAtracciones) {
        this.listaDeAtracciones = listaDeAtracciones;
    }
  public Atraccion obtenerAtraccionMasVisitada()  {
    Atraccion atraccionMasVisitada=null;
    for(Atraccion atraccion : listaDeAtracciones) {
        if(atraccionMasVisitada==null || atraccion.getVisitanteEnCola()>atraccionMasVisitada.getVisitanteEnCola()){
            atraccionMasVisitada=atraccion;
        }
    }
    return atraccionMasVisitada;
  }
}
