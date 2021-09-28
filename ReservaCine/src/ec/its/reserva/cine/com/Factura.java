package ec.its.reserva.cine.com;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PAUL
 */
public class Factura {

	public static void generarFactura(boolean esAfiliado, Integer cantidadAsientos, Afiliado afiliado, ClienteNormal clienteNormal) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su número de identificación para la Factura");
		String identificacion = String.valueOf(sc.nextLine());
		System.out.println("****DETALLE FACTURA****");
		Random r = new Random();
    	int low = 10000;
    	int high = 99999;
    	int secuencial = r.nextInt(high-low) + low;//asignacion de un numero randomico al secuencial de la factura
    	
		System.out.println("  No. 001-003-0000"+secuencial);
		System.out.println("  Identificación: " + identificacion);
		System.out.println("  Fecha emisión: " + new Date());
		
		if (esAfiliado == true) {
			System.out.println("  Nombre: " + afiliado.getNombreCompleto());
			System.out.println("  Dirección: " + afiliado.getDireccion());
			System.out.println("  Correo electrónico: " + afiliado.getCorreo());
		}else {
			System.out.println("  Nombre: " + clienteNormal.getNombreCompleto());
			System.out.println("  Dirección: " + clienteNormal.getDireccion());
			System.out.println("  Correo electrónico: " + afiliado.getCorreo());
		}
		System.out.println("  Cantidad asientos:" + Pelicula.cantidadAsiento);
		Double subtotal = 0D;
		if (esAfiliado == true) {
			System.out.println("  Precio unitario:" + Afiliado.precioAfiliado);
			subtotal = cantidadAsientos * Afiliado.precioAfiliado;
		} else {
			System.out.println("  Precio unitario:" + ClienteNormal.precio);
			subtotal = cantidadAsientos * ClienteNormal.precio;
		}
		System.out.println("  Subtotal:" + subtotal);
		Double iva = subtotal * 0.12;
		System.out.println("  IVA:" + iva);
		Double total = subtotal + iva;
		System.out.println("  Total factura: " + total);
	}
}
