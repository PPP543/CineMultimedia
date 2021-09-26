package ec.its.reserva.cine.com;

import java.util.Scanner;

public class Afiliado extends Cliente {

    //declaración de variables
    private int codigoafiliado;
    //Uso de Wrappers
    static Double precioAfiliado = 5.25;
    //creación variable estatica
    static boolean esAfiliado = true;
    static int id = 0;
    static int edadUsuario = 0;

    //encapsualamiento
    public int getCodigoafiliado() {
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

    public static Afiliado asignarValoresAfiliadoStatic() {
        @SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
        System.out.println("ESTIMADO USUARIO POR FAVOR INGRESE SUS DATOS: ");
        Afiliado afiliado1 = new Afiliado();
        id++;
        afiliado1.setCodigoafiliado(id);
        System.out.println("NOMBRE: ");
        afiliado1.setNombre(scr.nextLine());
        System.out.println("APELLIDO: ");
        afiliado1.setApellido(scr.nextLine());
         System.out.println("EDAD2: ");
        afiliado1.setEdad(Integer.parseInt(scr.nextLine()));
        System.out.println("DIRECCIÓN: ");
        afiliado1.setDireccion(scr.nextLine());
        edadUsuario = afiliado1.getEdad();
        //System.out.println("APELLIDO: "+afiliado1.getApellido());
        //System.out.println("AFILIADO: "+afiliado1.getNombre()+ " " +afiliado1.getApellido());
        return afiliado1;
    }
}
