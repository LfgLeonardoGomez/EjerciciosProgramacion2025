public class SalaVip extends Sala {
 
    protected String beneficios;

public SalaVip(int numeroSala, int capacidad, String beneficios) {
        super(numeroSala, capacidad);
        this.beneficios = beneficios;
    } 

    public String getBeneficios() {
        return beneficios;
    } 

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    } 

    @Override
    public String toString() {
        return "SalaVip{" +
                "numeroSala=" + getNumeroSala() +
                ", capacidad=" + getCapacidad() +
                ", beneficios='" + beneficios + '\'' +
                '}';
    }

} 
