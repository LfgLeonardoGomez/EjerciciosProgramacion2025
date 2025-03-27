public class Main {
    public static void main(String[] args) {
    
        Gallina gallina1 = new Gallina(1);
        Gallina gallina2 = new Gallina(2);
        Gallina gallina3 = new Gallina(3);
        
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina2.ponerHuevo(5);
        gallina2.ponerHuevo();
        gallina3.ponerHuevo(3);

        gallina1.envejecer();
        gallina2.envejecer();

        gallina1.mostrarInfo();
        gallina2.mostrarInfo();
        gallina3.mostrarInfo();

    }
}
