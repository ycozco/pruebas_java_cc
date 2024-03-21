package Ejercicio2;

public class CocheElectrico extends Coche{
    private int autonomiaBateria;

    public CocheElectrico (String modelo, String marca, int anio, int velocidadActual, boolean encendido, int autonomiaBateria){
        super(modelo, marca, anio, velocidadActual, encendido);
        this.autonomiaBateria = autonomiaBateria;
    }

    public void recargarBateria(){
        System.out.println("Recargando batería..");
    }

    @Override
    public void obtenerInformacion(){
        super.obtenerInformacion();
        System.out.println("Autonomia bateria: " + autonomiaBateria);
    }
}
