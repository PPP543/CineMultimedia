
package ec.its.reserva.cine.com;

import java.util.Scanner;

public class Main {

	/*
	 * public static void main(String[] args) { Reserva reserve = new Reserva();
	 * Ticket ticket1=new Ticket (); Sala sala2=new Sala (); Pelicula pelicula2=new
	 * Pelicula (); ClienteNormal clienteNormal = new ClienteNormal();
	 * reserve.imprimirReservaClienteNormal(reserve.asignarValores(),
	 * clienteNormal.asignarValores(),ticket1.asignarValoresTicketClienteNormal(),
	 * sala2.asignarvalores(),pelicula2.asignarValores()); Afiliado afiliado1 = new
	 * Afiliado (); Sala sala1= new Sala (); Pelicula pelicula1=new Pelicula ();
	 * reserve.imprimirReservaAfiliado(reserve.asignarValoresReservas(),
	 * afiliado1.asignarValoresAfiliado(), ticket1.asignarValores(),
	 * sala1.asignarvalores(), pelicula1.asignarValores());
	 * System.out.println("BIENVENIDO ");
	 * 
	 * System.out.println("\n ***REALIZADO POR PATRICIO PUCHA***"); }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Iniciando el proceso de reserva*****");
		System.out.println("Es afiliado?");
		System.out.println("Si su respuesta es SI favor teclear s. Caso contrario n");
		String esAfiliado = sc.nextLine();
		System.out.println("Favor ingresar lo siguientes datos: ");
		Reserva reserva1 = new Reserva();
		// transformo en un boolean lo que ingresa el usuario por teclado
		if ("s".equalsIgnoreCase(esAfiliado)) {
			Afiliado.esAfiliado = Boolean.TRUE;
		}

		if (Afiliado.esAfiliado) {
			Afiliado afiliado = Afiliado.asignarValoresAfiliadoStatic(sc);
			reserva1.imprimirReservaAfiliado(Reserva.asignarValoresReserva(), afiliado,
					Pelicula.seleccionarPelicula(afiliado.getEdad()), Sala.asignarValoresSalaStatic());
		} else {
			ClienteNormal clienteNormal = ClienteNormal.asignarValoresClienteNormalStatic(sc);
			reserva1.imprimirReservaClienteNormal(Reserva.asignarValoresReserva(), clienteNormal,
					Pelicula.seleccionarPelicula(clienteNormal.getEdad()), Sala.asignarValoresSalaStatic());
		}
	}

}
