public class NaveEspacial {
    private String nombre;
    private int combustible;
    
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCombustible() {
        return combustible;
    }
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    public void despegar() {
        if (combustible >= 10) {
            System.out.println("Despegando...");
            combustible -= 10;
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }
    public void avanzar(int distancia){
        if(distancia<0){
            System.out.println("No se puede avanzar una distancia negativa.");
        }else if (distancia<=combustible){
            System.out.println("Avanzando..."+distancia+" kilometros.");
            combustible -= distancia;
        } else {
            System.out.println("No hay suficiente combustible para avanzar.");
        }
    }

    public void recargarCombustible(int cantidad){
        if(cantidad<0){
            System.out.println("No se puede recargar una cantidad negativa.");
        }else if (cantidad+combustible>=100){
            System.out.println("Recargando...Tanque lleno, se pudo cargar "+(100-combustible)+" litros.");
            combustible=100;
        }else{
            System.out.println("Recargando..."+cantidad+" litros.");
            combustible+=cantidad;
        }
}
public void mostrarEstado(){
    int estado=combustible/10;
    System.out.println("Nave: "+nombre);
    System.out.println("Combustible: "+combustible+" litros.");
    System.out.print("Estado del combustible: ");

    for(int i=0;i<10;i++){
        if(i<estado){
            System.out.print("[X]");
        }else{
            System.out.print("[ ]");
        }
    }
}
}







