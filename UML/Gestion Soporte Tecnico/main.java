public class main{
    public static void main(String[] args) {
        TicketSoporte ticket = new TicketSoporte("Problema con la impresora");
        
        TicketSoporte ticket2 = new TicketSoporte("Problema para conectarse a internet");
        
        TicketSoporte ticket3 = new TicketSoporte("Problema con la pantalla de la pc 24");
        ticket.mostrarDetalle();  
        ticket2.mostrarDetalle();
        ticket3.mostrarDetalle();
        
       
       

        ticket.cerrarTicket();
        ticket.mostrarDetalle();

    }
}