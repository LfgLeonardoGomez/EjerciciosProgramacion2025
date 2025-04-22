package Relaciones;

import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private int numero;
    private String denominacion;
    private List<DivisionCurso> divisionCursos = new ArrayList();

    public Escuela() {
    }

    public Escuela(int numero, String denominacion) {
        this.numero = numero;
        this.denominacion = denominacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<DivisionCurso> getDivisionCursos() {
        return divisionCursos;
    }

    public void setDivisionCursos(List<DivisionCurso> divisionCursos) {
        this.divisionCursos = divisionCursos;
    }

    /*A.5- Codifique en la clase Escuela un método denominado
“public Alumno getMejorAlumnoEscuela(int
anioNacimientoAlumno)” que retorne el mejor alumno de la escuela,
cuya fecha de nacimiento sea de un año determinado y que nunca hayan
desaprobado exámenes */

    public Alumno getMejorAlumnoEscuela(int anioNacimientoAlumno){
    Alumno mejorAlumno=null;
    for (DivisionCurso divisionCurso : divisionCursos) {
        for (Catedra catedra : divisionCurso.getCatedras()) {
            for (Alumno alumno : catedra.getAlumnos()) {
                
                if (alumno.getFechaNacimiento().getYear() == anioNacimientoAlumno) {
                    for(Nota nota : alumno.getNotas()){
                        if(nota.isEsRecuperatorio()==true || nota.getValor()<4){
                            break;
                    
                        }else{
                            if(mejorAlumno==null || mejorAlumno.promedioNotas(catedra.getCodigo())<alumno.promedioNotas(catedra.getCodigo())){
                                mejorAlumno=alumno;
                            }
                        }
                    
                }
            }
        }
    }


    
    }
    return mejorAlumno;
    }

  /*  A.6- Codifique en la clase Escuela un método denominado
“public List<Alumno> getMejoresAlumnos(int
anioNacimientoAlumno)” que retorne un listado de los 3 mejores
lumnos, cuya fecha de nacimiento sea de un año determinado y que
nunca hayan desaprobado exámenes.*/

    public List<Alumno> getMejoresAlumnos(int anioNacimientoAlumno){
        List<Alumno> mejoresAlumnos = new ArrayList<>();
        for (DivisionCurso divisionCurso : divisionCursos) {
            for (Catedra catedra : divisionCurso.getCatedras()) {
                for (Alumno alumno : catedra.getAlumnos()) {
                    
                    if (alumno.getFechaNacimiento().getYear() == anioNacimientoAlumno) {
                        for(Nota nota : alumno.getNotas()){
                            if(nota.isEsRecuperatorio()==true || nota.getValor()<4){
                                break;
                        
                            }else{
                                if(mejoresAlumnos.size()<3){
                                    mejoresAlumnos.add(alumno);
                                }else{
                                    for(Alumno mejorAlumno : mejoresAlumnos){
                                        if(alumno.promedioNotas(catedra.getCodigo())>mejorAlumno.promedioNotas(catedra.getCodigo())){
                                            mejoresAlumnos.remove(mejorAlumno);
                                            mejoresAlumnos.add(alumno);
                                        }
                                    }
                                }
                            }
                        
                    }
                }
            }
        }
    }
        return mejoresAlumnos;
    }

    





}
