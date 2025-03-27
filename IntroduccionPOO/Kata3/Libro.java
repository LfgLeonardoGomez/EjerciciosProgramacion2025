
import java.time.LocalDate;
import java.util.Date;

public class Libro {
    private String titulo, autor;
    private int anioPublicacion;

    public Libro(){}

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion<1900 || anioPublicacion>LocalDate.now().getYear()){
            System.out.println("Año de publicación inválido");
            }else {
                this.anioPublicacion = anioPublicacion;
            }
        
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInfo(){
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Año de publicación: "+anioPublicacion);
    }
}
