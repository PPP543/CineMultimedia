package ec.its.reserva.cine.com;

import java.util.Date;

public class Reserva {
	private int codigoReserva;
	static int id = 150;

	public int getCodigoReserva() {
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
    
  public static Reserva asignarValoresReservasAfiliado(){
    Reserva reserve= new Reserva();
    reserve.setCodigoReserva(id++);
    reserve.setFechaReserva(new Date().toString());
    return reserve;
  }
    
  public Reserva asignarValores()
  {
    Reserva reservaNormal = new Reserva ();
    //reservaNormal.setReservaN("1123");
    reservaNormal.setFechaReserva("1/08/2021");

    return reservaNormal;
  }
    
    public void imprimirReservaClienteNormal(Reserva reserve, ClienteNormal clienteNormal, Ticket ticket, Sala sala, Pelicula pelicula){
        System.out.println("Reserva Cine");
        System.out.println("Cliente Nornmal");
        //System.out.println("RESERVA NO. "+reserve.getReservaN());
        System.out.println("Nombre Cliente: "+ clienteNormal.getNombre());
        System.out.println("Apellido: "+ clienteNormal.getApellido());
        System.out.println("Edad: "+clienteNormal.getEdad() );
        System.out.println("Precio Normal: "+ clienteNormal.getPrecionormal());
        System.out.println("Pelicula: "+ pelicula.getTitulo());
        System.out.println("Genero: "+ pelicula.getGenero());
        System.out.println("Duracion: "+ pelicula.getDuracion());
        System.out.println("No.Ticket: "+ ticket.getIdticket());
        System.out.println("Sala: "+ sala.getIdsala());
        System.out.println("Fecha: "+ reserve.getFechaReserva());
        
    }
    
    public void imprimirReservaAfiliado(Reserva reserve, Afiliado afiliado, Ticket ticket, Pelicula pelicula,Sala sala){
      if (null == pelicula.getTitulo() && "".equals(pelicula.getTitulo())) {
        System.out.println("\n****RESERVA CINE****");
        System.out.println("Cliente Afiliado");
        System.out.println("RESERVA NO. "+reserve.getCodigoReserva());
        System.out.println("Nombre: "+ afiliado.getNombre());
        System.out.println("Apellido: "+ afiliado.getApellido());
        System.out.println("Edad: "+afiliado.getEdad());
        System.out.println("Codigo Afiliado: "+ afiliado.getCodigoafiliado());
        //System.out.println("Precio Afiliado: "+ afiliado.getPrecioafiliado());
        System.out.println("Pelicula: "+ pelicula.getTitulo());
        System.out.println("Horario: "+ pelicula.getHorario());
        /*System.out.println("Duración: "+ pelicula.getDuracion());
        System.out.println("Genero: "+ pelicula.getGenero());
        System.out.println("Categoria: "+ pelicula.getCategoria());*/
        System.out.println("Ticket # : "+ticket.getIdticket());
        System.out.println("Sala #: "+sala.getIdsala());
        System.out.println("Fecha: "+reserve.getFechaReserva());
        Factura.generarFactura(true, Afiliado.precioAfiliado, Pelicula.cantidadAsiento, afiliado);
      }
    }
}