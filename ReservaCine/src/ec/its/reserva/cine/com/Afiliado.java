package ec.its.reserva.cine.com;

import java.util.Random;
import java.util.Scanner;

public class Afiliado extends Cliente {

    //declaración de variables
    private int codigoafiliado;
    //Uso de Wrappers
    static Double precioAfiliado = 5.25;
    //creación variable estatica
    static boolean esAfiliado = false;

    //encapsualamiento
    public int getCodigoafiliado() {
    	Random r = new Random();
    	int low = 1000;
    	int high = 10000;
    	codigoafiliado = r.nextInt(high-low) + low;
        return codigoafiliado;
    }

    public void setCodigoafiliado(int codigoafiliado) {
        this.codigoafiliado = codigoafiliado;
    }

    public Afiliado asignarValoresAfiliado() {
        Afiliado afiliado1 = new Afiliado();
        afiliado1.setCodigoafiliado(1234);
        afiliado1.setNombre("Paul");
        afiliado1.setApellido("Pucha");
        afiliado1.setEdad(32);
        //afiliado1.setPrecioafiliado(4);
        return afiliado1;
    }
//implementación parametro Scanner como parametro en el método
    public static Afiliado asignarValoresAfiliadoStatic(Scanner sc) {
        Afiliado afiliado1 = new Afiliado();
        System.out.println("NOMBRES Y APELLIDOS: ");
        afiliado1.setNombreCompleto(sc.nextLine());
        System.out.println("EDAD: ");
        afiliado1.setEdad(Integer.parseInt(sc.nextLine()));
        System.out.println("DIRECCION: ");
        afiliado1.setDireccion(sc.nextLine());
        System.out.println("CORREO ELECTRONICO: ");
        afiliado1.setCorreo(sc.nextLine());
        return afiliado1;
    }
}
