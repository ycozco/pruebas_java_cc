package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Habitacion habitacionEstandar = new HabitacionEstandar(101, 100);
        Habitacion habitacionSuite = new HabitacionSuite(201, 200);
        Habitacion habitacionDeluxe = new HabitacionDeluxe(301, 300);

        Reserva reserva1 = new Reserva("Mario", habitacionDeluxe, 3);
        reserva1.mostrarDetalles();

    }
}

