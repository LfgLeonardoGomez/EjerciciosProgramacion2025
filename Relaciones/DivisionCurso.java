package Relaciones;

import java.util.ArrayList;
import java.util.List;

public class DivisionCurso {

    private int codigo;
    private int anio;
    private int division;
    private Escuela escuela;
    private List<Catedra> catedras = new ArrayList();

    public DivisionCurso() {
    }

    public DivisionCurso(int codigo, int anio, int division) {
        this.codigo = codigo;
        this.anio = anio;
        this.division = division;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

/*  A.4- Codifique en la clase DivisionCurso un método
denominado “public Alumno mejorAlumnoDivisionCurso()” que
retorne el alumno con mejor promedio de notas contemplando la
totalidad de cátedras, y cuyo promedio sea el resultante de al menos 5
examenes y que nunca haya recuperado. */

    public Alumno mejorAlumnoDivisionCurso(){
        Alumno mejorAlumno = null;
    
        for(Catedra catedra : catedras){
            for(Alumno alumno : catedra.getAlumnos()){
                
                if(alumno.getNotas().size()>5){
                    int suma=0;
                    int contador=0;

                    for(Nota nota : alumno.getNotas()){
                        if(nota.isEsRecuperatorio()){
                            break;
                        }
                        suma += nota.getValor();
                        contador++;}
                if(mejorAlumno == null || (suma/contador) > (mejorAlumno.promedioNotas(catedra.getCodigo()))){
                    mejorAlumno = alumno;
                }
            }
            }

        }
         return mejorAlumno;
    }





}
