package Ejercicio6;
import java.util.ArrayList;

public class Flota {
    String nombre;
    private ArrayList <Vehiculo> flota = new ArrayList<>();

    public Flota(String nombre) {
        this.nombre = nombre;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        flota.add(vehiculo);
    }



}
