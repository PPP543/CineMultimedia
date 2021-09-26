
package ec.its.reserva.cine.com;

import java.util.Scanner;

public class ClienteNormal extends Cliente {

	static Double precio = 7.00;

	public ClienteNormal asignarValores() {
		ClienteNormal clienteNormal = new ClienteNormal();
		clienteNormal.setId(1);
		clienteNormal.setNombre("Jenny");
		clienteNormal.setApellido("Pucha");
		clienteNormal.setEdad(32);
		return clienteNormal;
	}

	public static ClienteNormal asignarValoresClienteNormalStatic(Scanner sc) {
		ClienteNormal cliente = new ClienteNormal();
		System.out.println("NOMBRE: ");
		cliente.setNombre(sc.nextLine());
		System.out.println("APELLIDO: ");
		cliente.setApellido(sc.nextLine());
		System.out.println("EDAD: ");
		cliente.setEdad(Integer.parseInt(sc.nextLine()));
		System.out.println("DIRECCIÓN: ");
		cliente.setDireccion(sc.nextLine());
		return cliente;
	}
}
