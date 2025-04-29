import java.time.LocalDate;
import java.util.Date;

public class TicketVip extends Ticket{
    private String beneficio;

    public TicketVip(String codigo, double precio, LocalDate fechaEmision, String beneficio) {
        super(codigo, precio, fechaEmision);
        this.beneficio = beneficio;
    }
}
