public class Empleado{
private static int id=0;
private String nombre,puesto;
private double salario;
private int idEmpleado;
private static int totalEmpleados=0;

public Empleado(String nombre, String puesto, double salario){
this.nombre=nombre;
this.puesto=puesto;
this.salario=salario;
id++;
idEmpleado=id;
totalEmpleados++;
}
public Empleado(String nombre, String puesto){

this.nombre=nombre;
this.puesto=puesto;
this.salario=2000;
id++;
idEmpleado=id;
totalEmpleados++;
}
@Override
public String toString(){
return "Empleado: "+idEmpleado+" Nombre: "+nombre+" Puesto: "+puesto+" Salario: "+salario;

}

public void actualizarSalario(double aumento){
this.salario+=aumento;
}
public void actualizarSalario(int porcentaje){
this.salario+=salario*porcentaje/100;
}
public static void mostrarTotalEmpleados(){

System.out.println("Total de empleados: "+totalEmpleados);
}


}