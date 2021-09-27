package ec.its.reserva.cine.com;

import java.util.Date;
import java.util.Random;

public class Reserva {
	private int codigoReserva;

	public int getCodigoReserva() {
		Random r = new Random();
		int low = 100;
		int high = 500;
		codigoReserva = r.nextInt(high - low) + low;
		return codigoReserva;
	}

	public void setCodigoReserva(int codigoReserva) {
		this.codigoReserva = codigoReserva;
	}

	private String fechaReserva;

	public String getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(String fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public static Reserva asignarValoresReserva() {
		Reserva reserve = new Reserva();
		reserve.setFechaReserva(new Date().toString());
		return reserve;
	}

	public Reserva asignarValores() {
		Reserva reservaNormal = new Reserva();
		// reservaNormal.setReservaN("1123");
		reservaNormal.setFechaReserva("1/08/2021");

		return reservaNormal;
	}

	public void imprimirReservaClienteNormal(Reserva reserve, ClienteNormal clienteNormal, Pelicula pelicula,
			Sala sala) {
		if ("".equals(pelicula.getTitulo()) ||"".equals(pelicula.getHorario())) {
			System.out.println("\n *****Reserva no generada.*****");
		} else {
			System.out.println("\n********RESERVA CINE********");
			System.out.println("Cliente Normal");
			System.out.println("Nombres: " + clienteNormal.getNombreCompleto());
			System.out.println("Edad: " + clienteNormal.getEdad());
			System.out.println("Código cliente: " + clienteNormal.getId());
			System.out.println("Película: " + pelicula.getTitulo());
			System.out.println("Horario: " + pelicula.getHorario());
			System.out.println("Sala #: " + sala.getIdsala());
			System.out.println("Fecha: " + reserve.getFechaReserva());
			Factura.generarFactura(Afiliado.esAfiliado, Pelicula.cantidadAsiento, null, clienteNormal);
			System.out.println("*****Reserva generada exitosamente*****");
			System.out.println("*****Fin del proceso de reserva*****");
		}
	}

	public void imprimirReservaAfiliado(Reserva reserve, Afiliado afiliado, Pelicula pelicula, Sala sala) {
		if ("".equals(pelicula.getTitulo()) ||"".equals(pelicula.getHorario())) {
			System.out.println("\n *****Reserva no generada.*****");
		} else {
			System.out.println("\n********RESERVA CINE********");
			System.out.println("Cliente Afiliado");
			System.out.println("RESERVA NO. " + reserve.getCodigoReserva());
			System.out.println("Nombres: " + afiliado.getNombreCompleto());
			System.out.println("Edad: " + afiliado.getEdad());
			System.out.println("Código afiliado: " + afiliado.getId());
			System.out.println("Película: " + pelicula.getTitulo());
			System.out.println("Horario: " + pelicula.getHorario());
			System.out.println("Sala #: " + sala.getIdsala());
			System.out.println("Fecha: " + reserve.getFechaReserva());
			Factura.generarFactura(Afiliado.esAfiliado, Pelicula.cantidadAsiento, afiliado, null);
			System.out.println("*****Reserva generada exitosamente*****");
			System.out.println("*****Fin del proceso de reserva*****");
		}

	}
}