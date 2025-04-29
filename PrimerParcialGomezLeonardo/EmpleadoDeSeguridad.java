import java.util.ArrayList;

public class EmpleadoDeSeguridad {
    private int idEmpleado;
    private String nombre;
    private ArrayList<String> especialidades;
    private ArrayList<Incidente> listaDeIncidentes;

    public EmpleadoDeSeguridad(int idEmpleado, String nombre) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.especialidades = new ArrayList<>();
        this.listaDeIncidentes = new ArrayList<>();
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<String> getEspecialidades() {
        return especialidades;
    }
    public void setEspecialidades(ArrayList<String> especialidades) {
        this.especialidades = especialidades;
    }
    public ArrayList<Incidente> getListaDeIncidentes() {
        return listaDeIncidentes;
    }
    public void setListaDeIncidentes(ArrayList<Incidente> listaDeIncidentes) {
        this.listaDeIncidentes = listaDeIncidentes;
    }
    public void agregarEspecialidad(String especialidad) {
        for (String esp : especialidades) {
            if (esp.equalsIgnoreCase(especialidad)) {
                System.out.println("La especialidad ya está registrada.");
            
            }else {
                this.especialidades.add(especialidad);
            }
        }
    }

    public void mostrarIncidentesReportados(){
        for (Incidente incidente : listaDeIncidentes) {
            if (incidente.getEstado() == EstadoDeIncidente.REPORTADO) {
                System.out.println(incidente.toString());
            }
        }
    }
}
