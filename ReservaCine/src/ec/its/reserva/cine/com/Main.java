
package ec.its.reserva.cine.com;

public class Main {

    /*public static void main(String[] args) {
        Reserva reserve = new Reserva();
        Ticket ticket1=new Ticket ();
        Sala sala2=new Sala (); 
        Pelicula pelicula2=new Pelicula ();
        ClienteNormal clienteNormal = new ClienteNormal();
        reserve.imprimirReservaClienteNormal(reserve.asignarValores(), clienteNormal.asignarValores(),ticket1.asignarValoresTicketClienteNormal(),sala2.asignarvalores(),pelicula2.asignarValores());
        Afiliado afiliado1 = new Afiliado ();
        Sala sala1= new Sala ();
        Pelicula pelicula1=new Pelicula ();
        reserve.imprimirReservaAfiliado(reserve.asignarValoresReservas(), afiliado1.asignarValoresAfiliado(), ticket1.asignarValores(), sala1.asignarvalores(), pelicula1.asignarValores());   
        System.out.println("BIENVENIDO ");

        System.out.println("\n ***REALIZADO POR PATRICIO PUCHA***");
    }  */ 
    public static void main(String[] args) {
        Reserva reserva1=new Reserva();
        Afiliado afiliado=Afiliado.asignarValoresAfiliadoStatic();
        reserva1.imprimirReservaAfiliado(Reserva.asignarValoresReservasAfiliado(),
        afiliado, Ticket.asignarValoresAfiliadoStatic(), Pelicula.seleccionarPelicula(Afiliado.edadUsuario),Sala.asignarvaloresAfiliadoStatic());
    }
    
}

