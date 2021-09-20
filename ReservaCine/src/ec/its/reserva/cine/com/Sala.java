package ec.its.reserva.cine.com;

public class Sala {

    private Integer idsala;
    private Integer nasiento;
    static int codigoSala = 0;
    static int numeroAsiento = 23;

    public Integer getIdsala() {
        return idsala;
    }

    public void setIdsala(Integer idsala) {
        this.idsala = idsala;
    }

    public Integer getNasiento() {
        return nasiento;
    }

    public void setNasiento(Integer nasiento) {
        this.nasiento = nasiento;
    }
    
    public static Sala asignarvaloresAfiliadoStatic()
    {
        Sala sala= new Sala ();
        //codigoSala++;
        numeroAsiento++;
        sala.setIdsala(codigoSala);
        sala.setNasiento(numeroAsiento);
        return sala;
    }
    
    public void seleccionarHorariosSalaUno(int horario, Pelicula pelicula){
        //Sala sala= new Sala ();
        codigoSala +=1;
        //sala.setIdsala(codigoSala);
        //System.out.println(sala.getIdsala());
        switch (horario) {
            case 1:
                pelicula.setHorario("10:00-12:00");
                break;
            case 2:
                pelicula.setHorario("14:00-16:00");
                break;
            case 3:
                pelicula.setHorario("18:00-20:00");
                break;
            case 4:
                pelicula.setHorario("20:00-22:00");
                break;
            case 0:
                System.out.println("Salir");
                break;
            default:
                System.out.println("No ha seleccionado una opción CORRECTA");
        }
    }
    
    public void mostrarHorariosSalaUno(){
        System.out.println("Horario 1--> 10:00-12:00");
        System.out.println("Horario 2--> 14:00-16:00");
        System.out.println("Horario 3--> 18:00-20:00");
        System.out.println("Horario 4--> 20:00-22:00");
    }
    public void seleccionarHorariosSalaDos(int horario, Pelicula pelicula){
        //Sala sala= new Sala ();
        codigoSala = codigoSala + 2;
        //sala.setIdsala(codigoSala);
        //System.out.println(sala.getIdsala());
        switch (horario) {
            case 1:
                pelicula.setHorario("11:00-12:40");
                break;
            case 2:
                pelicula.setHorario("13:00-14:40");
                break;
            case 3:
                pelicula.setHorario("15:00-16:40");
                break;
            case 4:
                pelicula.setHorario("17:00-18:40");
                break;
            case 0:
                System.out.println("Salir");
                break;
            default:
                System.out.println("No ha seleccionado una opción CORRECTA");
        }
    }
    
    public void mostrarHorariosSalaDos(){
        System.out.println("Horario 1--> 11:00-12:40");
        System.out.println("Horario 2--> 13:00-14:40");
        System.out.println("Horario 3--> 15:00-16:40");
        System.out.println("Horario 4--> 17:00-18:40");
    }
    public void seleccionarHorariosSalaTres(int horario, Pelicula pelicula){
        codigoSala +=3;
        switch (horario) {
            case 1:
                pelicula.setHorario("10:00-11:45");
                break;
            case 2:
                pelicula.setHorario("14:10-15:50");
                break;
            case 3:
                pelicula.setHorario("17:00-18:45");
                break;
            case 4:
                pelicula.setHorario("19:00-20:50");
                break;
            case 0:
                System.out.println("Salir");
                break;
            default:
                System.out.println("No ha seleccionado una opción CORRECTA");
        }
    }
    
    public void mostrarHorariosSalaTres(){
        System.out.println("Horario 1--> 10:00-11:45");
        System.out.println("Horario 2--> 14:00-15:50");
        System.out.println("Horario 3--> 17:00-18:45");
        System.out.println("Horario 4--> 19:00-20:50");
    }
    
    public void seleccionarHorariosSalaCuatro(int horario, Pelicula pelicula){
        codigoSala=codigoSala+4;
        switch (horario) {
            case 1:
                pelicula.setHorario("10:00-11:15");
                break;
            case 2:
                pelicula.setHorario("12:00-13:15");
                break;
            case 3:
                pelicula.setHorario("14:00-15:15");
                break;
            case 0:
                System.out.println("Salir");
                break;
            default:
                System.out.println("No ha seleccionado una opción CORRECTA");
        }
    }
    public void mostrarHorariosSalaCuatro(){
        System.out.println("Horario 1--> 10:00-11:15");
        System.out.println("Horario 2--> 12:00-13:15");
        System.out.println("Horario 3--> 14:00-15:15");
    }
}
