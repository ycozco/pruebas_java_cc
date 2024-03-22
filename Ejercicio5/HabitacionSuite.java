package Ejercicio5;

public class HabitacionSuite extends Habitacion {
    
    public HabitacionSuite(int numeroHabitacion, double precioPorNoche) {
        super(numeroHabitacion, precioPorNoche);
    }

    @Override
    public double calcularCosto(int diasReserva) {
        // suite tiene un incremento del 15% en el precio por noche
        return diasReserva * getPrecioPorNoche()*1.15; // 
    }
}
