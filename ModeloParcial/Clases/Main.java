import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1;
        int numero2;
        numero1=leer.nextInt();
        numero2=leer.nextInt();

        

        int resultado;
        resultado = numero1 * numero2;
        System.out.println(resultado);
    }
}
