
package ec.its.reserva.cine.com;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author PAUL
 */
public class Factura {
   
    public static void generarFactura(boolean esAfiliado, Double precioAfiliado, Integer cantidadAsientos)
    {
      Scanner ruc = new Scanner (System.in);
      System.out.println("Ingerse su cedula o RUC para la Factura");
      if(esAfiliado==true){
          Double subtotal=cantidadAsientos*precioAfiliado;
          Double iva=subtotal*0.12;
          Double total=subtotal+iva;
          System.out.println("Su factura es por: "+total);
      }
    }
}
