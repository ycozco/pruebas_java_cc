package Ejercicio5;

public class Habitacion {
    protected int numeroHabitacion;
    protected double precioPorNoche;

    public Habitacion (int numeroHabitacion, double precioPorNoche){
        this.numeroHabitacion = numeroHabitacion;
        this.precioPorNoche = precioPorNoche;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public abstract calcularCosto(int diasReserva);

    public void obtenerInformacion() {
        System.out.println("Numero de habitacion: " + numeroHabitacion + "\t Precio por noche: " + precioPorNoche);
    }
}