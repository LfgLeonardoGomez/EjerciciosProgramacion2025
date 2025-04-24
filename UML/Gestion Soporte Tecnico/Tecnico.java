public class Tecnico {
    private static int contador=0;
    private int idTecnico;
    private String nombre;
    private String apellido;
    private String especialidad;

    public Tecnico(String nombre, String apellido, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.idTecnico = ++contador;
    }
    public int getIdTecnico() {
        return idTecnico;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "idTecnico=" + idTecnico +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
    
}
