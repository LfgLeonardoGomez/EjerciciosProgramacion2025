import java.util.ArrayList;

public class Cine {
    private String nombre;
    private String direccion;
    private ArrayList<Empleado> empleados;
    private ArrayList<Sala> salas;
    private ArrayList<SalaVip> salasVip;
    private ArrayList<Compra> compras;
    private ArrayList<Venta> ventas;
    private ArrayList<Pelicula> peliculas;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.salasVip = new ArrayList<>();
        this.compras = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.peliculas = new ArrayList<>();
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
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    public ArrayList<Sala> getSalas() {
        return salas;
    }
    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    public ArrayList<SalaVip> getSalasVip() {
        return salasVip;
    }
    public void setSalasVip(ArrayList<SalaVip> salasVip) {
        this.salasVip = salasVip;
    }
    public ArrayList<Compra> getCompras() {
        return compras;
    }
    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }
    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

}
