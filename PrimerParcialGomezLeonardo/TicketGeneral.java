import java.time.LocalDate;
import java.util.Date;

public class TicketGeneral extends Ticket {
    
    public TicketGeneral(String codigo, double precio, LocalDate fechaEmision) {
        super(codigo, precio, fechaEmision);
    }
}
