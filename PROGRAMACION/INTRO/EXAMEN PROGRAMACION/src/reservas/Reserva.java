package reservas;
//HACEMOS EL package DE RESERVAS//
//CREAMOS LA CLASE Reserva Y AÑADIMOS SUS ATRIBUTOS//

public class Reserva {

    protected String nombreHotel;
    protected String nombreCliente;
    protected double precioPorNoche;
    protected int numNoches;

    //CONSTRUCTOR LLENO//
    public Reserva(String nombreHotel, String nombreCliente, double precioPorNoche, int numNoches) {
        this.nombreHotel = nombreHotel;
        this.nombreCliente = nombreCliente;
        this.precioPorNoche = precioPorNoche;
        this.numNoches = numNoches;
    }

    //CONSTRUCTOR VACIO//
    public Reserva() {
        this.nombreHotel = "";
        this.nombreCliente = "";
        this.precioPorNoche = 0.0;
        this.numNoches = 0;
    }

    //GETTERS Y SETTERS//
    public String getNombreHotel() { return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) { this.nombreHotel = nombreHotel;
    }

    public String getNombreCliente() { return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente;
    }

    public double getPrecioPorNoche() { return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) { this.precioPorNoche = precioPorNoche;
    }

    public int getNumNoches() { return numNoches;
    }

    public void setNumNoches(int numNoches) { this.numNoches = numNoches;
    }

    //METODO//
    public double calcularPrecio() {
        return precioPorNoche * numNoches;
    }

    @Override
    public String toString() {
        return "Reserva para " + nombreCliente + " (" + precioPorNoche + " €/noche)";
    }
}

























