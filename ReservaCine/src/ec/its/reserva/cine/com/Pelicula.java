package ec.its.reserva.cine.com;

import java.util.Scanner;

public class Pelicula {

	private String titulo;
	private String genero;
	private String categoria;
	private String duracion;
	private String horario;

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	private Sala sala;

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	static Integer cantidadAsiento;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Pelicula asignarValores() {
		Pelicula pelicula = new Pelicula();
		pelicula.setTitulo("TITANIC");
		pelicula.setGenero("Romantica");
		pelicula.setCategoria("Mayores de 16 años");
		pelicula.setDuracion("90 minutos");
		return pelicula;
	}

	public static Pelicula asignarValoresAfiliadoStatic() {
		Pelicula pelicula = new Pelicula();
		pelicula.setTitulo("TITANIC");
		pelicula.setGenero("Romantica");
		pelicula.setCategoria("Mayores de 18 años");
		pelicula.setDuracion("90 minutos");
		return pelicula;
	}

	public static Pelicula seleccionarPelicula(int edad) {
		int respuesta = 0;
		boolean bandera = false;
		Pelicula pelicula = new Pelicula();
		Scanner sc = new Scanner(System.in);
		// do {
		System.out.println("Estimado Usuario Seleccione su película");
		// System.out.println("Edad usuario: -->" + edad);
		System.out.println("1. Rápidos y Furiosos 9");
		System.out.println("    Género: Acción");
		System.out.println("    Duración: 90 minutos");
		System.out.println("    Categoría: Mayores de 16 años");
		System.out.println("2. Black Widow");
		System.out.println("    Género: Ciencia Ficción");
		System.out.println("    Duración: 80 minutos");
		System.out.println("    Categoría: Mayores de 12 años");
		System.out.println("3. La última gran Estafa");
		System.out.println("    Género: Suspenso");
		System.out.println("    Duración: 90 minutos");
		System.out.println("    Categoría: Mayores de 18 años");
		System.out.println("4. Paw Patrol");
		System.out.println("    Género: Infatil");
		System.out.println("    Duración: 60 minutos");
		System.out.println("    Categoría: Apto para todo público");
		System.out.println("0. Salir");
		Sala sala = new Sala();
		respuesta = Integer.valueOf(sc.nextLine());
		switch (respuesta) {
		case 1:
			if (edad >= 16) {
				// System.out.println(" Rápidos y Furiosos");
				pelicula.setTitulo("Rápidos y Furiosos");
				pelicula.setGenero("Acción");
				pelicula.setCategoria("Mayores de 16 años");
				pelicula.setDuracion("90 minutos");
				System.out.println("Estimado usuario, favor seleccione el horario");
				sala.mostrarHorariosSalaUno();
				sc = new Scanner(System.in);
				respuesta = Integer.valueOf(sc.nextLine());
				sala.seleccionarHorariosSalaUno(respuesta, pelicula);
			} else {
				System.out.println("Estimado usuario la película seleccionada no cumple con la edad permitida");
			}
			bandera = true;
			break;
		case 2:
			if (edad >= 12) {
				pelicula.setTitulo("Black Widow");
				pelicula.setGenero("Ciencia ficción");
				pelicula.setCategoria("Mayores de 12");
				pelicula.setDuracion("80 minutos");
				System.out.println("Estimado usuario, favor seleccione el horario");
				sala.mostrarHorariosSalaDos();
				sc = new Scanner(System.in);
				respuesta = Integer.valueOf(sc.nextLine());
				sala.seleccionarHorariosSalaDos(respuesta, pelicula);
			} else {
				System.out.println("Estimado usuario la película seleccionada no cumple con la edad permitida");

			}
			bandera = true;
			break;
		case 3:
			if (edad >= 12) {
				pelicula.setTitulo("La última gran estafa");
				pelicula.setGenero("Acción/Ciencia ficción");
				pelicula.setCategoria("Mayores de 18 años");
				pelicula.setDuracion("90 minutos");
				sala.mostrarHorariosSalaTres();
				sc = new Scanner(System.in);
				respuesta = Integer.valueOf(sc.nextLine());
				sala.seleccionarHorariosSalaTres(respuesta, pelicula);
			} else {
				System.out.println("Estimado usuario la película seleccionada no cumple con la edad permitida");
			}
			bandera = true;
			break;
		case 4:
			// System.out.println("Paw Patrol");
			pelicula.setTitulo("Paw Patrol");
			pelicula.setGenero("Infantil");
			pelicula.setCategoria("Todo público");
			pelicula.setDuracion("60 minutos");
			sala.mostrarHorariosSalaCuatro();
			sc = new Scanner(System.in);
			respuesta = Integer.valueOf(sc.nextLine());
			sala.seleccionarHorariosSalaCuatro(respuesta, pelicula);
			bandera = true;
			break;
//			case 0:
//				System.out.println("Salir");
//				break;
		default:
			System.out.println("No ha seleccionado una opción CORRECTA");
		}
		// } while (respuesta != 0);
		if (bandera) {
			System.out.println("Ingrese cuantos asientos desea reservar:");
			cantidadAsiento = Integer.valueOf(sc.nextLine());
		}
		return pelicula;
	}

	/*
	 * static void showPatientMenu(){ int response = 0; do {
	 * System.out.println("\n\n"); System.out.println("Patient");
	 * System.out.println("1. Book an appointment");
	 * System.out.println("2. My appointments"); System.out.println("0. Return");
	 * 
	 * Scanner sc = new Scanner(System.in); response =
	 * Integer.valueOf(sc.nextLine());
	 * 
	 * switch (response){ case 1: System.out.println("::Book an appointment");
	 * break; case 2: System.out.println("::My appointments"); break; case 0:
	 * showMenu(); break; } }while (response != 0); }
	 */
}
