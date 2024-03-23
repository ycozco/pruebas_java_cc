package Ejercicio5;

public class HabitacionEstandar extends Habitacion {
    
    public HabitacionEstandar(int numeroHabitacion, double precioPorNoche, boolean disponible) {
        super(numeroHabitacion, precioPorNoche, disponible);
    }

    public String getTipo() {
        return "Estandar";
    }

    @Override
    public double calcularCosto(int diasReserva) {
        return diasReserva * getPrecioPorNoche();
    }

    @Override
    public void obtenerInformacion() {
        super.obtenerInformacion();
        System.out.println("Tipo: Estandar");
    }


}
