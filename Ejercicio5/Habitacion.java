package Ejercicio5;

public abstract class Habitacion {
    protected int numeroHabitacion;
    protected double precioPorNoche;

    public Habitacion(int numeroHabitacion, double precioPorNoche) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioPorNoche = precioPorNoche;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public abstract double calcularCosto(int diasReserva);

    public void obtenerInformacion() {
        System.out.println("Numero de habitacion: " + numeroHabitacion + ", Precio por noche: " + precioPorNoche);
    }
}
