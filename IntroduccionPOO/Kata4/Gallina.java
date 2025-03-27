public class Gallina {
    private static int id=0;
    private int idGallina,edad, huevosPuestos;
    
    public Gallina(int edad){
        this.edad=edad;
        this.huevosPuestos=0;
        idGallina=++id;
    }
    public int getIdGallina(){
        return idGallina;
    }
    public int getEdad(){
        return edad;
    }
    public int getHuevosPuestos(){
        return huevosPuestos;
    }
    public void ponerHuevo(){
        huevosPuestos++;
    }
    public void ponerHuevo(int cantidad){
        huevosPuestos+=cantidad;
    }
    public void envejecer(){
        edad++;
    }
    public void mostrarInfo(){
        System.out.println("Gallina "+idGallina+" de "+edad+" años ha puesto "+huevosPuestos+" huevos");
    }



}
