package Ejercicio2;

public class CocheFamiliar extends Coche{
    private int capacidadPasajeros;

    public CocheFamiliar (String modelo, String marca, int anio, int velocidadActual, boolean encendido, int capacidadPasajeros){
        super(modelo, marca, anio, velocidadActual, encendido);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void obtenerInformacion(){
        super.obtenerInformacion();
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);

    }
}
