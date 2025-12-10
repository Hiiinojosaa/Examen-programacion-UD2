package reservas;

public class ReservaHabitacion extends Reserva {

    private int numCamas;
    private boolean vistasAlMar;

    //CONSTRUCTOR LLENO//
    //INTRODUCIMOS TODOS LOS ATRIBUTOS//
    public ReservaHabitacion(String nombreHotel, String nombreCliente, double precioPorNoche, int numNoches, int numCamas, boolean vistasAlMar) {

        super(nombreHotel, nombreCliente, precioPorNoche, numNoches);
        this.numCamas = numCamas;
        this.vistasAlMar = vistasAlMar;
    }

    //CONSTRUCTOR VACIO//
    public ReservaHabitacion() {
        super();
        this.numCamas = 0;
        this.vistasAlMar = false;
    }

    //CONSTRUCTOR LLENO CON VALOR FIJO//
    //LE DAMOS EL VALOR 2 A num.camas//
    public ReservaHabitacion(String nombreHotel, String nombreCliente, double precioPorNoche, int numNoches, boolean vistasAlMar) {

        super(nombreHotel, nombreCliente, precioPorNoche, numNoches);
        this.numCamas = 2;
        this.vistasAlMar = vistasAlMar;
    }

    @Override
    public String toString() {
        return "Reserva de habitación con " + numCamas + " (" + precioPorNoche + " €/noche)";
    }
}
