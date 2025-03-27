public class Estudiante {
    private String nombre,apellido,curso;
    private double calificacion;
    
    public Estudiante(){}

    public Estudiante(String nombre, String apellido, String curso, double calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public double getCalificacion(){
        return calificacion;
    }
    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }
    public String toString(){
        return "Nombre: "+nombre+" "+apellido+"\nCurso: "+curso+"\nCalificacion: "+calificacion;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+" "+apellido);
        System.out.println("Curso: "+curso);
        System.out.println("Calificacion: "+calificacion);
    }
    public void subirCalificacion(double calificacion){
        if(calificacion > 0 && calificacion+this.calificacion <= 10){
            this.calificacion += calificacion;
            
        }else if(calificacion < 0){
            System.out.println("la calificacion no puede ser negativa");
        }else{
            this.calificacion = 10;
        }
        }

    public void bajarCalificacion(double calificacion){
        if(calificacion > 0 && this.calificacion-calificacion >= 0){
            this.calificacion -= calificacion;
        }else if(calificacion < 0){
            System.out.println("la calificacion no puede ser negativa");
        }else{
            this.calificacion = 0;
        }
    }
    
}
