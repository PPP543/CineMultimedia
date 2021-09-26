package ec.its.reserva.cine.com;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PAUL
 */
public class Factura {

    public static void generarFactura(boolean esAfiliado, Double precioAfiliado, Integer cantidadAsientos, Afiliado afiliado) {

        if (esAfiliado == true) {
            System.out.println("****DETALLE FACTURA****");
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese su número de identificación para la Factura");
            String identificacion = String.valueOf(sc.nextLine());
            System.out.println("  No. 001-003-000034652");
            System.out.println("  Identificación: " + identificacion);
            System.out.println("  Fecha emisión: " + new Date());
            System.out.println("  Nombre: "+afiliado.getNombre());
            System.out.println("  Cantidad asientos:" + Pelicula.cantidadAsiento);
            Double subtotal = cantidadAsientos * precioAfiliado;
            System.out.println("  Subtotal:" + subtotal);
            Double iva = subtotal * 0.12;
            System.out.println("  IVA:" + iva);
            Double total = subtotal + iva;
            System.out.println("  Total factura: " + total);
        }
    }
}
