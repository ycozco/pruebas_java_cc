package Ejercicio5;

public class HabitacionSuite extends Habitacion {
    
    public HabitacionSuite(int numeroHabitacion, double precioPorNoche, boolean disponible) {
        super(numeroHabitacion, precioPorNoche, disponible);
    }

    public String getTipo() {
        return "Suite";
    }

    @Override
    public double calcularCosto(int diasReserva) {
        // suite tiene un descuento del 20% en el precio por noche
        return diasReserva * getPrecioPorNoche()*0.80; // 
    }

    @Override
    public void obtenerInformacion() {
        super.obtenerInformacion();
        System.out.println("Tipo: " + this.getTipo());
    }

}
