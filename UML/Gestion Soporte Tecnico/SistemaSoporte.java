import java.util.ArrayList;

public class SistemaSoporte {
    private ArrayList <TicketSoporte> tickets= new ArrayList<>();

    public SistemaSoporte() {
    }

    public ArrayList<TicketSoporte> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<TicketSoporte> tickets) {
        this.tickets = tickets;
    }
    
    public void crearTicket(String descripcion){
        TicketSoporte ticket = new TicketSoporte(descripcion);
        tickets.add(ticket);
    }
    public void crearTicket(String descripcion, Usuario usuario){
        TicketSoporte ticket = new TicketSoporte(descripcion, usuario);
        tickets.add(ticket);
    }

    public void asignarTecnico(int idTicket,Tecnico tecnico){
        for (TicketSoporte ticket : tickets) {
            if (ticket.getIdTicket() == idTicket) {
                ticket.setTecnico(tecnico);
                break;
            }
        }
    }

    public void mostrarTicketsAbiertos(){
        System.out.println("Tickets Abiertos:" + "\n" + "-----------------");
        for (TicketSoporte ticket : tickets) {
            if (ticket.getEstado() == Estado.ABIERTO) {
                ticket.mostrarDetalle();
            }
        }
    }
    public void mostrarTicketsCerrados(){
        System.out.println("Tickets Cerrados:" + "\n" + "-----------------");
        for (TicketSoporte ticket : tickets) {
            if (ticket.getEstado() == Estado.CERRADO) {
                ticket.mostrarDetalle();
            }
        }
    }
    public void mostrarTicketsAsignados(){
        System.out.println("Tickets en proceso:" + "\n" + "-----------------");
        for (TicketSoporte ticket : tickets) {
            if (ticket.getTecnico() != null) {
                ticket.mostrarDetalle();
            }
        }
    }

}
