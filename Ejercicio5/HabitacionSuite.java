package Ejercicio5;

public class HabitacionSuite extends Habitacion {
    
    public HabitacionSuite (int numeroHabitacion, double precioPorNoche){
        super(numeroHabitacion, precioPorNoche);
    }

    @Override
    public double calcularCosto (int diasReserva){
        return diasReserva*this.getPrecioPorNoche();
    }
}
