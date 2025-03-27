
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    Empleado e1 = new Empleado("Juan", "Gerente", 5000);
    Empleado e2 = new Empleado("Maria", "Secretaria",3000);
    Empleado e3 = new Empleado("Pedro", "Contador", 4000);
    Empleado e4 = new Empleado("Ana", "Gerente", 6000);
    Empleado e5 = new Empleado("Luis","vendedor");
    Empleado e6 = new Empleado("Sofia","vendedor");
    Empleado e7 = new Empleado("Carlos","vendedor");
        Empleado[] empleados = {e1,e2,e3,e4,e5,e6,e7};

    for(Empleado em:empleados){
        System.out.println(em.toString());
    }
    System.out.println("---------------------------------------");
    System.out.println("Info despues del aumento de salarios");
    System.out.println("---------------------------------------");
    e1.actualizarSalario(10);
    e2.actualizarSalario(25);
    e3.actualizarSalario(5);
    e4.actualizarSalario(1000.);
    e5.actualizarSalario(580.);
    e6.actualizarSalario(700.);

    for(Empleado em:empleados){
        System.out.println(em.toString());
    }
    }
}
