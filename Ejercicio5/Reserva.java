package Ejercicio5;

import java.util.ArrayList;
import java.util.HashMap;

public class Reserva implements ServicioAdicional{
    private String cliente;
    private Habitacion habitacion;
    private int diasReserva;
    private HashMap <ServicioAdicional, double> serviciosAdicionales = new HashMap<>();

    public Reserva (String cliente, Habitacion habitacion, int diasReserva){
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.diasReserva = diasReserva;
    }

    @Override
    public void agregarServicio(ServicioAdicional servicio) {
        serviciosAdicionales.add(servicio);
    }

    
    public double calcularCostoTotal() {
        double costoTotal = habitacion.calcularCosto(diasReserva);
        for (ServicioAdicional servicio : serviciosAdicionales) {
            costoTotal+=servicio.calcularCostoAdicional();
        }
        return costoTotal;
    }

 

    public void mostrarDetalles () {
        System.out.println("Cliente: " + cliente + "\t Habitacion: " + habitacion.getNumeroHabitacion() + "\t Días de reserva: " + diasReserva);
        //System.out.println("Servicios adicionales: " + )
        System.out.println("Costo Total: " + habitacion.getPrecioPorNoche()*diasReserva);
    }

}
