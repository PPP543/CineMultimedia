
package ec.its.reserva.cine.com;

public class Ticket {
    private Integer idticket;
    static int id=1343;

    public Integer getIdticket() {
        return idticket;
    }

    public void setIdticket(Integer idticket) {
        this.idticket = idticket;
    }

    
    public Ticket asignarValores(){
        Ticket ticket = new Ticket ();
        ticket.setIdticket(13);
        return ticket;
    }
    
    public Ticket asignarValoresTicketClienteNormal(){
        Ticket ticket = new Ticket ();
        ticket.setIdticket(12);
        return ticket;
    }
    
    public static Ticket asignarValoresAfiliadoStatic(){
        Ticket ticket = new Ticket ();
        id++;
        ticket.setIdticket(id);
        return ticket;
    }
}
