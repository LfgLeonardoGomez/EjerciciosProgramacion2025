import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Ticket ticketGeneral= new TicketGeneral("T001", 100.0, LocalDate.now());
        Ticket ticketVip= new TicketVip("T002", 200.0, LocalDate.now(), "Acceso a todo el parque"); 
        Visitante visitante1= new Visitante ("Leo", 35555555, 35 );
        visitante1.setTicket(ticketGeneral);

        Horario horarioLunes= new Horario("lunes" ,"10:00", "18:00");
        Horario horarioMartes= new Horario("martes" ,"10:00", "18:00");
        Horario horarioMiercoles= new Horario("miercoles" ,"10:00", "18:00");
        Horario horarioJueves= new Horario("jueves" ,"10:00", "18:00");
        Horario horarioViernes= new Horario("viernes" ,"9:00", "20:00");
        Horario horarioSabado= new Horario("sabado" ,"9:00", "20:00");
        ArrayList<Horario> horarios= new ArrayList<>();
        horarios.add(horarioLunes); 
        horarios.add(horarioMartes);
        horarios.add(horarioMiercoles);
        horarios.add(horarioJueves);
        horarios.add(horarioViernes);
        horarios.add(horarioSabado);


        Atraccion montaniaRusa= new Atraccion("Montaña Rusa", 50, 30, TipoDeAtraccion.MECANICA);
        Atraccion toboganDeAgua= new Atraccion("Tobogán de Agua", 30, 20, TipoDeAtraccion.ACUATICA);
        Atraccion calesita= new Atraccion("Calesita", 20, 10, TipoDeAtraccion.INFANTIL);
    
        montaniaRusa.setListaDeHorarios(horarios);
        toboganDeAgua.setListaDeHorarios(horarios);    
        calesita.setListaDeHorarios(horarios);

        EmpleadoDeSeguridad empleadoJuan= new EmpleadoDeSeguridad (1,"Juan");
        empleadoJuan.agregarEspecialidad("Tecnico electricista");
        empleadoJuan.agregarEspecialidad("Tecnico en seguridad industrial");

        Incidente incidente1 = new Incidente (LocalDate.of(2025, 04, 26), "Fuego en la montaña rusa", EstadoDeIncidente.REPORTADO, montaniaRusa, visitante1);
        Incidente incidente2 = new Incidente (LocalDate.of(2025, 03, 28), "caballo con tornillos flojos en calesita", EstadoDeIncidente.REPORTADO, calesita, visitante1);
        Incidente incidente3 = new Incidente (LocalDate.of(2025, 02, 15), "Fuga de agua", EstadoDeIncidente.REPORTADO, toboganDeAgua, visitante1);
        empleadoJuan.getListaDeIncidentes().add(incidente1);
        empleadoJuan.getListaDeIncidentes().add(incidente2);
        empleadoJuan.getListaDeIncidentes().add(incidente3);

        Reporte reporte1 = new Reporte (1, "Incidentes reportados por el empleado Juan", LocalDate.of(2025, 04,30));
        reporte1.getListaDeIncidentes().add(incidente1);
        reporte1.getListaDeIncidentes().add(incidente2);
        reporte1.getListaDeIncidentes().add(incidente3);

        Mantenimiento mantenimiento1= new Mantenimiento (LocalDate.of(2025, 06, 05),"mantenimiento a la montaña rusa");
        
    
    }
}
