package Ejercicio5;

import java.util.HashMap;
import java.util.Map;
public class Reserva {
    private String cliente;
    private Habitacion habitacion;
    private int diasReserva;
    private HashMap<ServicioAdicional, Double> serviciosAdicionales = new HashMap<>();

    public Reserva(String cliente, Habitacion habitacion, int diasReserva) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.diasReserva = diasReserva;
    }

    public String getCliente() {
        return cliente;
    }
    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void agregarServicioAdicional(ServicioAdicional servicio, double costo) {
        serviciosAdicionales.put(servicio, costo);
    }

    public double calcularCostoTotal() {
        double costoTotal = habitacion.calcularCosto(diasReserva);
        for (Double costo : serviciosAdicionales.values()) {
            costoTotal += costo;
        }
        return costoTotal;
    }



    public void mostrarDetalles() {

        /*
* Map<String, Integer> mapa = new HashMap<>();
mapa.put("manzanas", 10);
mapa.put("plátanos", 5);
mapa.put("peras", 8);

for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
    String clave = entrada.getKey(); // Obtiene la clave
    Integer valor = entrada.getValue(); // Obtiene el valor
    System.out.println(clave + " -> " + valor);
}


         */
        System.out.println("Cliente: " + cliente);
        habitacion.obtenerInformacion();
        System.out.println("Días de reserva: " + diasReserva);
        if (!serviciosAdicionales.isEmpty()) {
            System.out.println("Servicios adicionales:");
            //serviciosAdicionales.forEach((servicio, costo) -> System.out.println(servicio + ": $" + costo));
            for (Map.Entry<ServicioAdicional, Double> entrada : serviciosAdicionales.entrySet()) {
                ServicioAdicional servicio = entrada.getKey();
                Double costo = entrada.getValue();
                System.out.println(servicio + ": $" + costo);
            }
            
            
        }
        System.out.println("Costo Total: $" + calcularCostoTotal() + "\n");
    }
}
