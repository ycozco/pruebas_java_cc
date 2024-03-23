package Ejercicio5;

public abstract class Habitacion {
    protected int numeroHabitacion;
    protected double precioPorNoche;
    protected boolean disponible;

    public Habitacion(int numeroHabitacion, double precioPorNoche, boolean disponible) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioPorNoche = precioPorNoche;
        this.disponible = disponible;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public abstract double calcularCosto(int diasReserva);

    public abstract String getTipo() ;

    public void obtenerInformacion() {
            System.out.println("Numero de habitacion: " + numeroHabitacion + " \nPrecio por noche: " + precioPorNoche + "\nDisponible: " + (disponible?"Sí":"No"));
    }
    
}
