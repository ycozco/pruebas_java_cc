package Ejercicio5;

public class HabitacionDeluxe extends Habitacion {
    public HabitacionDeluxe(int numeroHabitacion, double precioPorNoche) {
        super(numeroHabitacion, precioPorNoche);
    }

    @Override
    public double calcularCosto(int diasReserva) {
        // Supongamos que las habitaciones Deluxe tienen un 10% de descuento
        return 0.9 * diasReserva * getPrecioPorNoche();
    }
}
