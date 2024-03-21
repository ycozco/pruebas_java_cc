package Ejercicio5;

public class HabitacionEstandar extends Habitacion {
    
    public HabitacionEstandar(int numeroHabitacion, double precioPorNoche) {
        super(numeroHabitacion, precioPorNoche);
    }

    @Override
    public double calcularCosto(int diasReserva) {
        return diasReserva * getPrecioPorNoche();
    }
}
