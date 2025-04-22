package Relaciones;

import java.util.ArrayList;
import java.util.List;

public class Catedra {

    private int codigo;
    private String denominacion;
    private DivisionCurso divisionCurso;
    private List<Alumno> alumnos = new ArrayList();
    private List<Nota> notas = new ArrayList();

    public Catedra() {
    }

    public Catedra(int codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public DivisionCurso getDivisionCurso() {
        return divisionCurso;
    }

    public void setDivisionCurso(DivisionCurso divisionCurso) {
        this.divisionCurso = divisionCurso;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

 public Alumno mejorAlumnoCatedra(){
    if (alumnos == null || alumnos.isEmpty()) {
        return null;
    }
        Alumno mejorAlumno = alumnos.get(0);
        
        for (Alumno alumno : alumnos) {
            if (alumno.promedioNotas(this.codigo) > mejorAlumno.promedioNotas(this.codigo)) {
                mejorAlumno = alumno;
            }
        }
            return mejorAlumno;
    }


}
