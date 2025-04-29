import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        TicketSoporte ticket1 = new TicketSoporte("Problema con la impresora");
        TicketSoporte ticket2 = new TicketSoporte("Problema para conectarse a internet");
        TicketSoporte ticket3 = new TicketSoporte("Problema con la pantalla de la pc 24");
        TicketSoporte ticket4 = new TicketSoporte("Problema con paquete de office");
        TicketSoporte ticket5 = new TicketSoporte("reiniciar credenciales de acceso");
        TicketSoporte ticket6 = new TicketSoporte("Problemas en el inicio de sesion");
        TicketSoporte ticket7 = new TicketSoporte("Problemas con el correo electronico de la empresa");
        TicketSoporte ticket8 = new TicketSoporte("Problemas con la impresora de la sala de reuniones");
        TicketSoporte[] listaDeTickets = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket8};
        SistemaSoporte sistemaSoporte = new SistemaSoporte();
        for (TicketSoporte ticket : listaDeTickets) {
            sistemaSoporte.getTickets().add(ticket);
        }   
        sistemaSoporte.crearTicket("Actualizacion del sistema operativo");
        
        Usuario usuarioLeo = new Usuario(1, "Leonardo", "Gomez", "Lfglfg0804@gmail.com");
        Usuario usuarioJuan = new Usuario(2, "Juan", "Perez", "juancito@gmail.com");
        Tecnico tecnicoCarlitos = new Tecnico("Carlitos", "Gonzalez", "Soporte");

        
        //Asigno los usuarios a los tickets
        for (TicketSoporte ticket : sistemaSoporte.getTickets()){
            if(ticket.getIdTicket() <= 5){
                ticket.setUsuario(usuarioLeo);
            }else{
                ticket.setUsuario(usuarioJuan);
            }
        }
        
        //Asigno los tickets a los tecnicos
        for(TicketSoporte ticket : sistemaSoporte.getTickets()){
            if(ticket.getIdTicket() % 2 == 0){
                ticket.asignarTecnico(tecnicoCarlitos);}
        }

  
        ticket2.cerrarTicket();
        ticket3.cerrarTicket();
        ticket8.cerrarTicket();
        

       /*  for (TicketSoporte ticket : sistemaSoporte.getTickets()) {
            ticket.mostrarDetalle();         }
        }*/

        //sistemaSoporte.mostrarTicketsAsignados();
        //sistemaSoporte.mostrarTicketsAbiertos();
        sistemaSoporte.mostrarTicketsCerrados();

    
    }
}