package Ejercicio5;

public class HabitacionDeluxe extends Habitacion {
    public HabitacionDeluxe (int numeroHabitacion, double precioPorNoche){
        super(numeroHabitacion, precioPorNoche);
    }

    @Override
    public double calcularCosto (int diasReserva){
        return diasReserva*this.getPrecioPorNoche()*0.9;
    }
}
