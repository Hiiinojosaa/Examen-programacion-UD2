import reservas.ReservaHabitacion;
import reservas.ReservaSuite;
import reservas.ReservaSuite;

public class Main {
    public static void main(String[] args) {

        //HABITACION 1//
        //SIMPLEMENTE LE DAMOS LOS VALORES//
        ReservaHabitacion rh = new ReservaHabitacion(
                "Hotel Sol",
                "Ana López",
                60,
                8,
                2,
                true
        );
//IMPRIMIMOS POR CONSOLA//
        //UTILIZAMOS rh.calcularPrecio COMO VARIABLE Y LO IMPRIMIMOS POR CONSOLA//
        System.out.println("Precio habitación: " + rh.calcularPrecio());
        System.out.println(rh.toString());

        //HABITACION SUITE//
        ReservaSuite rs = new ReservaSuite(
                "Hotel Sol",
                "Carlos Pérez",
                80.54,
                2,
                50.0,
                ReservaSuite.Tipo.GOLD
        );

        System.out.println("Precio suite: " + rs.getPrecioTotal());
        System.out.println(rs.toString());
    }
}

