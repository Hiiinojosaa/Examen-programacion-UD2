package reservas;
public class ReservaSuite extends Reserva {



    //AQUI CREAMOS UN TIPO DE Tipo tipo AÑADIENDO UN ENUM CON VALORES//
    private double suplemento;
    public enum Tipo {SILVER, GOLD, PLATINUM};
    private Tipo tipo;

    //CONSTRUCTOR COMPLETO CON TODOS LOS ATRIBUTOS//
    //AÑADIMOS SUPER PARA LLAMAR A LOS ATRIBUTOS DE LAS OTRAS CLASES//
    public ReservaSuite(String nombreHotel, String nombreCliente, double precioPorNoche, int numNoches, double suplemento, Tipo tipo) {
        super(nombreHotel, nombreCliente, precioPorNoche, numNoches);
        this.suplemento = suplemento;
        this.tipo = tipo;
    }

    //CONSTRUCTOR VACIO//
    public ReservaSuite() {
        super();
        this.suplemento = 0.0;
        this.tipo = Tipo.SILVER;
    }

    //GETTER Y SETTERS//
    public double getSuplemento() { return suplemento;
    }

    public void setSuplemento(double suplemento) { this.suplemento = suplemento;
    }


    public Tipo getTipo() { return tipo;
    }

    public void setTipo(Tipo tipo) { this.tipo = tipo;
    }

    public double getPrecioTotal() {
        return (precioPorNoche * numNoches) + suplemento;
    }

    @Override
    public String toString() {
        return "Reserva de suite " + tipo + " (" + precioPorNoche + " €/noche)";
    }
}
