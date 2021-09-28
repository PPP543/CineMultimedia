
package ec.its.reserva.cine.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Iniciando el proceso de reserva*****");
		System.out.println("Es afiliado?");
		System.out.println("Si su respuesta es SI favor teclear s. Caso contrario n");
		String esAfiliado = sc.nextLine();
		System.out.println("Favor ingresar lo siguientes datos: ");
		Reserva reserva1 = new Reserva();
		// transformo en un boolean lo que ingresa el usuario por teclado (Validadción cliente)
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
