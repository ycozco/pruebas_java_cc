package Ejercicio6;

public class Coche extends Vehiculo{
    private int capacidad;

    public Coche (String placa, String marca, int anio, Motor motor, int capacidad){
        super(placa, marca, anio, motor);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
   
}
